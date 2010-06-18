package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_5_agg_5.class,
trans_5_set_5.class,
trans_5_spj_5.class,
trans_5_sql_5.class,
trans_5_xml_5.class
	})
public class trans_5 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_5.class);
	}
}
