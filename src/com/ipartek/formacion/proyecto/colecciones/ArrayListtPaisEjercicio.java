package com.ipartek.formacion.proyecto.colecciones;

import java.util.ArrayList;

import com.ipartek.formacion.proyecto.pojo.Pais;

public class ArrayListtPaisEjercicio {

	public static void main(String[] args) {

		// ArrayList<String> paises = new ArrayList<String>();
		ArrayList<Pais> paises = new ArrayList<Pais>();

		// crear paises
		Pais belgica = new Pais("Belgica", 3f);

		Pais laRreinta = new Pais("LaRREineta", 0.001f);
		laRreinta.setOro(true);

		// insertar en lista
		paises.add(belgica);
		paises.add(laRreinta);

		System.out.println(paises);

		// listado de paises ordenado alfabeticamente

		// listado de paises ordenado por poblacion TODO para luego

		// listado de paises con oro

		// listado de paises con petroleo

	}

}
