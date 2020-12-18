package com.dam.hamcrest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Daniel
 *
 */

public class UtilidadesHamcrestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * assertThat Funciona de forma distinta a assertEquals.
	 * El primer parámetro es la variable a testear y el segundo parámetro es uno o varios matchers
	 */

	@Test
	public void examplesHamcrest() {
		String cadena = "Hola Mundo";

		// Comparativa
		assertEquals("Hola Mundo", cadena);
		assertThat(cadena, is("Hola Mundo"));

		// Equals/NotEquals
		assertThat(cadena, equalTo("Hola Mundo"));
		assertThat(cadena, is(equalTo("Hola Mundo")));
		assertThat(cadena, not(equalTo("Adios")));
		assertThat(cadena, is(not(equalTo("Adios"))));

		// Null
		assertThat(cadena, notNullValue());
		assertThat(cadena, is(notNullValue()));
		assertThat(cadena, is(not(nullValue())));

	}

}
