package com.tnsif.Constructorprogram;

public class ConstructorDemo {
	public static void main(String[] args) {
		ConstructorDemo c1 = new ConstructorDemo(2);
		ConstructorDemo c2 = new ConstructorDemo();
		ConstructorDemo c3 = new ConstructorDemo(1, "REVA");
	}

	ConstructorDemo() {
		System.out.println("welcome");
	}

	ConstructorDemo(int a) {
		System.out.println("java");
	}

	ConstructorDemo(int a, String b) {
		System.out.println("hello");
	}
}
