package com.dam.excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Daniel
 *
 */

public class ConnectionFailed {

	private final String user;
	private final String password;
	private final String jdbc_driver = "org.h2.Driver";
	private final String url;
	private static Connection conexion = null;

	public ConnectionFailed(String user, String password, String url) {
		this.user = user;
		this.password = password;
		this.url = url;
	}

	public Connection getConnection() throws SQLException {

		try {
			Class.forName(jdbc_driver);
			conexion = DriverManager.getConnection(this.url, this.user, this.password);
		} catch (ClassNotFoundException e) {
			System.err.println("\nERROR!! " + e.getMessage());
		}

		return conexion;
	}

}
