package com.ipartek.formacion.proyecto.excel;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAlumnos {

	static final String[] ALUMNOS = { "ander", "ione", "itziar", "mikel", "ibon", "miguel", "pedro", "diosdado",
			"sergio", "jon", "sara" };

	public static void main(String[] args) throws Exception {

		// definiendo el excel
		XSSFWorkbook libro = new XSSFWorkbook();
		XSSFSheet hoja = libro.createSheet();
		XSSFRow fila = hoja.createRow(0);

		// rellenando las celdas
		for (int i = 0; i < ALUMNOS.length; i++) {
			XSSFCell cell = fila.createCell(i);
			cell.setCellValue(ALUMNOS[i]);
		}

		// escribir excel en fichero del pc
		File file = new File("C:\\hobetuz\\alumnos.xlsx");
		FileOutputStream fileOuS = new FileOutputStream(file);
		libro.write(fileOuS);
		fileOuS.flush();
		fileOuS.close();

	}

}
