package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_4_uncorr_4_nonest_4_agg_4.class,
sublink_4_uncorr_4_nonest_4_groupby_4.class,
sublink_4_uncorr_4_nonest_4_having_4.class,
sublink_4_uncorr_4_nonest_4_join_4.class,
sublink_4_uncorr_4_nonest_4_mixed_4.class,
sublink_4_uncorr_4_nonest_4_order_4.class,
sublink_4_uncorr_4_nonest_4_target_4.class,
sublink_4_uncorr_4_nonest_4_where_4.class
	})
public class sublink_4_uncorr_4_nonest_4 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_4_uncorr_4_nonest_4.class);
	}
}
