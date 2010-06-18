package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_6_uncorr_6_nest_6_agg_6.class,
sublink_6_uncorr_6_nest_6_groupby_6.class,
sublink_6_uncorr_6_nest_6_having_6.class,
sublink_6_uncorr_6_nest_6_mixed_6.class,
sublink_6_uncorr_6_nest_6_order_6.class,
sublink_6_uncorr_6_nest_6_target_6.class,
sublink_6_uncorr_6_nest_6_where_6.class
	})
public class sublink_6_uncorr_6_nest_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_6_uncorr_6_nest_6.class);
	}
}
