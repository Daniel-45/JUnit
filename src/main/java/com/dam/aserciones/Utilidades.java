package com.dam.aserciones;

/**
 * 
 * @author Daniel
 *
 */

public class Utilidades {

	/**
	 * Concatena dos String pasados por parámetro
	 * 
	 * @param cadena1 -> primer String
	 * @param cadena2 -> segundo String
	 * @return cadena1 + cadena2
	 */
	public String concatenar(String cadena1, String cadena2) {

		if (cadena1 != null && cadena2 != null) {
			return cadena1.concat(cadena2);
		}

		return null;
	}

	/**
	 * Ejemplo "H", "o", "l", "a" -> String[] array = ["H", "o", "l", "a"]; 
	 * array[0] = "H" 
	 * array[1] = "o" 
	 * array[2] = "l" 
	 * array[3] = "a"
	 * 
	 * @param strings
	 * @return String[strings.lenght]
	 */
	public String[] getArrayStrings(String... strings) {

		String[] array = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			array[i] = strings[i];
		}

		return array;
	}

	/**
	 * Devuelve true para números superiores a 10 Devuelve false para números
	 * inferiores a 10
	 * 
	 * @param numero
	 * @return boolean
	 */
	public boolean numeroMayor(int numero) {

		return numero > 10;

	}

}
