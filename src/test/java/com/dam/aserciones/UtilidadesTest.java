package com.dam.aserciones;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UtilidadesTest {

	private Utilidades utilidades;

	@Before
	public void setUp() throws Exception {

		utilidades = new Utilidades();
	}

	@Test
	public void testConcatenar() throws Exception {

		// Given - Condiciones previas al test
		String resultado;

		// When - Ejecución del método
		resultado = utilidades.concatenar("Hola", "Mundo");

		// Then - Condiciones a comprobar para validar el test
		assertEquals("Las cadenas son diferentes!!", "HolaMundo", resultado);

	}

	// El método se ejcuta correctamente pero falla alguna asserción
	@Test
	public void testConcatenarFallo() throws Exception {

		// Given - Condiciones previas al test
		String resultado;

		// When - Ejecución del método
		resultado = utilidades.concatenar("Hola", "Mundo");

		// Then - Condiciones a comprobar para validar el test
		assertNotEquals("Las cadenas son diferentes!!", "Hola Mundo", resultado);

	}

	@Test
	public void testConcatenarNull() throws NullPointerException {

		// Given - Condiciones previas al test
		String resultado;

		// When - Ejecución del método
		resultado = utilidades.concatenar(null, "Mundo");

		// Then - Condiciones a comprobar para validar el test
		assertEquals(null, resultado);

	}

	@Test
	public void getArrayStrings() throws Exception {

		// Given - Condiciones previas al test
		String[] resultado;

		String[] arrayEsperado = { "Hola", "Mundo" };

		// When - Ejecución del método
		resultado = utilidades.getArrayStrings("Hola", "Mundo");

		// Then - Condiciones a comprobar para validar el test
		assertArrayEquals(arrayEsperado, resultado);
		assertEquals(2, resultado.length);
		assertEquals(arrayEsperado[0], resultado[0]); // Elementos del Array iguales uno a uno
		assertEquals(arrayEsperado[1], resultado[1]); // Elementos del Array iguales uno a uno
		assertNotEquals(arrayEsperado[0], resultado[1]); // Elementos del Array distintos uno a uno
		assertNotEquals(arrayEsperado[1], resultado[0]); // Elementos del Array distintos uno a uno
	}

	@Test
	public void testAssertTrue() {

		// Given - Condiciones previas al test
		boolean resultadoTrue, resultadoFalse;

		// When - Ejecución del método
		resultadoTrue = utilidades.numeroMayor(20);
		resultadoFalse = utilidades.numeroMayor(5);

		// Then - Condiciones a comprobar para validar el test
		assertTrue("La aserción ha fallado para TRUE", resultadoTrue);
		assertFalse("La aserción ha fallado para FALSE", resultadoFalse);
	}
}
