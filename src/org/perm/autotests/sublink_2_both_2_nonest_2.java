package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_2_both_2_nonest_2_target_2.class,
sublink_2_both_2_nonest_2_where_2.class
	})
public class sublink_2_both_2_nonest_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_2_both_2_nonest_2.class);
	}
}
