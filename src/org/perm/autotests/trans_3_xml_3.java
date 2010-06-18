package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_3_xml_3_spj_3.class
	})
public class trans_3_xml_3 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_3_xml_3.class);
	}
}
