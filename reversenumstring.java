package com.prano;

import java.util.Scanner;

public class reversenumstring {

	public static void main(String[] args) {
	 int num ;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter number");
	 num = sc .nextInt();
	 
	  String str = String .valueOf(num);
	   for (int i =str.length()-1;i>=0;i--) {
		   System.out.println(str.charAt(i));
	   }
	   StringBuffer strb =new StringBuffer(str);
	   
	   System.out.println(strb.reverse().toString());
	}
	

}
