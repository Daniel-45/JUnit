package com.dam.calculadora;

/**
 * 
 * @author Daniel
 *
 */

public class Calculadora2 {

	// Guarda el último resultado
	private int ans;

	// Constructor
	public Calculadora2() {
		ans = 0;
	}

	// Métodos
	public int suma(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int resta(int a, int b) {
		ans = a - b;
		return ans;
	}

	public int multiplicacion(int a, int b) {
		ans = a * b;
		return ans;
	}

	public int division(int a, int b) {
		ans = a / b;
		return ans;
	}

	public void clear() {
		ans = 0;
	}

	// Método para comprobar excepción
	public int divisionPorCero(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("\nNo se pueder dividir por cero!!");
		}
		ans = a / b;
		return ans;
	}

	public void operacionOptima() {
		try {
			Thread.sleep(500);
			// Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println("\nERROR!! " + e.getMessage());
		}
	}

	// Método acumulativo se le pasa un único valor Lo suma al valor de 'ans'
	public int addSuma(int v) {
		ans += v;
		return ans;
	}

	// Método acumulativo se le pasa un único valor Lo resta al valor de 'ans'
	public int addResta(int v) {
		ans -= v;
		return ans;
	}

	// Método acumulativo se le pasa un único valor Lo multiplica al valor de 'ans'
	public int addMultiplicacion(int v) {
		ans *= v;
		return ans;
	}

	// Método acumulativo se le pasa un único valor Lo divide al valor de 'ans'
	public int addDivision(int v) {
		ans /= v;
		return ans;
	}

	// Método que devuelve el valor de 'ans'
	public int ans() {
		return ans;
	}

}
