package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_2_agg_2.class,
trans_2_set_2.class,
trans_2_spj_2.class,
trans_2_sql_2.class,
trans_2_xml_2.class
	})
public class trans_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_2.class);
	}
}
