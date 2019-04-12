package com.ipartek.formacion.proyecto.pojo;

public class Gato {

	private String nombre;
	private String raza;
	private float peso;
	private boolean vacunado;

	public Gato() {
		super();
		this.nombre = "";
		this.raza = "cruce";
		this.peso = 0;
		this.vacunado = false;
	}

	public Gato(String nombre) {
		this();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", vacunado=" + vacunado + "]";
	}

}
