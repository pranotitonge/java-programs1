package com.prano;

import java.util.Scanner;

public class employee1 {

	public static void main(String[] args) {
     	String ename;
     	int esal;
     	int eage;
     	
     	Scanner sc =new  Scanner(System.in);
    	
		System.out.println("enter your name");
		ename= sc.next();
		System.out.println("enter your sal");
		eage =sc.nextInt();
		System.out.println("enter your age");
		esal =sc.nextInt();
		
		System.out.println("enter employee details:");
		System.out.println("enter employee name"+ename);
		System.out.println("enter employee age:"+eage);
		System.out.println("enter employee salary:"+esal);
	

	  
	

	}

}
