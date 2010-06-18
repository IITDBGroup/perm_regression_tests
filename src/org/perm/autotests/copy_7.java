package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_7_agg_7.class,
copy_7_set_7.class,
copy_7_spj_7.class
	})
public class copy_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_7.class);
	}
}
