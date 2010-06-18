package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		xml_6_xslt_6.class
	})
public class xml_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(xml_6.class);
	}
}
