package com.prano;

import java.io. BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {

	public static void main(String[] args) throws NumberFormatException, IOException{
		int sid;
		String sname;
		float sfees;
		char sgender;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter student id");
		sid = Integer.parseInt(br.readLine());
		
		System.out.println("enter student name");
		sname = br.readLine();
		
		System.out.println("enter student fees");
		sfees = Float.parseFloat(br.readLine());
		
		System.out.println("enter student gender");
		sgender= (char)br.read();
		
		System.out.println("Student Details");
		System.out.println("Id ="+sid);
		System.out.println("Name="+sname);
		System.out.println("fees="+sfees);
		System.out.println("gender="+sgender);
		
		

	}

}
