package PACKAGE;

import java.sql.SQLException;

import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.OptionsManager;

public class NAME extends AbstractPermTester {

	public NAME (String name) {
		super (name);
	}
	
	@Test
    public void testSetFile () throws SQLException, Exception {
		setGenerator("FILE");
		OptionsManager.getInstance().setOptions (SETTING);
    }
	
	TESTS
	
}