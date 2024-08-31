package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	
	public static void main(String[] args) throws IOException {
			
			//1.find the path of Excel sheet
			File file=new File("C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Sample\\Excel Sheet\\Test Data.xlsx");
			//2.
			FileInputStream f=new FileInputStream(file);
			//3.Read the Excel Sheet
			Workbook workbook=new XSSFWorkbook(f);
			//4.Select the Sheet
			Sheet sheet = workbook.getSheet("Login");
			//5.
			
			for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				
				Cell cell;
				for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
					cell = row.getCell(j);
					System.out.println(cell);
				}
				
			}
			workbook.close();
			
			
			
			
			
			
			
			
			
		}

}
