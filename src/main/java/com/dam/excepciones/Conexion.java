package com.dam.excepciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Daniel
 *
 */

public class Conexion {

	private static final String USER = "sa";
	private static final String PASSWORD = "";
	private static final String JDBC_DRIVER = "org.h2.Driver";
	private static final String URL = "jdbc:h2:~/test";
	private static Connection conexion = null;

	/**
	 * Constructor por defecto
	 */
	public Conexion() {

		System.out.println("\nEsperando conexión con base de datos...");

		// Conexión con BBDD
		try {
			// Registrar el controlador JDBC
			Class.forName(JDBC_DRIVER);

			// Abrir una conexión
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (SQLException e) {
			System.err.println("ERROR!! " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR!! " + e.getMessage());
		}

	}

	/**
	 * Establece la conexión con la base de datos
	 * 
	 * @return conexión con la base de datos
	 */
	public Connection getConnection() {

		if (conexion == null) {
			new Conexion();
		}
		System.out.println("\nConexión realizada con éxito!!");
		return conexion;
	}

	/**
	 * Cierra la conexdión con la base de datos
	 * 
	 * @return
	 */
	public Connection close() {

		System.out.println("\nCerrando conexión con la base de datos...");

		if (conexion != null) {

			try {
				conexion.close();
				conexion = null;
				System.out.println("\nConexión cerrada con éxito!!");
			} catch (SQLException e) {

				System.err.println("ERROR!! " + e.getMessage());
			}
		}
		return conexion;
	}

}
