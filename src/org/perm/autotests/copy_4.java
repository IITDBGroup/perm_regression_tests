package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_4_agg_4.class,
copy_4_set_4.class,
copy_4_spj_4.class
	})
public class copy_4 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_4.class);
	}
}
