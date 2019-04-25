package com.ipartek.formacion.proyecto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	static final String BD_USUARIO = "root";
	static final String BD_PASS = "";
	static final String BD_URL = "jdbc:mysql://192.168.0.47:3306/tienda_animales";

	public static Connection getConexion() {

		Connection con = null;
		try {
			// acordarse de meter el .jar o driver para la base datos
			Class.forName("com.mysql.jdbc.Driver");

			// Establecer conexion con la base datos
			con = DriverManager.getConnection(BD_URL, BD_USUARIO, BD_PASS);

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;

	}

}
