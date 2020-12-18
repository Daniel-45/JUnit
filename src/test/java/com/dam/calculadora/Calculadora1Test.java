package com.dam.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculadora1Test {

	@Test
	public void testSuma() {

		// Given - Condiciones previas al test
		int esperado;
		int resultado;

		// When - Ejecución del método
		esperado = 6; // 4 + 2 = 6
		resultado = Calculadora1.suma(4, 2);

		// Then - Condiciones a comprobar para validar el test
		// Primero el valor esperado que debería devolver Después el valor que ha devuelto.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {

		// Given - Condiciones previas al test
		int esperado;
		int resultado;

		// When - Ejecución del método
		esperado = 2; // 4 - 2 = 2
		resultado = Calculadora1.resta(4, 2);

		// Then - Condiciones a comprobar para validar el test
		assertEquals(esperado, resultado);
	}

	@Test
	public void testMultiplicacion() {

		// Given - Condiciones previas al test
		int esperado;
		int resultado;

		// When - Ejecución del método
		esperado = 8; // 4 * 2 = 8
		resultado = Calculadora1.multiplicacion(4, 2);

		// Then - Condiciones a comprobar para validar el test
		assertEquals(esperado, resultado);
	}

	@Test
	public void testDivision() {

		// Given - Condiciones previas al test
		int esperado;
		int resultado;

		// When - Ejecución del método
		esperado = 4; // 8 / 2 = 4
		resultado = Calculadora1.division(8, 2);

		// Then - Condiciones a comprobar para validar el test
		assertEquals(esperado, resultado);
	}

}
