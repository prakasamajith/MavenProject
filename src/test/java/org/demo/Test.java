package org.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Thangapandiyan P\\eclipse-workspace\\Sample\\Excel Sheet\\country.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("country");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");

		WebElement countryList = driver.findElement(By.id("country-list"));
		Select select = new Select(countryList);

		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);

		for (int i = 0; i < options.size(); i++) {
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			cell.setCellValue(text);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

}
