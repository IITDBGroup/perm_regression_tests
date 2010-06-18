package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		sublink_8_corr_8_nest_8.class,
sublink_8_corr_8_nonest_8.class
	})
public class sublink_8_corr_8 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(sublink_8_corr_8.class);
	}
}
