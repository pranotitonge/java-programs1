package com.prano;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,d,orgnum,s=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		num =sc.nextInt();
		orgnum=num;

		while(num>0){
			d =num%10;
			s =s+(d*d*d);
			num= num/10;
		}
		if(s==orgnum) {
			System.out.println(orgnum+"is armstrong number");
		}else {
			System.out.println(orgnum+"is not a armstrong number");
		}
		
	}

}
