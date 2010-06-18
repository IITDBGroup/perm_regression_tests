package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_5_agg_5.class,
copy_5_set_5.class,
copy_5_spj_5.class
	})
public class copy_5 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_5.class);
	}
}
