package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_4_uncorr_4_nonest_4_order_4 extends AbstractPermTester {

	public sublink_4_uncorr_4_nonest_4_order_4 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nonest.order");
		OptionsManager.getInstance().setOptions (4);
    }
	
	

	@Test
	public void testQuery_1 () throws SQLException, Exception {
		testSingleQuery(1);
	}

	
}
