package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_6_corr_6_nest_6_agg_6 extends AbstractPermTester {

	public sublink_6_corr_6_nest_6_agg_6 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.agg");
		OptionsManager.getInstance().setOptions (6);
    }
	
	
	
}
