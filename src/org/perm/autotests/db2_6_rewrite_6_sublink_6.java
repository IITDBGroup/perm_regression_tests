package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_6_rewrite_6_sublink_6_corr_6.class
	})
public class db2_6_rewrite_6_sublink_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_6_rewrite_6_sublink_6.class);
	}
}
