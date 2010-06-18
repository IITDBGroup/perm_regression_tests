package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_6_uncorr_6_nest_6_where_6 extends AbstractPermTester {

	public sublink_6_uncorr_6_nest_6_where_6 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.where");
		OptionsManager.getInstance().setOptions (6);
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


	@Test
	public void testQuery_8 () throws SQLException, Exception {
		testSingleQuery(8);
	}


	@Test
	public void testQuery_9 () throws SQLException, Exception {
		testSingleQuery(9);
	}


	@Test
	public void testQuery_10 () throws SQLException, Exception {
		testSingleQuery(10);
	}


	@Test
	public void testQuery_11 () throws SQLException, Exception {
		testSingleQuery(11);
	}


	@Test
	public void testQuery_12 () throws SQLException, Exception {
		testSingleQuery(12);
	}

	
}
