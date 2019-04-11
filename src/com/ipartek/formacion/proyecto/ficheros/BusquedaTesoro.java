package com.ipartek.formacion.proyecto.ficheros;

/**
 * Dada una direccion de una carpeta Buscar dentro de todos sus ficheros la
 * palabra 'tesoro' pistas: recorrer recursivamente leer linea a linea los
 * ficheros de texto;
 * 
 * @author ur00
 *
 */
public class BusquedaTesoro {

	public static void main(String[] args) {

		String linea1 = "Lorem ispoum tesoro atisum poi";
		String linea2 = "Lorem ispoum atisum poi";

		System.out.println(linea1.indexOf("tesoro"));
		System.out.println(linea2.indexOf("tesoro"));

	}

}
