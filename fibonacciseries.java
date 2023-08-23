package com.prano;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int terms,f1=1,f2=1,f3;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of terms");
		terms = sc.nextInt();
		
		System.out.println("fibonacci series");
		System.out.println(f1+" "+f2+"");
		
		for(int i=1;i<=terms-2;i++) {
			f3=f1+f2;
			System.out.println(f3+"");
			f1=f2;
			f2=f3;
			
		}
	}

}
