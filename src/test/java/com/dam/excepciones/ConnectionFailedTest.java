package com.dam.excepciones;

import java.sql.Connection;
import java.sql.SQLException;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionFailedTest {

	private static ConnectionFailed conexion;
	private Connection c;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@BeforeClass
	public static void setUp() throws Exception {
		conexion = new ConnectionFailed("admin", "admin", "jdbc:h2:~/test");
	}

	@Test
	public void ConexionFallida() {

		try {
			c = conexion.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Assert.assertThat(e, Matchers.isA(SQLException.class));
			Assert.assertThat(e.getMessage(), Matchers.startsWith("Nombre"));
			Assert.assertThat(e.getMessage(), Matchers.startsWith("Nombre de usuario ó password incorrecto"));
			Assert.assertThat(e.getMessage(), Matchers.containsString("usuario ó password incorrecto"));
			Assert.assertThat(e.getSQLState(), Matchers.is("28000"));
		}

		Assert.assertThat(c, Matchers.nullValue());
	}

	/**
	 * Permite comprobar que se lanza una excepción de un tipo específico
	 * Este tipo de metodología a diferencia del test anterior no permite hacer comprobaciones sobre la excepción
	 * El expected podria ser de la execpción esperada o de una de sus padres
	 * 
	 * @throws SQLException
	 */
	@Test(expected = SQLException.class)
	public void ConexionFallidaAnotaciones() throws SQLException {

		conexion.getConnection();
	}

	/**
	 * Test unitario utilizando una regla permite hacer validaciones sobre la causa
	 * que ha generado la exepción o sobre el mensaje que se está lanzando
	 * 
	 * @throws SQLException
	 */
	@Test
	public void ConexionFallidaRegla() throws SQLException {

		exception.expect(SQLException.class);

		// String
		exception.expectMessage("password incorrecto"); // Pasando un String (mensaje completo o substring)

		// Matchers
		exception.expectMessage(Matchers.startsWith("Nombre de usuario"));
		exception.expectMessage(Matchers
				.equalTo("Nombre de usuario ó password incorrecto" + "\nWrong user name or password [28000-199]"));
		exception.expectMessage(Matchers.containsString("incorrecto"));
		exception.expectMessage(Matchers.endsWith("Wrong user name or password [28000-199]"));

		conexion.getConnection();
	}

}
