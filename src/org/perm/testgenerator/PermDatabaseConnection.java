package org.perm.testgenerator;

import java.sql.Connection;
import java.sql.SQLException;

import org.dbunit.database.AbstractDatabaseConnection;

public class PermDatabaseConnection extends AbstractDatabaseConnection {
	
	public void close() throws SQLException {
			
	}

	public Connection getConnection() throws SQLException {
		try {
			return ConnectionManager.getInstance().getConnection();
		} 
		catch (Exception e) {
			throw new SQLException (e.toString());
		}
	}

	public String getSchema() {
		return null;
	}



}
