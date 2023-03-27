package com.entornos.FernandoJesusFernandezTrujillo.algoritmos;
/**
 * 
 * @author Fernando Jesus Fernandez Trujillo
 * @version 1.0
 *
 */

public abstract class algoritmos {

/**
 * Recibe un número entero y devuelve el número de fibonacci de dicho número.
 * @param posicion
 * @return el numero de fibonacci del numero introducido.
 */
	public static int fibonacci(int numero) {
		int siguiente = 1, actual = 0, temporal = 0;
		for (int x = 1; x <= numero; x++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
		return actual;
	}
}
