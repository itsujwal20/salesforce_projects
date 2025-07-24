package com.tnsif.polymorphism;

public class Childdemo extends Parentdemo {
	void driniking() {
		System.out.println("juice");
	}
	

	public static void main(String[] args) {
		Childdemo c=new Childdemo();
		
		c.driniking();
		
	}
}