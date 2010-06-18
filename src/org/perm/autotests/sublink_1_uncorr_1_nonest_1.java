package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_1_uncorr_1_nonest_1_agg_1.class,
sublink_1_uncorr_1_nonest_1_groupby_1.class,
sublink_1_uncorr_1_nonest_1_having_1.class,
sublink_1_uncorr_1_nonest_1_join_1.class,
sublink_1_uncorr_1_nonest_1_mixed_1.class,
sublink_1_uncorr_1_nonest_1_order_1.class,
sublink_1_uncorr_1_nonest_1_target_1.class,
sublink_1_uncorr_1_nonest_1_where_1.class
	})
public class sublink_1_uncorr_1_nonest_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_1_uncorr_1_nonest_1.class);
	}
}
