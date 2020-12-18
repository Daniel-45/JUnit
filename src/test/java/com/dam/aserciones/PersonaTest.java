package com.dam.aserciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * 
 * @author Daniel
 *
 */
public class PersonaTest {

	private Persona persona, daniel, danielEquals;

	@Test
	public void testConstructorPorDefecto() {
		persona = new Persona();
		persona.setNif("52443162A");
		persona.setNombre("Emma");
		persona.setApellidos("Ciambrino Baz");
		persona.setEdad(38);
		persona.setAltura(1.62);
		persona.setPeso(58.0);
	}

	@Test
	public void testConstructorNifNombreApellidos() {
		persona = new Persona("53016164Z", "Daniel", "Pompa Pareja");
		assertThat(persona, Matchers.notNullValue());
		assertThat(persona.getNif(), Matchers.is("53016164Z"));
		assertThat(persona.getNombre(), Matchers.is("Daniel"));
		assertThat(persona.getApellidos(), Matchers.is("Pompa Pareja"));
	}

	@Test
	public void testConstructorNifNombreApellidosEdad() {
		persona = new Persona("53016164Z", "Daniel", "Pompa Pareja", 45);
		assertThat(persona, Matchers.notNullValue());
		assertThat(persona.getNif(), Matchers.is("53016164Z"));
		assertThat(persona.getNombre(), Matchers.is("Daniel"));
		assertThat(persona.getApellidos(), Matchers.is("Pompa Pareja"));
		assertThat(persona.getEdad(), Matchers.is(45));
	}

	@Test
	public void testConstructorParametros() {
		persona = new Persona("53016164Z", "Daniel", "Pompa Pareja", 45, 1.77, 78);
		assertThat(persona, Matchers.notNullValue());
		assertThat(persona.getNif(), Matchers.is("53016164Z"));
		assertThat(persona.getNombre(), Matchers.is("Daniel"));
		assertThat(persona.getApellidos(), Matchers.is("Pompa Pareja"));
		assertThat(persona.getEdad(), Matchers.is(45));
		assertThat(persona.getAltura(), Matchers.is(1.77));
		assertThat(persona.getPeso(), Matchers.is(78.0));
	}

	@Test
	public void testEquals() {
		daniel = persona = new Persona("53016164Z", "Daniel", "Pompa Pareja");
		danielEquals = persona = new Persona("53016164Z", "Daniel", "Pompa Pareja");
		assertEquals(daniel, danielEquals);
	}
}
