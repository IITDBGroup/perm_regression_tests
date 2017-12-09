package $PACKAGE;

import java.sql.SQLException;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.perm.testgenerator.AbstractPermTester;
import org.perm.testgenerator.ConnectionOptions;
import org.perm.testgenerator.OptionsManager;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class $NAME extends AbstractPermTester {

	public $NAME (String name) {
		super (name);
		try {
			ConnectionOptions.getInstance().setPath("$PATH");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
    public void testASetFile () throws SQLException, Exception {
		setGenerator("$FILE");
		OptionsManager.getInstance().setOptions ($SETTING);
    }
	
	$TESTS
	
}