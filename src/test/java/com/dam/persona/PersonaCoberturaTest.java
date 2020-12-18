package com.dam.persona;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * 
 * @author Daniel
 *
 */

public class PersonaCoberturaTest {

	private Persona persona;

	@Test
	public void testConstructorPorDefecto() {
		persona = new Persona();
		persona.setNif("52443162A");
		persona.setNombre("Emma");
		persona.setApellidos("Ciambrino Baz");
		persona.setTelefono("669 97 90 80");
		persona.setEmail("emma.ciambrino@gmail.com");
		persona.setEdad(38);
		persona.setAltura(1.62);
		persona.setPeso(58.0);
		persona.setCasado(true);
	}

	@Test
	public void testConstructorParametros() {
		persona = new Persona("53016164Z", "Daniel", "Pompa Pareja", "648 11 99 48", 
				"daniel.pompa@gamil.com", 45, 1.77, 78, true);

		assertThat(persona, Matchers.notNullValue());
		assertThat(persona.getNif(), Matchers.is("53016164Z"));
		assertThat(persona.getNombre(), Matchers.is("Daniel"));
		assertThat(persona.getApellidos(), Matchers.is("Pompa Pareja"));
		assertThat(persona.getTelefono(), Matchers.is("648 11 99 48"));
		assertThat(persona.getEmail(), Matchers.is("daniel.pompa@gamil.com"));
		assertThat(persona.getEdad(), Matchers.is(45));
		assertThat(persona.getAltura(), Matchers.is(1.77));
		assertThat(persona.getPeso(), Matchers.is(78.0));
		assertThat(persona.isCasado(), Matchers.is(true));
	}

}
