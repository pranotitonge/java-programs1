package com.prano;

import java.util.Scanner;

public class sumaray {

	public static void main(String[] args) {
		
	int n ,sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter size of array");
      n = sc.nextInt();
      int a[]= new int[n];
      System.out.println("enter array elements=");
      for(int i=0;i<n;i++) {
    	  a[i]=sc.nextInt();
    	  sum =sum +a[i];
      }
      System.out.print("sum of array elements:" +sum);
	}
}
    
     


