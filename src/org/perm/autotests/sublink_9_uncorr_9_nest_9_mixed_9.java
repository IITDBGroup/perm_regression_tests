package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_9_uncorr_9_nest_9_mixed_9 extends AbstractPermTester {

	public sublink_9_uncorr_9_nest_9_mixed_9 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.mixed");
		OptionsManager.getInstance().setOptions (9);
    }
	
	
	
}
