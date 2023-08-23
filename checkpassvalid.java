package com.prano;

import java.util.Scanner;

public class checkpassvalid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user_name="Pranoti_tonge";
		String pass ="Pranoti@123";
		
		String inputname;
		String inputpass;
		
		System.out.print("enter the user name");
		inputname = sc.nextLine();
		
		System.out.print("enter the password");
		inputpass = sc.nextLine();
		
		if(inputname.equalsIgnoreCase(user_name)&& inputpass.equals(pass)) {
			System.out.println("welcome");
		}
		else
		{
			System.out.println("username and password is incorect");
		}
		
		
		
	}

}
