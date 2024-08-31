package org.demo;

public class EmployeeNotFoundException extends Exception {

	@Override
	public String getMessage() {
		return "Not Found";
	}
	
}
