package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		explainsql_8_spj_8.class
	})
public class explainsql_8 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(explainsql_8.class);
	}
}
