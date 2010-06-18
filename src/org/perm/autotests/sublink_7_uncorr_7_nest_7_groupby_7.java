package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_7_uncorr_7_nest_7_groupby_7 extends AbstractPermTester {

	public sublink_7_uncorr_7_nest_7_groupby_7 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.uncorr.nest.groupby");
		OptionsManager.getInstance().setOptions (7);
    }
	
	
	
}
