package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_7.class,
attrOrder_7.class,
copy_7.class,
db2_7.class,
explainsql_7.class,
graph_7.class,
provAsSubquery_7.class,
restrictprovenance_7.class,
set_7.class,
sp_7.class,
specialFeatures_7.class,
spj_7.class,
sublink_7.class,
supportFuncs_7.class,
tcph_7.class,
testComparison_7.class,
trans_7.class,
views_7.class,
xml_7.class,
ReportPrinter.class
	})
public class AllTests_7 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_7.class);
	}
}
