package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_6.class,
attrOrder_6.class,
copy_6.class,
db2_6.class,
explainsql_6.class,
graph_6.class,
provAsSubquery_6.class,
restrictprovenance_6.class,
set_6.class,
sp_6.class,
specialFeatures_6.class,
spj_6.class,
sublink_6.class,
supportFuncs_6.class,
tcph_6.class,
testComparison_6.class,
trans_6.class,
views_6.class,
xml_6.class,
ReportPrinter.class
	})
public class AllTests_6 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_6.class);
	}
}
