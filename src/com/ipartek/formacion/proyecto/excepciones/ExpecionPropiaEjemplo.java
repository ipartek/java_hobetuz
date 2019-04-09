package com.ipartek.formacion.proyecto.excepciones;

public class ExpecionPropiaEjemplo {

	public static void main(String[] args) {

		try {
			reproducirCancion("Marea Gora - Koma");
			reproducirCancion("dime tu nombre");
			reproducirCancion("Klika Korrika");
		} catch (Exception e) {

			System.out.println("*** " + e.getMessage());

		}

	}

	static void reproducirCancion(String cancion) throws CancionException {

		if (CancionException.CANCION_PROHIBIDA.equals(cancion)) {
			throw new CancionException(CancionException.MENSAJE);
		} else {
			System.out.println("Reproducion " + cancion);
		}

	}

}
