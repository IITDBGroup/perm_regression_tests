package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_4_both_4_nonest_4_target_4.class,
sublink_4_both_4_nonest_4_where_4.class
	})
public class sublink_4_both_4_nonest_4 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_4_both_4_nonest_4.class);
	}
}
