package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class trans_4_sql_4_provsubquery_4 extends AbstractPermTester {

	public trans_4_sql_4_provsubquery_4 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("trans.sql.provsubquery");
		OptionsManager.getInstance().setOptions (4);
    }
	
	

	@Test
	public void testQuery_1 () throws SQLException, Exception {
		testSingleQuery(1);
	}


	@Test
	public void testQuery_2 () throws SQLException, Exception {
		testSingleQuery(2);
	}


	@Test
	public void testQuery_3 () throws SQLException, Exception {
		testSingleQuery(3);
	}

	
}
