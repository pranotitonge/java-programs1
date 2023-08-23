package com.prano;

import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		int eid ,eage;
		String  ename, edepartment;
		Double esalary;
		char egender;
		
		Scanner sc =new  Scanner(System.in);
		System.out.println("enter employee ID:");
		eid =sc.nextInt();
		sc.nextLine();
		System.out.println("enter employee name:");
		ename = sc.nextLine();
		
		System.out.println("enter employee age:");
		eage = sc.nextInt();
		
		System.out.println("enter employee salary:");
		esalary = sc.nextDouble();
		
		System.out.println("enter employee deaprtment:");
		edepartment = sc.nextLine();
		sc.nextLine();
		
		System.out.println("enter employee gender :");
		egender= sc.next().charAt(0);
		
		System.out.println("enter employee details:");
		System.out.println("enter employee name"+ename);
		System.out.println("enter employee age:"+eage);
		System.out.println("enter employee salary:"+esalary);
		System.out.println("enter employee department:"+edepartment);
		System.out.println("enter employee gender:"+egender);
		 
		
		
		
		
		

	}

}
