package com.ipartek.formacion.proyecto.pojo;

public class Pais implements Comparable<Pais> {

	private String nombre;
	private float poblacion; // millones de personas
	private int superficie; // km cuadrados
	private boolean oro;
	private boolean petroleo;

	public Pais() {
		super();
		this.nombre = "";
		this.poblacion = 0;
		this.superficie = 0;
		this.oro = false;
		this.petroleo = false;
	}

	public Pais(String nombre, float poblacion) {
		this(); // super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(float poblacion) {
		this.poblacion = poblacion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public boolean isOro() {
		return oro;
	}

	public void setOro(boolean oro) {
		this.oro = oro;
	}

	public boolean isPetroleo() {
		return petroleo;
	}

	public void setPetroleo(boolean petroleo) {
		this.petroleo = petroleo;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", poblacion=" + poblacion + ", superficie=" + superficie + ", oro=" + oro
				+ ", petroleo=" + petroleo + "]";
	}

	@Override
	public int compareTo(Pais o) {
		float p = this.getPoblacion() - o.getPoblacion();
		return (p >= 0) ? 1 : -1;
	}

}
