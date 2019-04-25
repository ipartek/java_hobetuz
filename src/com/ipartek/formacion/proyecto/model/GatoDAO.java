package com.ipartek.formacion.proyecto.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ipartek.formacion.proyecto.jdbc.ConnectionManager;
import com.ipartek.formacion.proyecto.pojo.Gato;

public class GatoDAO implements IPersistible<Gato> {

	static final String SQL_GET_ALL = "SELECT id, nombre from gato ORDER BY id DESC;";
	static final String SQL_GET_BY_ID = "SELECT id, nombre from gato WHERE id = ?;";
	static final String SQL_GET_BY_NOMBRE = "SELECT id, nombre from gato WHERE nombre = ? ORDER BY id DESC LIMIT 1;";
	static final String SQL_INSERT = "INSERT INTO `gato` (`nombre`) VALUES (?);";

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
		Gato gato = null;
		try (Connection con = ConnectionManager.getConexion();
				PreparedStatement pst = con.prepareStatement(SQL_GET_BY_ID)) {

			// cambiamos ? por parametro id
			pst.setInt(1, id);

			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					int identificador = rs.getInt("id");
					String nombre = rs.getString("nombre");
					gato = new Gato(identificador, nombre);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gato;
	}

	public Gato getByName(String nombre) {
		Gato gato = null;
		try (Connection con = ConnectionManager.getConexion();
				PreparedStatement pst = con.prepareStatement(SQL_GET_BY_NOMBRE)) {

			// cambiamos ? por parametro nombre
			pst.setString(1, nombre);

			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String nom = rs.getString("nombre");
					gato = new Gato(id, nom);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gato;
	}

	@Override
	public boolean create(Gato pojo) {
		boolean resul = false;
		if (pojo != null) {

			try (Connection con = ConnectionManager.getConexion();
					PreparedStatement pst = con.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS)) {

				pst.setString(1, pojo.getNombre());

				// realizar la insert
				if (pst.executeUpdate() == 1) {

					// recuperar el ID generado
					ResultSet rs = pst.getGeneratedKeys();
					while (rs.next()) {
						int idGenerada = rs.getInt(1);
						pojo.setId(idGenerada);
						resul = true;
					}

				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return resul;
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
