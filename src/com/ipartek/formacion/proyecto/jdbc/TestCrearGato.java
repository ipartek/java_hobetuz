package com.ipartek.formacion.proyecto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestCrearGato {

	static final String BD_USUARIO = "root";
	static final String BD_PASS = "";
	static final String BD_URL = "jdbc:mysql://192.168.0.47:3306/tienda_animales?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static void main(String[] args) throws SQLException {

		String nueoGato = "Bisartxo";
		String sql = "INSERT INTO gato (nombre) VALUES ('" + nueoGato + "');";

		try (Connection conexion = DriverManager.getConnection(BD_URL, BD_USUARIO, BD_PASS);
				PreparedStatement pst = conexion.prepareStatement(sql);) {

			int affectedRows = pst.executeUpdate();

			System.out.println("Insertado " + affectedRows + " gato");

		}

	}

}
