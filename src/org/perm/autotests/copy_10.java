package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_10_agg_10.class,
copy_10_set_10.class,
copy_10_spj_10.class
	})
public class copy_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_10.class);
	}
}
