package org.demo;


public class Test {

public static void main(String[] args) {
	
	try {
		int a=10/0;
		System.out.println(a);
	}
	catch(ArithmeticException d) {
		d.printStackTrace();
	}
	finally {
		System.out.println("i'm in Finally");
	}

} 
	






}
