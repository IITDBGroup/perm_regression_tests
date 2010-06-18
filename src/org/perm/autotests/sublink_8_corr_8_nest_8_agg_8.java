package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class sublink_8_corr_8_nest_8_agg_8 extends AbstractPermTester {

	public sublink_8_corr_8_nest_8_agg_8 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("sublink.corr.nest.agg");
		OptionsManager.getInstance().setOptions (8);
    }
	
	
	
}
