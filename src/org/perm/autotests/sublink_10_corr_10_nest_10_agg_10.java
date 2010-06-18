package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_10_corr_10_nest_10_agg_10 extends AbstractPermTester {

	public sublink_10_corr_10_nest_10_agg_10 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.agg");
		OptionsManager.getInstance().setOptions (10);
    }
	
	
	
}
