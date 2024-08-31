package org.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		List<Integer> e = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			e.add(a[i]);

		}

		System.out.println(e);


	}
}
