package com.ipartek.formacion.proyecto.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.ipartek.formacion.proyecto.pojo.Gato;

public class EjercicicioCrudGatos {

	static Scanner sc = new Scanner(System.in);

	// static GatoArrayListDAO dao = new GatoArrayListDAO();
	static GatoDAO dao = new GatoDAO();

	// posibles opciones del usuario
	static final String OP_REPETIR = "s";
	static final String OP_REPETIR_2 = "si";
	static final String OP_LISTAR = "1";
	static final String OP_BUSCAR_NOMBRE = "2";
	static final String OP_CREAR = "3";
	static final String OP_ELIMINAR = "4";
	static final String OP_MODIFICAR = "5";

	static boolean repetir = false;
	static String opSeleccionada = "";

	public static void main(String[] args) {

		do {
			printarMenu();

			switch (opSeleccionada) {
			case OP_LISTAR:
				listar();
				break;

			case OP_BUSCAR_NOMBRE:
				buscarPorNombre();
				break;

			case OP_CREAR:
				crear();
				break;

			case OP_ELIMINAR:
				eliminar();
				break;
			case OP_MODIFICAR:
				modificar();
				break;

			default:
				System.out.println("*** Operacion no valida ***");
				break;
			}

			preguntarRepetir();

		} while (repetir);

		System.out.println("Agur, gracias por la visita");

	}

	private static void buscarPorNombre() {

		String nombre = JOptionPane.showInputDialog("Dime el Nombre del Gato");

		Gato g = dao.getByName(nombre);

		System.out.println(g);

	}

	private static void eliminar() {

		String nombre = JOptionPane.showInputDialog("Dime el Nombre del Gato");

		Gato g = new Gato();
		g.setNombre(nombre);

		if (dao.delete(g)) {
			System.out.println("Gato Eliminado ");
		} else {
			System.out.println("No podemos eliminar " + nombre + " seguramente no existe");
		}

	}

	private static void modificar() {

		// buscar gato a modificar
		String identificador = JOptionPane.showInputDialog("Dime la posicion del Gato");
		int id = Integer.parseInt(identificador);
		Gato gatoModificar = dao.getById(id);

		if (gatoModificar != null) {

			// pedir datos para modificar
			String nombreModificar = JOptionPane.showInputDialog("Dime el nuevo Nombre");
			gatoModificar.setNombre(nombreModificar);

			if (dao.update(gatoModificar)) {
				System.out.println("Gato Modificado");
			} else {
				System.out.println("ERROR Modificacion gato");
			}

		} else {
			System.out.println("No existe gato en esa posicion");
		}

	}

	private static void crear() {

		// pedir datos por consola, TODO validaciones
		String nombre = JOptionPane.showInputDialog("Dime el Nombre del Gato");

		// llamar al dao para crear
		Gato g = new Gato();
		g.setNombre(nombre);

		if (dao.create(g)) {
			System.out.println("Gato creado con exito " + g);
		} else {
			System.out.println("ERROR al crear gato");
		}

	}

	private static void printarMenu() {

		System.out.println("----------------------------");
		System.out.println("--------- CRUD GATOS -------");
		System.out.println("----------------------------");
		System.out.println("    1) Listar ");
		System.out.println("    2) Buscar por nombre ");
		System.out.println("    3) Dar de Alta nuevo Gato ");
		System.out.println("    4) Eliminar Gato ");
		System.out.println("    5) Modificar Gato ");
		System.out.println("----------------------------");
		System.out.println("Por favor selecciona una operacion: 1 - 5");
		opSeleccionada = sc.nextLine();
	}

	private static void listar() {

		System.out.println("\n \n 1. Listado Gatos");

		for (Gato g : dao.getAll()) {
			System.out.println(g);
		}

	}

	private static void preguntarRepetir() {

		System.out.println("¿ Desea repetir alguna operacion ?  (S)i (N)o ");
		opSeleccionada = sc.nextLine();

		if (OP_REPETIR.equalsIgnoreCase(opSeleccionada) || OP_REPETIR_2.equalsIgnoreCase(opSeleccionada)) {
			repetir = true;
		} else {
			repetir = false;
		}

	}

}
