package com.prano;

import java.util.Scanner;

public class FactorsMain {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 num = sc. nextInt();
		 System.out.println("factors of "+num+" are:");
		 for (int i=1;i<=num;i++) {
			 if(num%i==0) {
				 System.out.print(i+"");
			 }
		 }

	}

}
