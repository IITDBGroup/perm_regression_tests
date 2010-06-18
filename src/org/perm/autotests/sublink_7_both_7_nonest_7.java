package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_7_both_7_nonest_7_target_7.class,
sublink_7_both_7_nonest_7_where_7.class
	})
public class sublink_7_both_7_nonest_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_7_both_7_nonest_7.class);
	}
}
