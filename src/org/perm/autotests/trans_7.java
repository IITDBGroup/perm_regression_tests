package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_7_agg_7.class,
trans_7_set_7.class,
trans_7_spj_7.class,
trans_7_sql_7.class,
trans_7_xml_7.class
	})
public class trans_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_7.class);
	}
}
