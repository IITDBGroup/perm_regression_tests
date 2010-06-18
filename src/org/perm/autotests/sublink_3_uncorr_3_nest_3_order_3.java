package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_3_uncorr_3_nest_3_order_3 extends AbstractPermTester {

	public sublink_3_uncorr_3_nest_3_order_3 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.order");
		OptionsManager.getInstance().setOptions (3);
    }
	
	
	
}
