package com.dam.calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculadora2Test {

	static Calculadora2 c;

	// Ejecutar el código una única vez para cada método 'prueba'
	@BeforeClass
	public static void beforeClass() {
		System.out.println("\nbeforeClass() -> c = new Calculadora2()");
		c = new Calculadora2();
	}

	// Ejecutar el código después de cada método 'prueba'
	@AfterClass
	public static void afterClass() {
		System.out.println("\nafterClass() -> Se ejecuta una sola vez al final"
				+ "\n\t     -> Se ha terminado el test de pruebas unitarias!! ");
	}

	// Ejecutar el código después de cada método 'prueba'
	@After
	public void after() {
		c.clear();
		System.out.println("\nafter() -> Valor de 'ans' después del clear: " + c.ans());
	}

	@Test
	public void testSuma() {
		System.out.println("\ntestSuma()");
		System.out.println("\n4 + 2 = 6");
		int resultado = c.suma(4, 2);
		int esperado1 = 6;
		int esperado2 = 8;
		assertEquals(esperado1, resultado);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado1);
		System.out.println("\nSe suma 2 al resultado");
		resultado = c.addSuma(2);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado2);
		System.out.println("\nValor actual de 'ans': " + c.ans());
	}

	@Test
	public void testResta() {
		System.out.println("\ntestResta()");
		System.out.println("\n4 - 2 = 2");
		int resultado = c.resta(4, 2);
		int esperado1 = 2;
		int esperado2 = 8;
		assertEquals(esperado1, resultado);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado1);
		System.out.println("\nSe suma 6 al resultado");
		resultado = c.addSuma(6);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado2);
		System.out.println("\nValor actual de 'ans': " + c.ans());
	}

	@Test
	public void testMultiplicacion() {
		System.out.println("\ntestMultiplicacion()");
		System.out.println("\n4 * 2 = 8");
		int resultado = c.multiplicacion(4, 2);
		int esperado1 = 8;
		int esperado2 = 10;
		assertEquals(esperado1, resultado);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado1);
		System.out.println("\nSe suma 2 al resultado");
		resultado = c.addSuma(2);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado2);
		System.out.println("\nValor actual de 'ans': " + c.ans());
	}

	@Test
	public void testDivision() {
		System.out.println("\ntestDivision()");
		System.out.println("\n4 / 2 = 2");
		int resultado = c.division(4, 2);
		int esperado1 = 2;
		int esperado2 = 8;
		assertEquals(esperado1, resultado);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado1);
		System.out.println("\nSe suma 6 al resultado");
		resultado = c.addSuma(6);
		System.out.println("\nResultado: " + resultado + "\tEsperado: " + esperado2);
		System.out.println("\nValor actual de 'ans': " + c.ans());
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionPorCero() {
		System.out.println("\ntestDivisionPorCero()");
		c.divisionPorCero(4, 0); // Funciona porque lanza la exepción esperada
		// c.divisionPorCero(4,2); // Falla porque no lanza la excepción esperada
	}

	@Test(timeout = 1000)
	public void testAlgoritmo() {
		System.out.println("\ntestAlgoritmo()");
		c.operacionOptima();
	}

}
