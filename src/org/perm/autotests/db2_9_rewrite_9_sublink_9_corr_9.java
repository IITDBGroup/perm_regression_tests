package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class db2_9_rewrite_9_sublink_9_corr_9 extends AbstractPermTester {

	public db2_9_rewrite_9_sublink_9_corr_9 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("db2.rewrite.sublink.corr");
		OptionsManager.getInstance().setOptions (9);
    }
	
	
	
}
