package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_2_uncorr_2_nest_2.class,
sublink_2_uncorr_2_nonest_2.class
	})
public class sublink_2_uncorr_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_2_uncorr_2.class);
	}
}
