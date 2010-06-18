package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		explainsql_1_spj_1.class
	})
public class explainsql_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(explainsql_1.class);
	}
}
