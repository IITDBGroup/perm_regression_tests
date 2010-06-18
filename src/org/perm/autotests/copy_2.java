package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_2_agg_2.class,
copy_2_set_2.class,
copy_2_spj_2.class
	})
public class copy_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_2.class);
	}
}
