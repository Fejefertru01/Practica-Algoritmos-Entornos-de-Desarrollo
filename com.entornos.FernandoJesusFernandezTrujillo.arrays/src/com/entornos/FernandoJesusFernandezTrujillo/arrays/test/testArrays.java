package com.entornos.FernandoJesusFernandezTrujillo.arrays.test;
import com.entornos.FernandoJesusFernandezTrujillo.arrays.MisArrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestArrays {
	int array1[],array2[],array3[];
	
	@BeforeAll
	void iniciar() {
		array1 = new int[]{1,2,3,6,8};
		array2 = new int[]{3,2,3,6,8};
		array3 = new int[]{4,6,3,8,9,1};
	}
	@Test
	void testMedia() {
		assertEquals(4,Math.round(MisArrays.media(array1)));
		assertEquals(4,Math.round(MisArrays.media(array2)));
		assertEquals(5,Math.round(MisArrays.media(array3)));
	}
	@Test
	void testMediana() {
		assertEquals(3,MisArrays.mediana(array1));
		assertEquals(3,MisArrays.mediana(array2));
		assertEquals(5,MisArrays.mediana(array3));
	}
	@Test
	void testMaximo() {
		assertEquals(8,MisArrays.maximo(array1));
		assertEquals(8,MisArrays.maximo(array2));
		assertEquals(9,MisArrays.maximo(array3));
	}
	@Test
	void testMinimo() {
		assertEquals(1,MisArrays.minimo(array1));
		assertEquals(2,MisArrays.minimo(array2));
		assertEquals(1,MisArrays.minimo(array3));
	}
}
