package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_10_corr_10_nonest_10_mixed_10 extends AbstractPermTester {

	public sublink_10_corr_10_nonest_10_mixed_10 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nonest.mixed");
		OptionsManager.getInstance().setOptions (10);
    }
	
	
	
}
