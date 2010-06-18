package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class tcph_1 extends AbstractPermTester {

	public tcph_1 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("tcph");
		OptionsManager.getInstance().setOptions (1);
    }
	
	

	@Test
	public void testQuery_1 () throws SQLException, Exception {
		testSingleQuery(1);
	}


	@Test
	public void testQuery_3 () throws SQLException, Exception {
		testSingleQuery(3);
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
	public void testQuery_16 () throws SQLException, Exception {
		testSingleQuery(16);
	}


	@Test
	public void testQuery_19 () throws SQLException, Exception {
		testSingleQuery(19);
	}


	@Test
	public void testQuery_21 () throws SQLException, Exception {
		testSingleQuery(21);
	}


	@Test
	public void testQuery_22 () throws SQLException, Exception {
		testSingleQuery(22);
	}

	
}
