package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_8.class,
attrOrder_8.class,
copy_8.class,
db2_8.class,
explainsql_8.class,
graph_8.class,
provAsSubquery_8.class,
restrictprovenance_8.class,
set_8.class,
sp_8.class,
specialFeatures_8.class,
spj_8.class,
sublink_8.class,
supportFuncs_8.class,
tcph_8.class,
testComparison_8.class,
trans_8.class,
views_8.class,
xml_8.class,
ReportPrinter.class
	})
public class AllTests_8 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_8.class);
	}
}
