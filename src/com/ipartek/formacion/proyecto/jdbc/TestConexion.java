package com.ipartek.formacion.proyecto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConexion {

	// static final String BD_NOMBRE = "tienda_animales";
	// static final String BD_SERVIDOR = "localhost"; // 127.0.0.1
	// static final String BD_PUERTO = "3306";

	static final String BD_USUARIO = "root";
	static final String BD_PASS = "";
	static final String BD_URL = "jdbc:mysql://192.168.0.47:3306/tienda_animales?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public static void main(String[] args) {

		try {

			// 1. acordarse de meter el .jar o driver para la base datos
			Class.forName("com.mysql.jdbc.Driver");

			// 2. Establecer conexion
			Connection conexion = DriverManager.getConnection(BD_URL, BD_USUARIO, BD_PASS);

			System.out.println("Hemos conectado");

			// 2. crear la sentencia SQL
			String sqlQuery = "SELECT id, nombre from gato;";
			PreparedStatement pst = conexion.prepareStatement(sqlQuery);

			// 3. Ejecutar la sentencia y recoger Resultado
			ResultSet rs = pst.executeQuery();

			// 4. Recorrer los resultados y mostrar por pantalla
			while (rs.next()) {

				int id = rs.getInt("id"); // usar el nombre de las columnas para acceder al dato
				String nombre = rs.getString("nombre");

				System.out.printf(" %s %s \n", id, nombre);

			}

		} catch (SQLException e) {

			System.out.println("ERROR al acceder a la base datos");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Se te ha olvidado el driver, mete el .jar en el proyecto");
			e.printStackTrace();
		}

	}

}
