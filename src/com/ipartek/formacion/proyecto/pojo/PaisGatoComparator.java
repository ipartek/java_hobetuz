package com.ipartek.formacion.proyecto.pojo;

import java.util.Comparator;

public class PaisGatoComparator implements Comparator<Ordenable> {

	@Override
	public int compare(Ordenable o1, Ordenable o2) {
		float v = o1.getValor() - o2.getValor();
		return (v >= 0) ? 1 : -1;
	}

}
