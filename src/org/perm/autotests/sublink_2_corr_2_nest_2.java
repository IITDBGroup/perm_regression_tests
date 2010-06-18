package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_2_corr_2_nest_2_agg_2.class,
sublink_2_corr_2_nest_2_groupby_2.class,
sublink_2_corr_2_nest_2_having_2.class,
sublink_2_corr_2_nest_2_mixed_2.class,
sublink_2_corr_2_nest_2_target_2.class,
sublink_2_corr_2_nest_2_where_2.class
	})
public class sublink_2_corr_2_nest_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_2_corr_2_nest_2.class);
	}
}
