package org.perm.autotests.tpch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		validation_1.class,
ReportPrinter.class
	})
public class AllTests_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_1.class);
	}
}
