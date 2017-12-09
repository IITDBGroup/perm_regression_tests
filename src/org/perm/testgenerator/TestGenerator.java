package org.perm.testgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;

import org.perm.testgenerator.dataset.DataAndQueryGenerator;

public class TestGenerator {

	public static int settingNum;
	
	private static String PACKAGE_NAME = "org.perm.autotests";
	private static String packageDir = "";
	private static String testMethodString = "\n\n\t@Test\n"
		    + "\tpublic void testNAME () throws SQLException, Exception {\n"
		    + "\t\ttestSingleQuery(NUM);\n"
		    + "\t}\n";
	
	private HashMap<String,PermSuite> suites;
	private String TestCase;
	private String TestSuite;
	private String OptionsTestCase;
	private File testDir;
	private String packageName;
	private PermSuite allTests;
	
	public TestGenerator (File testDir, String packageName) throws IOException {
		this.testDir = testDir;
		ConnectionOptions.getInstance().setPath(testDir.getPath());
		OptionsManager.getInstance().reloadOptions();
		
		this.packageName = packageName; 
		
		TestCase = readString ("resource/TestTemplates/TestCase.java");
		TestSuite = readString ("resource/TestTemplates/TestSuite.java");
		OptionsTestCase = readString ("resource/TestTemplates/TestCaseSetOptions.java");
		
		packageDir = packageName.replaceAll("\\.", "/");
	}
	
	public static void main (String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		TestGenerator gen;
		File dir;
		
		dir = new File ("resource/sql/");
		gen = new TestGenerator (dir, PACKAGE_NAME);
		gen.generateTests();
		gen.generateOptionsSuites();
		
		dir = new File ("resource/tpchValidation/");
		gen = new TestGenerator (dir, "org.perm.autotests.tpch");
		gen.generateTests();
		gen.generateOptionsSuites();
		
		dir = new File ("resource/wherecs/");
		gen = new TestGenerator (dir, "org.perm.autotests.wherecs");
		gen.generateTests();
		gen.generateOptionsSuites();
		
		dir = new File ("resource/howcs/");
		gen = new TestGenerator (dir, "org.perm.autotests.howcs");
		gen.generateTests();
		gen.generateOptionsSuites();
	}
	
	public void generateTests () throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		for (int i = 0; i < OptionsManager.getInstance().getNumSettings(); i++) {
			settingNum = i + 1;
			
			suites = new HashMap<String,PermSuite> ();
			allTests = new PermSuite ("AllTests_" + settingNum);
			suites.put("allTests_" + settingNum, allTests);
			//allTests.addChild(new PermSuite("SetOptions_" + (i + 1)));
			
			generateTestRun();
		}
	}
	
	public void generateTestRun () throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		File[] files;
		DataAndQueryGenerator generator;
		String name;
		
		files = testDir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			name = files[i].getName();
			
			if (name.compareTo("template.xml") != 0 && name.compareTo("settings.xml") != 0  && name.endsWith(".xml")) {
				name = name.substring(0, name.length() - 4);
				
				generateSuitesFromFileName (name);
				
				System.out.println("create Generator for " + name);
				generator = new DataAndQueryGenerator (files[i].getAbsolutePath());
				generateTest (generator, name);	
			}
		}
		
		finalizeSuites ();
	}
	
	public void generateOptionsSuites () throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		PermSuite optionSuite;
		String output;
		
		optionSuite = new PermSuite ("AllTestsOptions");
		
		for (int i = 0; i < OptionsManager.getInstance().getNumSettings(); i++) {
			generateSetOption (i + 1);
			optionSuite.addChildWithDupes(new PermSuite("AllTests_" + (i + 1)));
		}
		
		output = TestSuite;
		output = output.replace("PACKAGE", packageName);
		output = output.replace("NAME", optionSuite.getName());
		output = output.replace("CHILDREN", optionSuite.getClassText());
		
		writeFile(optionSuite.getName(), output);
	}
	
	private void generateSetOption (int optionNum) throws IOException {
		String output;
		
		output = OptionsTestCase;
				
		output = output.replace("PACKAGE", packageName);
		output = output.replaceAll("NAME", "SetOptions_" + optionNum);
		output = output.replace("SETTING", "" + optionNum);
		
		writeFile("SetOptions_" + optionNum, output);
	}
	
	private void finalizeSuites () throws IOException {
		java.util.Iterator<String> iter;
		PermSuite suite;
		String output;
		
		allTests.addChild(new PermSuite("ReportPrinter"));
		iter = suites.keySet().iterator();
		
		while (iter.hasNext()) {
			suite = suites.get(iter.next());
			
			if (suite.getChildren().size() > 0) {
				output = TestSuite;
				output = output.replace("PACKAGE", packageName);
				output = output.replace("NAME", suite.getClassName());
				output = output.replace("CHILDREN", suite.getClassText());
				
				writeFile(suite.getClassName(), output);
			}
		}
	}
	
	
	
	private void generateTest (DataAndQueryGenerator generator, String name) throws IOException {
		String output;
		StringBuffer tests;
		PermSuite suite;
		String runName;
		
		tests = new StringBuffer ();
		runName = generateName (name);
		suite = suites.get(runName);
		
		output = TestCase;
		output = output.replace("$PACKAGE", packageName);
		output = output.replace("$NAME", suite.getClassName());
		output = output.replace("$FILE", suite.getFileName());
		output = output.replace("$SETTING", "" + settingNum);
		output = output.replace("$PATH", this.getTestDir().toString() + "/");
		for (int i = 1; i <= generator.getNumTest(); i++) {
			if (!generator.isInExcludes(settingNum, i))
				tests.append(testMethodString.replace("NAME", "Query_" + i).replace("NUM", i + ""));
		}
		
		output = output.replace("$TESTS", tests.toString());
		
		writeFile(suite.getClassName(), output);
	}
	
	private String generateName (String name) {
		String[] parts;
		String result;
		
		parts = name.split("\\.");
		
		for (int i = 0; i < parts.length; i++) {
			parts[i] = parts[i] + "_" + settingNum;
		}
		
		result = parts[0];
		for (int i = 1; i < parts.length; i++) {
			result = result + "." + parts[i];
		}
		
		return result;
	}
	
	private void generateSuitesFromFileName (String fileName) {
		String[] parts;
		String curName;
		PermSuite curSuite;
		PermSuite oldSuite;
		
		System.out.println("create Suites for " + fileName + " " + settingNum);
		
		parts = fileName.split("\\.");
		curName = "";
		oldSuite = allTests;
		
		for (int i = 0; i < parts.length; i++) {
			parts[i] = parts[i] + "_" + settingNum;
		}
		
		for (int i = 0; i < parts.length; i++) {
			if (curName.compareTo("") == 0) {
				curName = parts[i];
			}
			else {
				curName = curName + "." + parts[i];
			}
			if (suites.containsKey(curName)) {
				curSuite = suites.get(curName);
			}
			else {
				curSuite = new PermSuite (curName);
			}
			
			suites.put(curName, curSuite);
			oldSuite.addChild(curSuite);
			oldSuite = curSuite;
		}
	}
	
	private void writeFile (String name, String content) throws IOException {
		File outFile;
		FileWriter writer;
		
		outFile = new File ("src/" + packageDir + "/" + name + ".java");
		outFile.createNewFile();
		
		writer = new FileWriter (outFile);
		writer.write(content);
		writer.close();
	}
	
	private String readString (String fileName) throws IOException {
		File file;
		FileReader reader;
		BufferedReader bufRead;
		StringBuffer result;
		
		result = new StringBuffer ();
		file = new File (fileName);
		reader = new FileReader (file);
		bufRead = new BufferedReader (reader);
		
		while (bufRead.ready()) {
			result.append(bufRead.readLine() + "\n");
		}
		
		return result.toString();
	}

	
	public File getTestDir () {
		return testDir;
	}

	
	public void setTestDir (File testDir) {
		this.testDir = testDir;
	}
}
