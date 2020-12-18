package com.dam.persona;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Daniel
 *
 */
public class PersonaTest {

	private Persona persona;

	@Before
	public void setUp() throws Exception {
		persona = new Persona("53016164Z", "Daniel", "Pompa Pareja", "648 11 99 48", 
				"daniel.pompa@gmail.com", 45, 1.78, 78, true);
	}

	@Test
	public void testGetNombre() throws Exception {

		// Given - Condiciones previas al test

		// When - Ejecución del método

		// Then - Condiciones a comprobar para validar el test
		assertTrue(persona.getNombre().equals("Daniel"));
	}

}
