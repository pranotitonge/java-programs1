package com.prano;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int num;
		long fact=1;
		Scanner sc = new Scanner(System. in);
		System.out.println("enter number");
		num = sc.nextInt();
		
		 for(int i = num;i>=1;i--) {
			 fact = fact*i;
		 }
		 System.out.println("factorial of num" +fact);
		 }
		
		

	}


