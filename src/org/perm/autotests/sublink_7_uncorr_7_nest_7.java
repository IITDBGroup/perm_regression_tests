package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_7_uncorr_7_nest_7_agg_7.class,
sublink_7_uncorr_7_nest_7_groupby_7.class,
sublink_7_uncorr_7_nest_7_having_7.class,
sublink_7_uncorr_7_nest_7_mixed_7.class,
sublink_7_uncorr_7_nest_7_order_7.class,
sublink_7_uncorr_7_nest_7_target_7.class,
sublink_7_uncorr_7_nest_7_where_7.class
	})
public class sublink_7_uncorr_7_nest_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_7_uncorr_7_nest_7.class);
	}
}
