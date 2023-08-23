package com.prano;

import java.util.Scanner;

public class larger3num {

	public static void main(String[] args) {
		int num1,num2,num3,large;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter first number");
	        num1=sc.nextInt();
	
	        System.out.println("enter second number");
	        num2 =sc.nextInt();
	        
	        System.out.println("enter third number");
	        num3 = sc.nextInt();
	
  	    large =(num1 >num2 && num1>num3) ? num1:(num2>num1&&num2>num3)?num2:num3;
  	    
  	    System.out.println("the largest of "+num1+", "+num2+"and "+num3+" is " +large);

	}

}
