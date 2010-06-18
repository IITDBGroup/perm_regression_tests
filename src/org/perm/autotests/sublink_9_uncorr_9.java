package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_9_uncorr_9_nest_9.class,
sublink_9_uncorr_9_nonest_9.class
	})
public class sublink_9_uncorr_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_9_uncorr_9.class);
	}
}
