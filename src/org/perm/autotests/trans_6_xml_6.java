package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_6_xml_6_spj_6.class
	})
public class trans_6_xml_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_6_xml_6.class);
	}
}
