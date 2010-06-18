package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_6_corr_6_nonest_6_mixed_6 extends AbstractPermTester {

	public sublink_6_corr_6_nonest_6_mixed_6 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nonest.mixed");
		OptionsManager.getInstance().setOptions (6);
    }
	
	
	
}
