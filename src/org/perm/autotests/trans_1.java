package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_1_agg_1.class,
trans_1_set_1.class,
trans_1_spj_1.class,
trans_1_sql_1.class,
trans_1_xml_1.class
	})
public class trans_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_1.class);
	}
}
