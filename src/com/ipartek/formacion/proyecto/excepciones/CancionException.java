package com.ipartek.formacion.proyecto.excepciones;

public class CancionException extends Exception {

	// definir mensajes propios
	static final String MENSAJE = "Por dios otra vez esa cancion no!!!";

	static final String CANCION_PROHIBIDA = "dime tu nombre";

	public CancionException(String mensaje) {
		super(mensaje);
	}

}
