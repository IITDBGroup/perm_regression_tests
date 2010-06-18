package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_8_uncorr_8_nonest_8_agg_8 extends AbstractPermTester {

	public sublink_8_uncorr_8_nonest_8_agg_8 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nonest.agg");
		OptionsManager.getInstance().setOptions (8);
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


	@Test
	public void testQuery_13 () throws SQLException, Exception {
		testSingleQuery(13);
	}


	@Test
	public void testQuery_14 () throws SQLException, Exception {
		testSingleQuery(14);
	}


	@Test
	public void testQuery_15 () throws SQLException, Exception {
		testSingleQuery(15);
	}


	@Test
	public void testQuery_16 () throws SQLException, Exception {
		testSingleQuery(16);
	}


	@Test
	public void testQuery_17 () throws SQLException, Exception {
		testSingleQuery(17);
	}


	@Test
	public void testQuery_18 () throws SQLException, Exception {
		testSingleQuery(18);
	}


	@Test
	public void testQuery_19 () throws SQLException, Exception {
		testSingleQuery(19);
	}


	@Test
	public void testQuery_20 () throws SQLException, Exception {
		testSingleQuery(20);
	}


	@Test
	public void testQuery_21 () throws SQLException, Exception {
		testSingleQuery(21);
	}

	
}
