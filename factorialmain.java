package com.prano;

import java.util.Scanner;

public class factorialmain {

			int num;
		long fact ;
		void input() {
		Scanner sc = new Scanner(System. in);
		System.out.println("enter number");
		num = sc.nextInt();
		}
		
		void findFactorial() {
			fact=1;
		 for(int i = num;i>=1;i--) {
			 fact = fact*i;
		 }
		 System.out.println("factorial of num" +fact);
		}
		public static void main(String[] args) {
       factorialmain fobj= new factorialmain();
       fobj.input();
       fobj.findFactorial();
		}
}
