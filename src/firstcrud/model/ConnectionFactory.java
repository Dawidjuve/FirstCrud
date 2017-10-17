package firstcrud.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.ConfigurationException;

public class ConnectionFactory {

	public static Connection getConnection() throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/biblioteka?user=root&password=mysql");
		return conn;

	}

}
