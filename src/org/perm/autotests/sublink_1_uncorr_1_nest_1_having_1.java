package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_1_uncorr_1_nest_1_having_1 extends AbstractPermTester {

	public sublink_1_uncorr_1_nest_1_having_1 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.having");
		OptionsManager.getInstance().setOptions (1);
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
