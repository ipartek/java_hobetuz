package com.ipartek.formacion.proyecto.pojo;

public class Animal {

	private String nombre;
	private String raza;
	private float peso;
	private boolean vacunado;

	public Animal() {
		super(); // Object
		this.nombre = "";
		this.raza = "";
		this.peso = 0;
		this.vacunado = false;
	}

	public Animal(String nombre) {
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

	public String sonido() {
		return "....... sin sonido .........";
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", vacunado=" + vacunado + "]";
	}

}
