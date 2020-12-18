package com.dam.aserciones;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Daniel
 *
 */

public class UtilidadesPersonas {

	private Persona daniel, emma, carmen, oscar, roberto, hugo;
	private List<Persona> personas = new ArrayList<>();

	public UtilidadesPersonas() {
		daniel = new Persona("53016164Z", "Daniel", "Pompa Pareja", 45, 1.78, 78);
		emma = new Persona("53443162A", "Emma", "Ciambrino Baz", 38, 1.59, 58);
		carmen = new Persona("53248756C", "Carmen", "Ciambrino Baz", 36, 1.78, 68);
		oscar = new Persona("53258963X", "Oscar", "Pompa Pareja", 41, 1.75, 69);
		roberto = new Persona("53895247T", "Roberto", "Pompa Pareja", 38, 1.78, 82);
		hugo = new Persona("53645829H", "Hugo", "Ciambrino Baz", 37, 1.79, 86);

		personas.add(daniel);
		personas.add(emma);
		personas.add(carmen);
		personas.add(oscar);
		personas.add(roberto);
		personas.add(hugo);
	}

	public UtilidadesPersonas(Persona daniel, Persona emma) {
		this.daniel = daniel;
		this.emma = emma;
	}

	public Persona getDaniel() {
		return daniel;
	}

	public void setDaniel(Persona daniel) {
		this.daniel = daniel;
	}

	public Persona getEmma() {
		return emma;
	}

	public void setEmma(Persona emma) {
		this.emma = emma;
	}

	/** AssertArrayEquals */
	public Persona[] getPersonas() {
		Persona[] personas = { daniel, emma };
		return personas;
	}

	/**
	 * Busca en el Array de personas Si encuentra una con el mismo NIF devuelve la
	 * persona, en caso contrario develve null
	 * 
	 * @param nif
	 * @return persona/null
	 */
	public Persona buscarPorNif(String nif) {
		Persona persona = null;
		for (Persona p : personas) {
			if (p.getNif().equals(nif)) {
				persona = p;
			}
		}
		return persona;
	}

	/**
	 * Devuelve el objeto persona si existe, en caso contrario devuelve null El
	 * método contains devuelve un null si no existe el objeto, si existe hace una
	 * comparación con el método equals
	 * 
	 * @param persona
	 * @return
	 */
	public Persona devuelveObjeto(Persona persona) {
		if (personas.contains(persona)) {
			return persona;
		}
		return new Persona("51016164J", "John", "Doe");
	}
}
