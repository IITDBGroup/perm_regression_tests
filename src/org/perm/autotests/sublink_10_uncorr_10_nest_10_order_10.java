package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_10_uncorr_10_nest_10_order_10 extends AbstractPermTester {

	public sublink_10_uncorr_10_nest_10_order_10 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.order");
		OptionsManager.getInstance().setOptions (10);
    }
	
	
	
}
