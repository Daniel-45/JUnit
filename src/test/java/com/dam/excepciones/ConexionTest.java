package com.dam.excepciones;

import static org.junit.Assert.assertThat;

import java.sql.Connection;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class ConexionTest {

	private Conexion conexion;

	@Before
	public void setUp() throws Exception {
		conexion = new Conexion();
	}

	@Test
	public void testGetConnection() throws Exception {

		System.out.println("\nTest método getConnection");

		// Given - Condiciones previas al test
		Connection c;

		// When - Ejecución del método
		c = conexion.getConnection();

		// Then - Condiciones a comprobar para validar el test
		assertThat(c, Matchers.notNullValue());

	}

	@Test
	public void testClose() throws Exception {

		System.out.println("\nTest método close");

		// Given - Condiciones previas al test
		Connection c;

		// When - Ejecución del método
		c = conexion.getConnection();

		// Then - Condiciones a comprobar para validar el test
		assertThat(c, Matchers.notNullValue());

		c = conexion.close();
	}
}
