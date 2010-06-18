package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		xml_7_xslt_7.class
	})
public class xml_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(xml_7.class);
	}
}
