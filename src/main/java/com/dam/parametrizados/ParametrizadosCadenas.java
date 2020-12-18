package com.dam.parametrizados;

/**
 * 
 * @author Daniel
 *
 */

public class ParametrizadosCadenas {

	/**
	 * Concatena tres String pasados por parámetro
	 * 
	 * @param cadena1 -> String
	 * @param cadena2 -> String
	 * @param cadena3 -> String
	 * @return cadena1 + cadena2 + cadena3
	 */
	public String concatenar(String cadena1, String cadena2, String cadena3) {

		if (cadena1 != null && cadena2 != null && cadena3 != null) {
			return cadena1.concat(" ").concat(cadena2).concat(" ").concat(cadena3);
		}

		return null;
	}

}
