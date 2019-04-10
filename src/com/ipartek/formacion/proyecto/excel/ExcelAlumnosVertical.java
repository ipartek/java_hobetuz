package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAlumnosVertical {

	static final String[] ALUMNOS = { "ander", "ione", "itziar", "mikel", "ibon", "miguel", "pedro", "diosdado",
			"sergio", "jon", "sara" };

	public static void main(String[] args) throws Exception {

		// definiendo el excel
		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja = libro.createSheet();

		// rellenando las celdas
		for (int i = 0; i < ALUMNOS.length; i++) {

			XSSFRow fila = hoja.createRow(i);

			// Celda alumno
			XSSFCell cell = fila.createCell(0);
			cell.setCellValue(ALUMNOS[i]);

			// Celda tiempo
			XSSFCell cellTiempo = fila.createCell(1);
			LocalDateTime now = LocalDateTime.now();
			cellTiempo.setCellValue(now.toString());
		}

		// escribir excel en fichero del pc
		File file = new File("C:\\hobetuz\\alumnos-vertical.xlsx");
		FileOutputStream fileOuS = new FileOutputStream(file);
		libro.write(fileOuS);
		fileOuS.flush();
		fileOuS.close();

	}

}
