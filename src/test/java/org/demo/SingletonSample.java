package org.demo;

public class SingletonSample{

	
	public static void main(String[] args) {
		
		
		Singleton e1 = Singleton.getObjectInstance();
		e1.getEmpAddress();
		e1.getId();
		e1.getName();

		Singleton e2 = Singleton.getObjectInstance();
		e2.getEmpAddress();
		e2.getId();
		e2.getName();

		Singleton e3 = Singleton.getObjectInstance();
		e3.getEmpAddress();
		e3.getId();
		e3.getName();

	}
	
	
}
