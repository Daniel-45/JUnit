package com.dam.teorias;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * 
 * @author Daniel
 *
 */

@RunWith(Theories.class)
public class TeoriasTestDataPoints {

	/** 
	 * Datos de origen
	 * Tienen que ser públicos y estáticos
	 * @DatPoints implica que hay un origen múltiple de datos
	 */
	@DataPoints
	public static String[] letras = {"A","B","C"} ;
	
	@DataPoint 
	public static Integer numero = 1;
	
	/**
	 * Theory es el equivalente de un test 
	 * en un método normal de JUnit
	 * La diferencia de @Theory con un método anotado con @Test
	 * es que @Theory acepta parámetros
	 * La teoría va a probar todas las posibles combinaciones de @DataPoints
	 * Se pueden combinar con @DataPoint
	 * 
	 */
	
	@Theory
	public void testTeorias(String cadena1, String cadena2, String cadena3,
			Integer numero) {
		System.out.println("Combinación: " + cadena1 + cadena2 + cadena3 + " - " + numero);
	}
	
}
