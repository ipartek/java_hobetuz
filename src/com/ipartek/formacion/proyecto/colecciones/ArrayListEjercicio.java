package com.ipartek.formacion.proyecto.colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEjercicio {

	public static void main(String[] args) {

		ArrayList<String> paises = new ArrayList<String>();

		if (paises.size() == 0) {
			System.out.println("Todavia no Existen paises");
		} else {
			System.out.println("Existen paises");
		}

		paises.add("Belgica"); // 0
		paises.add("Luxemburgo"); // 1
		paises.add("Argelia"); // 2
		paises.add("LaRReineta"); // 3

		if (paises.isEmpty()) {
			System.out.println("Todavia no Existen paises");
		} else {
			System.out.println("Existen paises " + paises);
		}

		System.out.println("Numero de paises = " + paises.size());

		System.out.println(paises);
		paises.remove(3); // eliminamos "LaRReineta" por posicion
		System.out.println(paises);
		paises.remove("Luxemburgo"); // eliminamos "Luxemburgo" por Objeto
		System.out.println(paises);

		paises.add(1, "Burkina faso");
		System.out.println(paises);

		// for int i = 0
		for (int i = 0; i < paises.size(); i++) {
			String pais = paises.get(i);
			System.out.printf("posicion %s pais %s \n", i, pais);
		}

		// foreach
		for (String pais : paises) {
			System.out.printf("posicion %s pais %s \n", paises.indexOf(pais), pais);
		}

		// iterator
		Iterator<String> it = paises.iterator();
		while (it.hasNext()) {
			String pais = it.next();
			System.out.printf("pais %s \n", pais);
		}

		if (paises.indexOf("España") == -1) {
			System.out.println("No existe España");
		} else {
			System.out.println("Hemos encontrado España");
		}

		paises.add("España");

		if (paises.indexOf("España") == -1) {
			System.out.println("No existe España");
		} else {
			System.out.println("Hemos encontrado España");
		}

		System.out.println(paises);
		System.out.println("ordenar alfabeticamente");
		paises.sort(null);
		System.out.println(paises);

	}

}
