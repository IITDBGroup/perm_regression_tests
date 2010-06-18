package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_1.class,
attrOrder_1.class,
copy_1.class,
db2_1.class,
explainsql_1.class,
graph_1.class,
provAsSubquery_1.class,
restrictprovenance_1.class,
set_1.class,
sp_1.class,
specialFeatures_1.class,
spj_1.class,
sublink_1.class,
supportFuncs_1.class,
tcph_1.class,
testComparison_1.class,
trans_1.class,
views_1.class,
xml_1.class,
ReportPrinter.class
	})
public class AllTests_1 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_1.class);
	}
}
