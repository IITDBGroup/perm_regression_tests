package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_3_both_3.class,
sublink_3_corr_3.class,
sublink_3_uncorr_3.class
	})
public class sublink_3 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_3.class);
	}
}
