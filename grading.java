package com.prano;

import java.util.Scanner;

public class grading {

	public static void main(String[] args) {
		int marks;
		Scanner sc =new  Scanner(System.in);
		
		System.out.println("enter students marks:");
		marks= sc.nextInt();
		
		if(marks >=90&& marks <= 100) {
			System.out.println("Grade A");
		}
		else if (marks >=70 && marks <= 89) {
			System.out.println("Grade B");
			
		}
		
		else if (marks>=50 && marks <= 69) {
			System.out.println("Grade c");
			
		}
		else if (marks >=0 && marks <= 49) {
			System.out.println("grade D");
		}
		else {
			System.out.println("Invalid");
		}
 
	}

}
