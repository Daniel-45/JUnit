package com.dam.teorias;

import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TeoriasTestDataPointsNumeros {

	/** 
	 * Datos de origen
	 * Tienen que ser públicos y estáticos
	 * @DatPoints implica que hay un origen múltiple de datos
	 */
	@DataPoints
	public static int[] numeros = {1,2,3,4,5,6,7,8,9,0};
	
	/**
	 * Theory es el equivalente de un test 
	 * en un método normal de JUnit
	 * La diferencia de @Theory con un método anotado con @Test
	 * es que @Theory acepta parámetros
	 * La teoría va a probar todas las posibles combinaciones de @DataPoints
	 * 
	 */
	
	@Theory
	public void testTeorias(int numero1, int numero2) {
		System.out.println("Combinación: " + numero1 + " + " + numero2 
				+ " = " + numero2 + " + " + numero1);
		assertEquals(numero1 + numero2, numero2 + numero1);
	}

}
