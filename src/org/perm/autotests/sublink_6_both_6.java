package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_6_both_6_nonest_6.class
	})
public class sublink_6_both_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_6_both_6.class);
	}
}
