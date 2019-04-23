package com.ipartek.formacion.proyecto.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.ipartek.formacion.proyecto.pojo.Pais;
import com.ipartek.formacion.proyecto.pojo.PaisNombreComparator;

public class ArrayListtPaisEjercicio {

	public static void main(String[] args) {

		// ArrayList<String> paises = new ArrayList<String>();
		ArrayList<Pais> paises = new ArrayList<Pais>();

		// crear paises
		Pais belgica = new Pais("Belgica", 3f);

		Pais luxemburgo = new Pais("Luxemburgo", 1f);

		Pais laRreinta = new Pais("LaRREineta", 0.001f);
		laRreinta.setOro(true);

		Pais argelia = new Pais("Argelia", 5.2f);
		argelia.setPetroleo(true);

		Pais angola = new Pais("Angola", 4.3f);
		angola.setOro(true);
		angola.setPetroleo(true);

		// insertar en lista
		paises.add(belgica);
		paises.add(luxemburgo);
		paises.add(argelia);
		paises.add(laRreinta);
		paises.add(angola);

		System.out.println("-----------------------------------");
		System.out.println("Antes Ordenar");
		System.out.println("-----------------------------------");
		for (Pais pais : paises) {
			System.out.printf("%-20s %-6s millones de personas \n", pais.getNombre(), pais.getPoblacion());
		}

		// System.out.println(paises);

		System.out.println("-----------------------------------");
		System.out.println("Despues Ordenar");
		System.out.println("-----------------------------------");

		Collections.sort(paises);
		Collections.reverse(paises);

		// listado de paises ordenado alfabeticamente
		for (Pais pais : paises) {
			System.out.printf("%-20s %-6s millones de personas \n", pais.getNombre(), pais.getPoblacion());
		}

		System.out.println("-----------------------------------");
		System.out.println("Ordenados Alfabeticamente [A-Z]");
		System.out.println("-----------------------------------");

		Collections.sort(paises, new PaisNombreComparator());

		// listado de paises ordenado alfabeticamente
		for (Pais pais : paises) {
			System.out.printf("%-20s %-6s millones de personas \n", pais.getNombre(), pais.getPoblacion());
		}

		System.out.println("-----------------------------------");
		System.out.println("Ordenados Alfabeticamente [Z-A] con comparing j1.8");
		System.out.println("-----------------------------------");

		Collections.sort(paises, Comparator.comparing(Pais::getNombre).reversed());

		for (Pais pais : paises) {
			System.out.printf("%-20s %-6s millones de personas \n", pais.getNombre(), pais.getPoblacion());
		}

		// listado de paises con oro
		System.out.println("-----------------------------------");
		System.out.println("Listado paises con ORO:");
		System.out.println("-----------------------------------");
		for (Pais pais : paises) {
			if (pais.isOro()) {
				System.out.println(pais.getNombre());
			}
		}

		// listado de paises con petroleo
		System.out.println("-----------------------------------");
		System.out.println("Listado paises con PETROLEO:");
		System.out.println("-----------------------------------");
		for (Pais pais : paises) {
			if (pais.isPetroleo()) {
				System.out.println(pais.getNombre());
			}
		}

	}

}
