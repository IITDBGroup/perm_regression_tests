package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_9_both_9_nonest_9_target_9.class,
sublink_9_both_9_nonest_9_where_9.class
	})
public class sublink_9_both_9_nonest_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_9_both_9_nonest_9.class);
	}
}
