package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		AllTests_1.class,
AllTests_2.class,
AllTests_3.class,
AllTests_4.class,
AllTests_5.class,
AllTests_6.class,
AllTests_7.class,
AllTests_8.class,
AllTests_9.class,
AllTests_10.class
	})
public class AllTestsOptions {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTestsOptions.class);
	}
}
