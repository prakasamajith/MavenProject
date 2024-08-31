package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Sample\\Excel Sheet\\Sign Up.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sign Up");

		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
						
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
//				System.out.println(type);
			switch (type) {
			case STRING:
				String value = cell.getStringCellValue();
				System.out.println(value);
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMMM-YYYY");
					String format = dateFormat.format(dateCellValue);
					System.out.println(format);
				}
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(numericCellValue);
					String num = b.toString();
					System.out.println(num);
					break;
				}
				
				default:
				break;
			}
			}
			
			workbook.close();
}
		
		
}
		
		
	}


