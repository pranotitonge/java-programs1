package com.prano;

import java.util.Scanner;

       public class operators {
	
	        public static void main(String []args) {
	     	int num1,num2,large;

        	Scanner sc = new Scanner(System.in);
	
	        System.out.println("enter first number");
	        num1=sc.nextInt();
	
	        System.out.println("enter second number");
	        num2 =sc.nextInt();
	
     	    large =(num1 >num2) ? num1:num2;
	
	        System.out.println("the largest of "+num1+" and "+num2+" is " +large);
	        
	        
	        } 
	        
       }
	

