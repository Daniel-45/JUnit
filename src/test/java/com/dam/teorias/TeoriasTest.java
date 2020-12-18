package com.dam.teorias;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * 
 * @author Daniel
 *
 */

@RunWith(Theories.class)
public class TeoriasTest {

	/** 
	 * Datos de origen
	 * Tienen que ser públicos y estáticos
	 * Cada DataPoint representa un único dato
	 */
	@DataPoint
	public static String a = "Hola";
	
	@DataPoint
	public static String b = "Mundo";
	
	/**
	 * Theory es el equivalente de un test 
	 * en un método normal de JUnit
	 * La diferencia de @Theory con un método anotado con @Test
	 * es que @Theory acepta parámetros
	 * La teoría va a probar todas las posibles combinaciones de @DataPoint
	 * Ejemplo:
	 * aa
	 * ab
	 * ba
	 * bb
	 */
	
	@Theory
	public void testTeorias(String cadena1, String cadena2) {
		System.out.println("Combinación: " + cadena1 + " con " + cadena2);
	}
}
