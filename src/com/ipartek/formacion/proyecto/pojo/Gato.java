package com.ipartek.formacion.proyecto.pojo;

public class Gato extends Animal implements ISaludar, Ordenable {

	boolean cascabel;

	public Gato() {
		super();
		this.cascabel = false;
	}

	public Gato(String nombre) {
		super(nombre);
		this.cascabel = false;
		this.setRaza("cruce");
	}

	public Gato(String nombre, String raza) {
		super(nombre);
		this.cascabel = false;
		this.setRaza(raza);
	}

	public boolean isCascabel() {
		return cascabel;
	}

	public void setCascabel(boolean cascabel) {
		this.cascabel = cascabel;
	}

	@Override
	public String sonido() {
		// return super.sonido();
		return "Miauuuuuuuuuuuuuuuuuuuuuu";
	}

	@Override
	public String toString() {

		return super.toString() + " Gato [cascabel=" + cascabel + "]";
	}

	@Override
	public String saludar() {
		return "Miauuuuuuuuuuuuuuu";
	}

	@Override
	public float getValor() {
		return this.getPeso();
	}

}
