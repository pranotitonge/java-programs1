package com.prano;

import java.util.Scanner;

public class Arraydem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array element"+arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enetered rollnos are");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
