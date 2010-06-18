package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_6_agg_6.class,
copy_6_set_6.class,
copy_6_spj_6.class
	})
public class copy_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_6.class);
	}
}
