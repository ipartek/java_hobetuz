package com.ipartek.formacion.proyecto.pojo;

public final class PerroPresa extends Perro {

	public PerroPresa(String nombre, String raza) {
		super(nombre, raza);
	}

	@Override
	public String sonido() {
		return "Grrrrrrrrrrrrrrrr";
	}

}
