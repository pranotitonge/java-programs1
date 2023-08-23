package com.prano;

public class Parent {
	int i;
	public Parent() {
		System.out.println("Prent constructor");
		i=10;
	}
	public Parent(int i) {
		super();
		this.i = i;
	}
}
class child extends Parent{
	public child() {
		super();
		System.out.println("child constructor");
	}
	void display() {
		System.out.println("value oof i ="+i);
	}
@Override
	public String toString() {
		return "child [i=" + i + "]";
	}
public child(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}
public class inheritanceDemMain{

	
	public static void main(String[] args) {
		child ob= new child();
		ob.display();
	}
}
}


