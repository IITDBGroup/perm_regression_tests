package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class db2_2_rewrite_2_spj_2 extends AbstractPermTester {

	public db2_2_rewrite_2_spj_2 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("db2.rewrite.spj");
		OptionsManager.getInstance().setOptions (2);
    }
	
	
	
}
