package com.ipartek.formacion.proyecto.model;

import java.util.ArrayList;

import com.ipartek.formacion.proyecto.pojo.Gato;

public class GatoArrayListDAO implements IPersistible<Gato> {

	private ArrayList<Gato> lista = new ArrayList<Gato>();

	@Override
	public ArrayList<Gato> getAll() {
		return lista;
	}

	@Override
	public Gato getByNombre(String nombre) {
		// TODO recorrer lista hasta encontrar nombre del gato
		return null;
	}

	@Override
	public boolean create(Gato g) {
		return lista.add(g);
	}

	@Override
	public boolean delete(Gato g) {
		// TODO remove
		return false;
	}

	@Override
	public boolean update(Gato g) {
		// TODO buscar y mofificar
		return false;
	}

}
