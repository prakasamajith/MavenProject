package org.demo;

public class Animal extends Tes {

	public void sound() {
		System.out.println("This is Animal");
}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Tes t = new Tes();
		t.sound();
	}
}
