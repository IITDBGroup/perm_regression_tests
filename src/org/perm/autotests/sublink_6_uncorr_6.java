package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_6_uncorr_6_nest_6.class,
sublink_6_uncorr_6_nonest_6.class
	})
public class sublink_6_uncorr_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_6_uncorr_6.class);
	}
}
