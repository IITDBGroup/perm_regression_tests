package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_2.class,
attrOrder_2.class,
copy_2.class,
db2_2.class,
explainsql_2.class,
graph_2.class,
provAsSubquery_2.class,
restrictprovenance_2.class,
set_2.class,
sp_2.class,
specialFeatures_2.class,
spj_2.class,
sublink_2.class,
supportFuncs_2.class,
tcph_2.class,
testComparison_2.class,
trans_2.class,
views_2.class,
xml_2.class,
ReportPrinter.class
	})
public class AllTests_2 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_2.class);
	}
}
