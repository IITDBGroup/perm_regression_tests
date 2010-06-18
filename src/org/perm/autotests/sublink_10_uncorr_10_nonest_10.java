package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_10_uncorr_10_nonest_10_agg_10.class,
sublink_10_uncorr_10_nonest_10_groupby_10.class,
sublink_10_uncorr_10_nonest_10_having_10.class,
sublink_10_uncorr_10_nonest_10_join_10.class,
sublink_10_uncorr_10_nonest_10_mixed_10.class,
sublink_10_uncorr_10_nonest_10_order_10.class,
sublink_10_uncorr_10_nonest_10_target_10.class,
sublink_10_uncorr_10_nonest_10_where_10.class
	})
public class sublink_10_uncorr_10_nonest_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_10_uncorr_10_nonest_10.class);
	}
}
