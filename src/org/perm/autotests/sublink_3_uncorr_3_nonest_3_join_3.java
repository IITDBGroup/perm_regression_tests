package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_3_uncorr_3_nonest_3_join_3 extends AbstractPermTester {

	public sublink_3_uncorr_3_nonest_3_join_3 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nonest.join");
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

	
}
