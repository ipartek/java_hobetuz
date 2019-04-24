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
	public Gato getById(int id) {
		Gato resul = null;
		for (Gato g : lista) {
			if (g.getId() == id) {
				resul = g;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean create(Gato g) {
		return lista.add(g);
	}

	@Override
	public boolean delete(Gato g) {
		boolean resul = false;
		if (g != null) {

			Gato gato = null;
			for (int i = 0; i < lista.size(); i++) {
				gato = lista.get(i);
				if (gato.getNombre().equalsIgnoreCase(g.getNombre())) {
					lista.remove(i);
					resul = true;
					break;
				}
			} // for

		}
		return resul;
	}

	@Override
	public boolean update(Gato gModificar) {
		boolean resul = false;
		if (gModificar != null) {
			for (Gato gIteracion : lista) {
				if (gIteracion.getId() == gModificar.getId()) {
					gIteracion = gModificar;
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

}
