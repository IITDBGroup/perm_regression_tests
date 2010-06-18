package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class db2_3_rewrite_3_sublink_3_corr_3 extends AbstractPermTester {

	public db2_3_rewrite_3_sublink_3_corr_3 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("db2.rewrite.sublink.corr");
		OptionsManager.getInstance().setOptions (3);
    }
	
	
	
}
