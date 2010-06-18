/**
 * 
 */
package org.perm.testgenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 *
 * Part of Project PermTester
 * @author Boris Glavic
 *
 */
public class ConnectionOptions {

	private static ConnectionOptions instance;
	private Properties props;
	
	private ConnectionOptions () throws FileNotFoundException, IOException {
		props = new Properties ();
		props.load(new FileInputStream("resource/options.txt"));
	}
	
	public static ConnectionOptions getInstance () throws FileNotFoundException, IOException {
		if (instance == null) 
			instance = new ConnectionOptions ();
		
		return instance;
	}
	
	public String getDbName () {
		return props.getProperty("DBName");
	}
	
	public String getUser () {
		return props.getProperty("User");
	}
	
	public String getPassword () {
		return props.getProperty("Password");
	}
	
	public String getSchema () {
		return props.getProperty("Schema");
	}
	
	public String getPath () {
		return props.getProperty("Path");
	}
	
	public void setPath (String path) {
		props.setProperty("Path", path);
	}
}
