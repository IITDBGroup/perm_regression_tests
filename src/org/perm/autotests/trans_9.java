package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_9_agg_9.class,
trans_9_set_9.class,
trans_9_spj_9.class,
trans_9_sql_9.class,
trans_9_xml_9.class
	})
public class trans_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_9.class);
	}
}
