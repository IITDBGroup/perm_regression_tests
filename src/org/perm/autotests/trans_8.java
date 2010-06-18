package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		trans_8_agg_8.class,
trans_8_set_8.class,
trans_8_spj_8.class,
trans_8_sql_8.class,
trans_8_xml_8.class
	})
public class trans_8 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(trans_8.class);
	}
}
