package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_2_corr_2_nonest_2_mixed_2 extends AbstractPermTester {

	public sublink_2_corr_2_nonest_2_mixed_2 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nonest.mixed");
		OptionsManager.getInstance().setOptions (2);
    }
	
	
	
}
