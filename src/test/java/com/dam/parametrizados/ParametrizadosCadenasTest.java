package com.dam.parametrizados;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author Daniel
 *
 */

@RunWith(Parameterized.class)
public class ParametrizadosCadenasTest {

	// Estructura para sustituir el constructor Los parámetros tienen que ser públicos

	@Parameter(0)
	public String cadena1;
	@Parameter(1)
	public String cadena2;
	@Parameter(2)
	public String cadena3;

	private ParametrizadosCadenas utilidades = new ParametrizadosCadenas();

	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(
				new Object[][] { { "Hola", "mundo", "!!" }, { "Adiós", "mundo", "!!" }, { "Soy", "una", "cadena" } });
	}

	@Test
	public void testConcatenaCadenas() {
		System.out.println("Ejecución: " + cadena1 + " " + cadena2 + " " + cadena3);
		assertEquals(cadena1 + " " + cadena2 + " " + cadena3, utilidades.concatenar(cadena1, cadena2, cadena3));
	}
}
