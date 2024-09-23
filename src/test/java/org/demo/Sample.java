package org.demo;

import java.io.IOException;

public class Sample extends BaseClass {

	public static void main(String[] args) throws IOException {

		Sample s = new Sample();
		String cellData = s.getCellData("Sign Up", 3, 0);
		System.out.println(cellData);

		s.createCellAndSetCellData("Sign Up", 6, 8, "NewcellData");
		
	}
}
