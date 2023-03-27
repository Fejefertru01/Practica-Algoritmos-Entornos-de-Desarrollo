package com.entornos.FernandoJesusFernandezTrujillo.algoritmos;
/**
 * 
 * @author Fernando Jesus Fernandez Trujillo
 * @version 1.0
 *
 */
public class Principal {

	public static void main(String[] args) {
		//Creo el array de numeros vacio
		int[]numeros= new int[5];
		//Relleno el array con numeros aleatorios de 1 a 100
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=(int)(Math.random()*(20+1));
		}
		//Creo el array que se va a rellenar con los resultados del numero de fibonacci
		int []resultadoFibonacci =new int[5];
		//Relleno el array de resultados de fibonacci
		for(int i=0;i<numeros.length;i++) {
				resultadoFibonacci[i]=algoritmos.fibonacci(numeros[i]);
			
		}
		//Creo el array que se va a rellenar con los resultados del numero de factorial
		long []resultadoFactorial =new long[5];
		//Relleno el array de resultados de los factoriales
		for(int i=0;i<numeros.length;i++) {
		resultadoFactorial[i]=algoritmos.factorial(numeros[i]);
			
		}
		//Creo el array que se va a rellenar con los resultados del numero primo
		boolean []resultadoPrimos =new boolean[5];
		//Relleno el array de resultados de los primos
		for(int i=0;i<numeros.length;i++) {
		resultadoPrimos[i]=algoritmos.Primo(numeros[i]);
					
				}
	}

}
