package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_10_both_10.class,
sublink_10_corr_10.class,
sublink_10_uncorr_10.class
	})
public class sublink_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_10.class);
	}
}
