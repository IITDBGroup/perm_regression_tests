package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		db2_7_rewrite_7_spj_7.class,
db2_7_rewrite_7_sublink_7.class
	})
public class db2_7_rewrite_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(db2_7_rewrite_7.class);
	}
}
