package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		copy_9_agg_9.class,
copy_9_set_9.class,
copy_9_spj_9.class
	})
public class copy_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(copy_9.class);
	}
}
