package org.perm.autotests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.perm.testgenerator.ReportPrinter;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		agg_9.class,
attrOrder_9.class,
copy_9.class,
db2_9.class,
explainsql_9.class,
graph_9.class,
provAsSubquery_9.class,
restrictprovenance_9.class,
set_9.class,
sp_9.class,
specialFeatures_9.class,
spj_9.class,
sublink_9.class,
supportFuncs_9.class,
tcph_9.class,
testComparison_9.class,
trans_9.class,
views_9.class,
xml_9.class,
ReportPrinter.class
	})
public class AllTests_9 {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests_9.class);
	}
}
