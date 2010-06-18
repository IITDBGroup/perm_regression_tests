package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_10_xml_10_spj_10.class
	})
public class trans_10_xml_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_10_xml_10.class);
	}
}
