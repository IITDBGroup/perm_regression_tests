package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_5_corr_5_nest_5_agg_5.class,
sublink_5_corr_5_nest_5_groupby_5.class,
sublink_5_corr_5_nest_5_having_5.class,
sublink_5_corr_5_nest_5_mixed_5.class,
sublink_5_corr_5_nest_5_target_5.class,
sublink_5_corr_5_nest_5_where_5.class
	})
public class sublink_5_corr_5_nest_5 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_5_corr_5_nest_5.class);
	}
}
