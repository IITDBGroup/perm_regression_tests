package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_9_uncorr_9_nest_9_agg_9.class,
sublink_9_uncorr_9_nest_9_groupby_9.class,
sublink_9_uncorr_9_nest_9_having_9.class,
sublink_9_uncorr_9_nest_9_mixed_9.class,
sublink_9_uncorr_9_nest_9_order_9.class,
sublink_9_uncorr_9_nest_9_target_9.class,
sublink_9_uncorr_9_nest_9_where_9.class
	})
public class sublink_9_uncorr_9_nest_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_9_uncorr_9_nest_9.class);
	}
}
