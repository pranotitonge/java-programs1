package com.prano;

public class reversenum {

	public static void main(String[] args) {
		int number = 123 ;
		int reversedNumber = reverseNumber(number);
		System.out.println("Reversed number : " + reversedNumber);

	}
    
	public static int reverseNumber(int num) {
		String numstr = Integer.toString(num);
		String reversedStr=new StringBuilder(numstr).reverse().toString();
		return Integer.parseInt(reversedStr);
	}
}
