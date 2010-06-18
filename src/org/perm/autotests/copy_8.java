package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_8_agg_8.class,
copy_8_set_8.class,
copy_8_spj_8.class
	})
public class copy_8 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_8.class);
	}
}
