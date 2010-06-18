package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		graph_4_spj_4.class
	})
public class graph_4 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(graph_4.class);
	}
}
