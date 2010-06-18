package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_7_both_7.class,
sublink_7_corr_7.class,
sublink_7_uncorr_7.class
	})
public class sublink_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_7.class);
	}
}
