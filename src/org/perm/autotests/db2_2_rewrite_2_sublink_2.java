package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_2_rewrite_2_sublink_2_corr_2.class
	})
public class db2_2_rewrite_2_sublink_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_2_rewrite_2_sublink_2.class);
	}
}
