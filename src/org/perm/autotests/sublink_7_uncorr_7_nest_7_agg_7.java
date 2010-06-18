package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_7_uncorr_7_nest_7_agg_7 extends AbstractPermTester {

	public sublink_7_uncorr_7_nest_7_agg_7 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.agg");
		OptionsManager.getInstance().setOptions (7);
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

	
}
