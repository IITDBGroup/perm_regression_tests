package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_6_sql_6_agg_6.class,
trans_6_sql_6_annot_6.class,
trans_6_sql_6_provsubquery_6.class,
trans_6_sql_6_set_6.class,
trans_6_sql_6_spj_6.class
	})
public class trans_6_sql_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_6_sql_6.class);
	}
}
