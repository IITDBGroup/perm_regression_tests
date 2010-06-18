package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_10.class,
attrOrder_10.class,
copy_10.class,
db2_10.class,
explainsql_10.class,
graph_10.class,
provAsSubquery_10.class,
restrictprovenance_10.class,
set_10.class,
sp_10.class,
specialFeatures_10.class,
spj_10.class,
sublink_10.class,
supportFuncs_10.class,
tcph_10.class,
testComparison_10.class,
trans_10.class,
views_10.class,
xml_10.class,
ReportPrinter.class
	})
public class AllTests_10 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_10.class);
	}
}
