package com.dam.persona;

/**
 * 
 * @author Daniel
 *
 */

public class Persona {

	private String nif;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private int edad;
	private double altura;
	private double peso;
	private boolean casado;

	public Persona() {

	}

	public Persona(String nif, String nombre, String apellidos, String telefono, String email, 
			int edad, double altura, double peso, boolean casado) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.casado = casado;
	}

	public String getNif() {
		return nif;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public int getEdad() {
		return edad;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

}
