package com.prano;

public class BlocksJava {
	static {
    System.out.println("Static block will executes before the main");
	}
	{
		System.out.println("annonymous block, executes after main, on object creation before constructor");
	}
	public BlocksJava() {
		System.out.println("constructor");
	}
	static void display() {
		System.out.println("display method");
	}
	public static void main(String[] args) {
		System.out.println("main");
		BlocksJava ob= new BlocksJava();
		BlocksJava.display();
		display();
		
	}

}
