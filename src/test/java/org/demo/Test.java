package org.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Aji");
		s.add("Attur");
		s.add("India");
		for(int i=0;i<s.size();i++) {
			String string = s.get(i);
			System.out.println(string);
		}
	}
}
	
