package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_3_corr_3_nest_3_agg_3.class,
sublink_3_corr_3_nest_3_groupby_3.class,
sublink_3_corr_3_nest_3_having_3.class,
sublink_3_corr_3_nest_3_mixed_3.class,
sublink_3_corr_3_nest_3_target_3.class,
sublink_3_corr_3_nest_3_where_3.class
	})
public class sublink_3_corr_3_nest_3 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_3_corr_3_nest_3.class);
	}
}
