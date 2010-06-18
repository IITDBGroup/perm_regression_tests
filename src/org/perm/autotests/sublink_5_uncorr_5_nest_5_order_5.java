package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_5_uncorr_5_nest_5_order_5 extends AbstractPermTester {

	public sublink_5_uncorr_5_nest_5_order_5 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.order");
		OptionsManager.getInstance().setOptions (5);
    }
	
	
	
}
