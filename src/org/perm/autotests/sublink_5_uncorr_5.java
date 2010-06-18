package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_5_uncorr_5_nest_5.class,
sublink_5_uncorr_5_nonest_5.class
	})
public class sublink_5_uncorr_5 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_5_uncorr_5.class);
	}
}
