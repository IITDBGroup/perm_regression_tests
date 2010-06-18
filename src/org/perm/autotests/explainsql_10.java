package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		explainsql_10_spj_10.class
	})
public class explainsql_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(explainsql_10.class);
	}
}
