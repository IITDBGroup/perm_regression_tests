package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class db2_4_rewrite_4_sublink_4_corr_4 extends AbstractPermTester {

	public db2_4_rewrite_4_sublink_4_corr_4 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("db2.rewrite.sublink.corr");
		OptionsManager.getInstance().setOptions (4);
    }
	
	
	
}
