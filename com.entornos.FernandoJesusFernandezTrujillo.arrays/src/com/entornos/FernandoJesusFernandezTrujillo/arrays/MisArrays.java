package com.entornos.FernandoJesusFernandezTrujillo.arrays;

import java.util.Arrays;

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
		/**
		 * 
		 * @param array entra un array como parametro
		 * @return devuelve la mediana del array
		 */
		public static double mediana(int[] array) {
			Arrays.sort(array);

		    double result;

		    if (array.length % 2 == 0) {
		      int pos = (array.length - 2) / 2;
		      result = (((array[pos] ) + array[pos + 1]) / 2);
		    } else {
		      int pos = (array.length - 1) / 2;
		      result =array[pos];
		    }

		    return result;
		}

	}


