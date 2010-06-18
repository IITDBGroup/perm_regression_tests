package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class explainsql_7_spj_7 extends AbstractPermTester {

	public explainsql_7_spj_7 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("explainsql.spj");
		OptionsManager.getInstance().setOptions (7);
    }
	
	
	
}
