package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_4.class,
attrOrder_4.class,
copy_4.class,
db2_4.class,
explainsql_4.class,
graph_4.class,
provAsSubquery_4.class,
restrictprovenance_4.class,
set_4.class,
sp_4.class,
specialFeatures_4.class,
spj_4.class,
sublink_4.class,
supportFuncs_4.class,
tcph_4.class,
testComparison_4.class,
trans_4.class,
views_4.class,
xml_4.class,
ReportPrinter.class
	})
public class AllTests_4 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_4.class);
	}
}
