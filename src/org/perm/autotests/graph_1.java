package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		graph_1_spj_1.class
	})
public class graph_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(graph_1.class);
	}
}
