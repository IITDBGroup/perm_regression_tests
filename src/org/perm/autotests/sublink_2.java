package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_2_both_2.class,
sublink_2_corr_2.class,
sublink_2_uncorr_2.class
	})
public class sublink_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_2.class);
	}
}
