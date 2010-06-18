package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_5_rewrite_5_spj_5.class,
db2_5_rewrite_5_sublink_5.class
	})
public class db2_5_rewrite_5 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_5_rewrite_5.class);
	}
}
