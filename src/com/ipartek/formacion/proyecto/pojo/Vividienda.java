package com.ipartek.formacion.proyecto.pojo;

import java.util.ArrayList;
import java.util.HashMap;

public class Vividienda {

	private String tipo;

	public Vividienda() {
		super();
		this.tipo = "";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Casa [tipo=" + tipo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vividienda other = (Vividienda) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	public static void main(String[] args) {

		Vividienda c1 = new Vividienda();
		c1.setTipo("casa");

		Vividienda c2 = new Vividienda();
		c2.setTipo("casa");

		Vividienda c3 = c2;

		if (c1.equals(c2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son Diferentes");
		}

		HashMap<Integer, Vividienda> hmViviendas = new HashMap<Integer, Vividienda>();

		hmViviendas.put(23, c1);
		hmViviendas.put(2, c2);

		ArrayList<Vividienda> aVivienda = new ArrayList<Vividienda>();
		aVivienda.add(c1);
		aVivienda.add(c2);

		System.out.println(hmViviendas);

	}

}
