package org.perm.autotests;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class graph_10_spj_10 extends AbstractPermTester {

	public graph_10_spj_10 (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("graph.spj");
		OptionsManager.getInstance().setOptions (10);
    }
	
	

	@Test
	public void testQuery_1 () throws SQLException, Exception {
		testSingleQuery(1);
	}


	@Test
	public void testQuery_2 () throws SQLException, Exception {
		testSingleQuery(2);
	}

	
}
