package com.entornos.FernandoJesusFernandezTrujillo.arrays;
/**
 * 
 * @author Fernando Jesus Fernandez Trujillo
 * @version 1.0
 *
 */
public abstract class MisArrays {

		/**
		 * 
		 * @param array  entra un array por parametro
		 * @return devuelve la media del array
		 */
		public static double media(int[] array) {
			int suma=0;
			for(int i=0;i<array.length;i++) {		
				suma=suma+array[i];
			}
			return suma/array.length;
		}

	}


