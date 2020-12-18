package com.dam.parametrizados;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author Daniel
 *
 */

@RunWith(Parameterized.class)
public class ParametrizadosNumerosTest {

	private int a, b, resultado;
	private ParametrizadosNumeros utilidades = new ParametrizadosNumeros();

	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { { 4, 2 }, { 5, 3 }, { 7, 2 }, { 9, 5 }, { 8, 6 }, { 6, 6 } });
	}

	// Para que el Test parametrizado pueda asignar los distintos valores se necesita un constructor
	public ParametrizadosNumerosTest(int dato1, int dato2) {
		this.a = dato1;
		this.b = dato2;
	}

	@Test
	public void testSuma() {
		resultado = utilidades.suma(a, b);
		assertEquals(a + b, resultado);
		System.out.println("Los parámetros son: " + a + " + " + b + " = " + resultado);
	}

	@Test
	public void testResta() {
		resultado = utilidades.resta(a, b);
		assertEquals(a - b, resultado);
		System.out.println("Los parámetros son: " + a + " - " + b + " = " + resultado);
	}

	@Test
	public void testDivision() {
		resultado = utilidades.divison(a, b);
		assertEquals(a / b, resultado);
		System.out.println("Los parámetros son: " + a + " / " + b + " = " + resultado);
	}

	@Test
	public void testProducto() {
		resultado = utilidades.producto(a, b);
		assertEquals(a * b, resultado);
		System.out.println("Los parámetros son: " + a + " * " + b + " = " + resultado);
	}
}
