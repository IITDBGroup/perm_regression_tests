package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_10_rewrite_10_spj_10.class,
db2_10_rewrite_10_sublink_10.class
	})
public class db2_10_rewrite_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_10_rewrite_10.class);
	}
}
