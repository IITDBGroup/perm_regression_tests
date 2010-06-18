package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		xml_2_xslt_2.class
	})
public class xml_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(xml_2.class);
	}
}
