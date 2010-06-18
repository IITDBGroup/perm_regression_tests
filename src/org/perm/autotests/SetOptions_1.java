package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class SetOptions_1 extends AbstractPermTester {

	public SetOptions_1 (String name) {
		super (name);
	}
	
	@Test
    public void testOptions () throws SQLException, Exception {
		OptionsManager.getInstance().setOptions (1);
    }
	
}
