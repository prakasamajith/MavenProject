package org.demo;

public class Singleton {

	static Singleton emp;

	private void Singleton() {
		System.out.println("Default const....");
	}

	public static Singleton getObjectInstance() {
		if (emp == null) {
			emp = new Singleton();
		}
		return emp;

	}

	public void getEmpAddress() {
		System.out.println("Chennai");
		
	}

	public void getId() {
		System.out.println("12");
	}

	public void getName() {
		System.out.println("Bala");
	}

	
	
}
