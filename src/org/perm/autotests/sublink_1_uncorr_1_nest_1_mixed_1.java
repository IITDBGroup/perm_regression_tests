package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_1_uncorr_1_nest_1_mixed_1 extends AbstractPermTester {

	public sublink_1_uncorr_1_nest_1_mixed_1 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.mixed");
		OptionsManager.getInstance().setOptions (1);
    }
	
	
	
}
