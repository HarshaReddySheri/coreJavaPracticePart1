package com.harsha.executation;

public class withoutObjectCreation {
	
	static {
		System.out.println("static block");
	}
	
	
	{
		System.out.println("non static");
	}
	public withoutObjectCreation() {
		System.out.println("constructor");
		
		
	}
	public static void main(String[] args) {
		System.out.println("main method");
	}

}

