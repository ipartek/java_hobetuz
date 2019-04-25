package com.ipartek.formacion.proyecto.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ipartek.formacion.proyecto.jdbc.ConnectionManager;
import com.ipartek.formacion.proyecto.pojo.Gato;

public class GatoDAO implements IPersistible<Gato> {

	static final String SQL_GET_ALL = "SELECT id, nombre from gato ORDER BY id DESC;";

	@Override
	public ArrayList<Gato> getAll() {

		ArrayList<Gato> resul = new ArrayList<Gato>();

		try (Connection con = ConnectionManager.getConexion();
				PreparedStatement pst = con.prepareStatement(SQL_GET_ALL);
				ResultSet rs = pst.executeQuery();) {

			while (rs.next()) {

				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");

				Gato g = new Gato(id, nombre);
				resul.add(g);

			} // while

		} catch (Exception e) {

			e.printStackTrace();
		}

		return resul;
	}

	@Override
	public Gato getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Gato pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Gato pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Gato pojo) {
		// TODO Auto-generated method stub
		return false;
	}

}
