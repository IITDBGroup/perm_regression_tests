package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_1_corr_1_nest_1.class,
sublink_1_corr_1_nonest_1.class
	})
public class sublink_1_corr_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_1_corr_1.class);
	}
}
