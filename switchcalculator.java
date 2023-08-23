package com.prano;

import java.util.Scanner;

public class switchcalculator {

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 int a,b,c,t;
	 System.out.println("enter the value of a:");
	 a= sc.nextInt();
	 System.out.println("enter the value of b");
	 b= sc.nextInt();
	 System.out.println("enter 1 for Addition");
	 System.out.println("enter  2 for substraction");
	 System.out.println("enter  3 for multiplication");
	 System.out.println("enter  4 for division");
	 c = sc.nextInt();
	 switch (c) {
	 case 1 :
		 t = a+b;
		 System.out.println("Addition of "+a+" and "+b+" is : "+t);
		 break;
	 case 2:
		 t =a+b;
		 
		 
		 System.out.println("substraction of "+a+" and "+b+" is :"+t);
		 break;
	 case 3:
		 t =a*b;
		 
		 System.out.println("multiplication of "+a+" and "+b+" is : "+t);
		 break;
	 case 4:
		 t = a/b;
		 System.out.println("division of "+a+" and "+b+" is : "+t);
		 break;
		 default:
			 
			 System.out.println("INVALID INPUT");
			 sc.close();
	 }
	}
}
	 
	 
	 
	
	


