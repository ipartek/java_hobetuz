package com.ipartek.formacion.proyecto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CadenaTextoStringTest {

	@Test
	public void testContarLetras() {

		assertEquals(0, CadenaTextoString.contarLetras(null, 'a'));
		assertEquals(2, CadenaTextoString.contarLetras("asa", 'a'));
		assertEquals(2, CadenaTextoString.contarLetras("Asa", 'a'));
		assertEquals(0, CadenaTextoString.contarLetras("As a 7", '2'));
		assertEquals(0, CadenaTextoString.contarLetras("As a 7222", '2'));
		assertEquals(0, CadenaTextoString.contarLetras("", 'a'));
	}

	@Test
	public void testDarVuelta() {

		assertEquals("", CadenaTextoString.darVuelta(null));
		assertEquals("", CadenaTextoString.darVuelta(""));
		assertEquals("aloh", CadenaTextoString.darVuelta("hola"));
		assertEquals(" aloh ", CadenaTextoString.darVuelta(" hola "));

	}

}
