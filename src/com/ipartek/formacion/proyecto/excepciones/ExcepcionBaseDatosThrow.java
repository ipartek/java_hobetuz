package com.ipartek.formacion.proyecto.excepciones;

public class ExcepcionBaseDatosThrow {

	public static void main(String[] args) {

		System.out.println("Conectando a base datos de null .....");
		boolean isConected;
		try {
			isConected = conectarBaseDatos(null);
			if (isConected) {
				System.out.println("Conexion realiza con exito");
			} else {
				System.out.println("No podemos conectarnos");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Conectando a base datos de Ipartek .....");
		try {
			conectarBaseDatos("Ipartek");
			System.out.println("conectado");
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	/**
	 * Simular que nos conectamos a una bbdd
	 * 
	 * @param nombreBaseDatos String
	 * @return true si conecta, false en caso contrario
	 * @throws Exception nombreBaseDatos == null || nombreBaseDatos == ""
	 */
	static boolean conectarBaseDatos(String nombreBaseDatos) throws Exception {
		boolean resul = false;
		if (nombreBaseDatos != null && !"".equals(nombreBaseDatos)) {
			resul = true;
		} else {
			throw new Exception("ConexionException, este mensaje es nuestro o personalizado");
		}
		return resul;
	}

}
