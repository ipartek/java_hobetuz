package com.ipartek.formacion.proyecto.colecciones;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.formacion.proyecto.pojo.Gato;
import com.ipartek.formacion.proyecto.pojo.Ordenable;
import com.ipartek.formacion.proyecto.pojo.Pais;
import com.ipartek.formacion.proyecto.pojo.PaisGatoComparator;

public class ColeccionDeInterfaz {

	public static ArrayList<Ordenable> lista;

	public static void main(String[] args) {

		lista = new ArrayList<Ordenable>();

		Gato gato = new Gato();
		gato.setNombre("Garfiled");
		gato.setPeso(7.5f);

		Pais pais = new Pais();
		pais.setNombre("Angola");
		pais.setPoblacion(3.4f);

		lista.add(gato);
		lista.add(pais);

		System.out.println(lista);

		for (Ordenable elemento : lista) {

			// System.out.println(elemento.saludar());

			if (elemento instanceof Gato) {
				Gato e = (Gato) elemento;
				System.out.println(e.getNombre());
			} else {
				Pais e = (Pais) elemento;
				System.out.println(e.getNombre());
			}
		} // for

		Collections.sort(lista, new PaisGatoComparator());
		System.out.println(lista);
//		lista.sort(new PaisGatoComparator());

	}

}
