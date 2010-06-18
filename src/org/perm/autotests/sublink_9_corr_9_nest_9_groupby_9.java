package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_9_corr_9_nest_9_groupby_9 extends AbstractPermTester {

	public sublink_9_corr_9_nest_9_groupby_9 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.groupby");
		OptionsManager.getInstance().setOptions (9);
    }
	
	
	
}
