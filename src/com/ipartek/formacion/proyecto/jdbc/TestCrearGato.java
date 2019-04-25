package com.ipartek.formacion.proyecto.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestCrearGato {

	public static void main(String[] args) throws SQLException {

		String nueoGato = "Bisartxo";
		String sql = "INSERT INTO gato (nombre) VALUES ('" + nueoGato + "');";

		try (Connection conexion = ConnectionManager.getConexion();
				PreparedStatement pst = conexion.prepareStatement(sql);) {

			int affectedRows = pst.executeUpdate();

			System.out.println("Insertado " + affectedRows + " gato");

		}

	}

}
