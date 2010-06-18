package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_1_rewrite_1_sublink_1_corr_1.class
	})
public class db2_1_rewrite_1_sublink_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_1_rewrite_1_sublink_1.class);
	}
}
