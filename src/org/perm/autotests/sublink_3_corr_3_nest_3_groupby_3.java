package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_3_corr_3_nest_3_groupby_3 extends AbstractPermTester {

	public sublink_3_corr_3_nest_3_groupby_3 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.groupby");
		OptionsManager.getInstance().setOptions (3);
    }
	
	
	
}
