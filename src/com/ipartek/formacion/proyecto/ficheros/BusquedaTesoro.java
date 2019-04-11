package com.ipartek.formacion.proyecto.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Dada una direccion de una carpeta Buscar dentro de todos sus ficheros la
 * palabra 'tesoro' pistas: recorrer recursivamente leer linea a linea los
 * ficheros de texto;
 * 
 * @author ur00
 *
 */
public class BusquedaTesoro {

	public static void main(String[] args) throws Exception {

		// JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		JFileChooser jfc = new JFileChooser("C:\\hobetuz\\projecto");
		jfc.setDialogTitle("Selecciona una carpeta");
		jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		int returnValue = jfc.showOpenDialog(null);

		String palabra = JOptionPane.showInputDialog("Dime palabra a buscar?");

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			buscarPalabra(selectedFile, palabra);
		}

	}// main

	static private void buscarPalabra(File f, String palabra) throws Exception {

		if (f != null) {

			if (f.isDirectory()) {

				File[] files = f.listFiles();
				for (File fIteracion : files) {
					buscarPalabra(fIteracion, palabra);
				}

			} else {

				if (buscar(f, palabra)) {
					System.out.println("Encontrado");
				}
			}

		}

	}// buscarPalabra

	private static boolean buscar(File f, String palabra) throws Exception {
		boolean resul = false;
		if (palabra != null && f != null) {

			try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {

				String linea = br.readLine();
				int contLinea = 1;
				while (linea != null) {

					int pos = linea.indexOf(palabra);
					if (pos != -1) {
						resul = true;
						System.out.println(f.getAbsolutePath() + " Linea:" + contLinea + " posicion " + pos);
						break;
					}

					linea = br.readLine();
					contLinea++;
				} // while
			}
		}
		return resul;
	}// buscar

}
