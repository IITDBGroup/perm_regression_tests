package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_3_agg_3.class,
copy_3_set_3.class,
copy_3_spj_3.class
	})
public class copy_3 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_3.class);
	}
}
