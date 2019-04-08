package com.ipartek.formacion.proyecto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

	@Test
	public void testIsPalindromo() {

		assertFalse("caso null", CadenaTextoString.isPalindromo(null));
		assertFalse("cadena vacia", CadenaTextoString.isPalindromo(""));
		assertFalse(CadenaTextoString.isPalindromo("anaa"));

		assertTrue("caso simple", CadenaTextoString.isPalindromo("ana"));
		assertTrue("mayusculas y minusculas", CadenaTextoString.isPalindromo("Ana"));
		assertTrue("espacios en blanco", CadenaTextoString.isPalindromo(" Ana  "));

	}

}
