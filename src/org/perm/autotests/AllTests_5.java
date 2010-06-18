package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_5.class,
attrOrder_5.class,
copy_5.class,
db2_5.class,
explainsql_5.class,
graph_5.class,
provAsSubquery_5.class,
restrictprovenance_5.class,
set_5.class,
sp_5.class,
specialFeatures_5.class,
spj_5.class,
sublink_5.class,
supportFuncs_5.class,
tcph_5.class,
testComparison_5.class,
trans_5.class,
views_5.class,
xml_5.class,
ReportPrinter.class
	})
public class AllTests_5 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_5.class);
	}
}
