package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		graph_7_spj_7.class
	})
public class graph_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(graph_7.class);
	}
}
