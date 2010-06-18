package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		explainsql_2_spj_2.class
	})
public class explainsql_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(explainsql_2.class);
	}
}
