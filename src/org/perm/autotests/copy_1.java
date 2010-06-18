package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_1_agg_1.class,
copy_1_set_1.class,
copy_1_spj_1.class
	})
public class copy_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_1.class);
	}
}
