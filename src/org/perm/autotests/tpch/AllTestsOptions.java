package org.perm.autotests.tpch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		AllTests_1.class
	})
public class AllTestsOptions {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTestsOptions.class);
	}
}
