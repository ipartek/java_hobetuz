package com.ipartek.formacion.proyecto.pojo;

import java.util.Comparator;

public class PaisNombreComparator implements Comparator<Pais> {

	@Override
	public int compare(Pais o1, Pais o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
