package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_4_rewrite_4_sublink_4_corr_4.class
	})
public class db2_4_rewrite_4_sublink_4 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_4_rewrite_4_sublink_4.class);
	}
}
