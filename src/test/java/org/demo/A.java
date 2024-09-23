package org.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class A {

public ArrayList<Integer> m1(){
	int a=20, b=30, c=40;
	ArrayList<Integer> i=new ArrayList<Integer>();
	i.add(a);
	i.add(b);
	i.add(c);
	return i;
}
	public static void main(String[] args) {
		
		A a=new A();
		ArrayList<Integer> m1 = a.m1();
		System.out.println(m1);
		
	}
	
	


}
