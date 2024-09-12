package org.demo;

public class Tes {

	public Tes() {

	System.out.println("Default con");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object des");
	}
public static void main(String[] args) {
	Tes t=new Tes();
	t=null;
	System.gc();
	
}
		
}

