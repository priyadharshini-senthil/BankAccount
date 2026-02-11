package com.wipro.bank.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url1="jdbc:oracle:thin:@localhost:1521/xe\r\n";
					

			String user="system";
			String pass="system";
			Connection connection=DriverManager.getConnection(url1,user,pass);
			return connection;
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
