package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		graph_9_spj_9.class
	})
public class graph_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(graph_9.class);
	}
}
