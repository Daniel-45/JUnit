package com.dam.aserciones;

/**
 * 
 * @author Daniel
 *
 */
public class Persona {

	private String nif;
	private String nombre;
	private String apellidos;
	private int edad;
	private double altura;
	private double peso;

	public Persona() {

	}

	public Persona(String nif, String nombre, String apellidos) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String nif, String nombre, String apellidos, int edad) {

		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Persona(String nif, String nombre, String apellidos, int edad, double altura, double peso) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean equals(Object objeto) {
		boolean igual = false;
		Persona persona = (Persona) objeto;

		if (nif != null) {

			if (nif.equalsIgnoreCase(persona.getNif())) {
				igual = true;
			}
		}
		return igual;
	}

}
