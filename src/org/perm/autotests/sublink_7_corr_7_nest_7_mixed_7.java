package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_7_corr_7_nest_7_mixed_7 extends AbstractPermTester {

	public sublink_7_corr_7_nest_7_mixed_7 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.mixed");
		OptionsManager.getInstance().setOptions (7);
    }
	
	
	
}
