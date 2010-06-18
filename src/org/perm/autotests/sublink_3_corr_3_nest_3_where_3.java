package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_3_corr_3_nest_3_where_3 extends AbstractPermTester {

	public sublink_3_corr_3_nest_3_where_3 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.where");
		OptionsManager.getInstance().setOptions (3);
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


	@Test
	public void testQuery_4 () throws SQLException, Exception {
		testSingleQuery(4);
	}


	@Test
	public void testQuery_5 () throws SQLException, Exception {
		testSingleQuery(5);
	}


	@Test
	public void testQuery_6 () throws SQLException, Exception {
		testSingleQuery(6);
	}


	@Test
	public void testQuery_7 () throws SQLException, Exception {
		testSingleQuery(7);
	}

	
}
