package com.ipartek.formacion.proyecto.model;

import java.util.ArrayList;

import com.ipartek.formacion.proyecto.pojo.Gato;

public class EjercicicioCrudGatos {

	public static void main(String[] args) {

		// objeto para gestionar el CRUD de los gatos
		GatoArrayListDAO dao = new GatoArrayListDAO();

		dao.create(new Gato("Garfield"));
		dao.create(new Gato("Mitxi"));

		ArrayList<Gato> gatos = dao.getAll();
		for (Gato gato : gatos) {
			System.out.println(gato);
		}

	}

}
