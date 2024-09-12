package org.demo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

	try {
		int a=10/0;
		System.out.println(a);
	}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	finally {
		System.out.println("This is in Finally Block");
	}
	
	
	}

}
