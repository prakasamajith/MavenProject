package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Tes {


	public static void main(String[] args) throws IOException {
		
	
		String res = "";

		File file = new File("C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Sample\\Excel Sheet\\Test Data.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Login");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(0);

		CellType type = cell.getCellType();

		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			System.out.println(res);

			break;

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
				res = dateFormat.format(dateCellValue);

			} else {

				double numericCellValue = cell.getNumericCellValue();

				long round = Math.round(numericCellValue);
				if (numericCellValue == round) {
					res = String.valueOf(round);

				} else {
					res = String.valueOf(numericCellValue);
				}

			}

			break;

		default:
			break;
		}
		
	
}
}
