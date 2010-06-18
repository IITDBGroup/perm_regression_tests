package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_2_corr_2_nest_2_agg_2 extends AbstractPermTester {

	public sublink_2_corr_2_nest_2_agg_2 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.agg");
		OptionsManager.getInstance().setOptions (2);
    }
	
	
	
}
