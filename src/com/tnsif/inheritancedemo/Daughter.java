package com.tnsif.inheritancedemo;

public class Daughter extends Father{
	String cycle ="pink";
	
	public static void main(String[] args) {
		Daughter s=new Daughter();
		
		System.out.println(s.car);
		System.out.println(s.money);
		System.out.println(s.cycle);
		
		s.drinking();
		s.reading();
	}

}