package com.dam.aserciones;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Daniel
 *
 */
public class UtilidadesPersonasTest {

	private static UtilidadesPersonas utilidades;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		utilidades = new UtilidadesPersonas();
	}

	@Test
	public void testGetDaniel() throws Exception {

		// Given - Condiciones previas al test
		Persona daniel;

		// When - Ejecución del método
		daniel = utilidades.getDaniel();

		// Then - Condiciones a comprobar para validar el test
		assertEquals("53016164Z", daniel.getNif());
		assertEquals("Daniel", daniel.getNombre());
		assertEquals("Pompa Pareja", daniel.getApellidos());
		assertEquals(45, daniel.getEdad());
		assertEquals(1.78, daniel.getAltura(), 5 * Math.ulp(1.78));
		assertEquals(78, daniel.getPeso(), 5 * Math.ulp(78));

	}

	@Test
	public void testGetEmma() throws Exception {

		// Given - Condiciones previas al test
		Persona emma;

		// When - Ejecución del método
		emma = utilidades.getEmma();

		// Then - Condiciones a comprobar para validar el test
		assertEquals("53443162A", emma.getNif());
		assertEquals("Emma", emma.getNombre());
		assertEquals("Ciambrino Baz", emma.getApellidos());
		assertEquals(38, emma.getEdad());
		assertEquals(1.59, emma.getAltura(), 5 * Math.ulp(1.59));
		assertEquals(58, emma.getPeso(), 5 * Math.ulp(58));

	}

	@Test
	public void testPersonasDiferentes() {

		// Given - Condiciones previas al test
		Persona daniel, emma;

		// When - Ejecución del método
		daniel = utilidades.getDaniel();
		emma = utilidades.getEmma();

		// Then - Condiciones a comprobar para validar el test
		assertNotEquals("Los objetos son diferentes", daniel, emma);
	}

	@Test
	public void testGetPersonas() throws Exception {

		// Given - Condiciones previas al test
		Persona[] personas;

		// When - Ejecución del método
		personas = utilidades.getPersonas();

		// Then - Condiciones a comprobar para validar el test
		assertArrayEquals(utilidades.getPersonas(), personas);

	}

	@Test
	public void testBuscarPorNif() {

		// Given - Condiciones previas al test
		Persona personaNotNull, personaNull;

		// When - Ejecución del método
		personaNotNull = utilidades.buscarPorNif("53016164Z"); // Existe
		personaNull = utilidades.buscarPorNif("51325896K"); // No existe

		// Then - Condiciones a comprobar para validar el test
		assertNotNull("El objeto persona no tiene valor null", personaNotNull);
		assertNull("El objeto persona tiene valor null", personaNull);
	}

	/** OBJETOS IGUALES - MISMA POSICIÓN DE MEMORIA */

	@Test
	public void testSame() {

		// Given - Condiciones previas al test
		Persona resultado;
		Persona persona;

		// When - Ejecución del método
		persona = new Persona("53016164Z", "Daniel", "Pompa Pareja", 45, 1.78, 78);
		resultado = utilidades.devuelveObjeto(persona);

		// Then - Condiciones a comprobar para validar el test
		assertSame("Es el mismo objeto - Misma posición de memoria", persona, resultado);
		assertEquals("El objeto es igual", persona, resultado);
	}

	@Test
	public void testNotSame() {

		// Given - Condiciones previas al test
		Persona resultado;
		Persona persona;

		// When - Ejecución del método
		persona = new Persona("51258963T", "Miguel", "Alonso Martinez", 28, 1.83, 90);
		resultado = utilidades.devuelveObjeto(persona);

		// Then - Condiciones a comprobar para validar el test
		assertNotSame("No es el mismo objeto - Misma posición de memoria", persona, resultado);
		assertNotEquals("El objeto no es igual", persona, resultado);

	}

	@Test
	public void testNotSameButEquals() {

		// Given - Condiciones previas al test
		Persona resultado;
		Persona persona;

		// When - Ejecución del método
		persona = new Persona("51016164J", "John", "Doe");
		resultado = utilidades.devuelveObjeto(persona);

		// Then - Condiciones a comprobar para validar el test
		assertNotSame("No es el mismo objeto - Misma posición de memoria", persona, resultado);
		assertEquals("El objeto es igual", persona, resultado);

	}

}
