package com.ipartek.formacion.proyecto.pojo;

public class Animal {

	private int id;
	private String nombre;
	private String raza;
	private float peso;
	private boolean vacunado;

	public Animal() {
		super(); // Object
		this.id = -1;
		this.nombre = "";
		this.raza = "cruce";
		this.peso = 0;
		this.vacunado = false;
	}

	public Animal(String nombre) {
		this();
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Animal [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", vacunado="
				+ vacunado + "]";
	}

}
