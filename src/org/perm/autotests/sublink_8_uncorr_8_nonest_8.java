package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_8_uncorr_8_nonest_8_agg_8.class,
sublink_8_uncorr_8_nonest_8_groupby_8.class,
sublink_8_uncorr_8_nonest_8_having_8.class,
sublink_8_uncorr_8_nonest_8_join_8.class,
sublink_8_uncorr_8_nonest_8_mixed_8.class,
sublink_8_uncorr_8_nonest_8_order_8.class,
sublink_8_uncorr_8_nonest_8_target_8.class,
sublink_8_uncorr_8_nonest_8_where_8.class
	})
public class sublink_8_uncorr_8_nonest_8 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_8_uncorr_8_nonest_8.class);
	}
}
