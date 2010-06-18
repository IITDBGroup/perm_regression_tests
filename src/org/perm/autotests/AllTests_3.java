package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_3.class,
attrOrder_3.class,
copy_3.class,
db2_3.class,
explainsql_3.class,
graph_3.class,
provAsSubquery_3.class,
restrictprovenance_3.class,
set_3.class,
sp_3.class,
specialFeatures_3.class,
spj_3.class,
sublink_3.class,
supportFuncs_3.class,
tcph_3.class,
testComparison_3.class,
trans_3.class,
views_3.class,
xml_3.class,
ReportPrinter.class
	})
public class AllTests_3 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_3.class);
	}
}
