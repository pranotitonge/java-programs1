package com.prano;

import java.util.Scanner;

public class primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num, count =0;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num");
   num = sc. nextInt();

    for (int i=1;i<=num;i++) {
    	if (num%i==0) {
    		count++;
    		
    	}
    }
    if(count==2) {
    	System.out.println(num+"is prime");
    }else {
    	System.out.println(num+ "is not prime");
    }
	}

}
