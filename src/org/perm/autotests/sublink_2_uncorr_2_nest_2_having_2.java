package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_2_uncorr_2_nest_2_having_2 extends AbstractPermTester {

	public sublink_2_uncorr_2_nest_2_having_2 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.having");
		OptionsManager.getInstance().setOptions (2);
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
