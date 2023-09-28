package com.harsha.executation;

public class withObjectCreation {


	static { 
		System.out.println("static block"); 
	}


	{
		System.out.println("non static");
	}

	public withObjectCreation() {
		System.out.println("constructor");

	}

	public static void main(String[] args) {
		System.out.println("main method");
		new withObjectCreation();

	}

}
