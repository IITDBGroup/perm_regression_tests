package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_5_corr_5_nest_5_mixed_5 extends AbstractPermTester {

	public sublink_5_corr_5_nest_5_mixed_5 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.mixed");
		OptionsManager.getInstance().setOptions (5);
    }
	
	
	
}
