package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class db2_8_rewrite_8_sublink_8_corr_8 extends AbstractPermTester {

	public db2_8_rewrite_8_sublink_8_corr_8 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("db2.rewrite.sublink.corr");
		OptionsManager.getInstance().setOptions (8);
    }
	
	
	
}
