package com.prano;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter a number");
	        num=sc.nextInt();
	        
	        if (num%2==0){
	           System.out.println(num +"is even");	
	        }
	           
	         else {
	        	  System.out.println(num +"is odd");
	           }
	        	
		

	}

}
