package com.prano;
import java.util.Scanner;
  class Student{
	  int studentid;
	  String studentname;
	  int studentage;
	  
	  void inputStudentData() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter name");
		  studentname =sc.nextLine();
		  
		  System.out.println("'enter id");
		  studentid = sc. nextInt();
		  
		  System.out.println("enter age");
		  studentage =sc. nextInt();
		  
		  
	  }
	  
	  void displayStudentDetails() {
		  System.out.println("student id ="+studentid);
		  System.out.println("student name ="+studentname);
		  System.out.println("student age = "+studentage);
	  }
	  @Override
	  
	 public String toString() {
		  return "Student[studentid="+studentid+",studentname="+studentname+",studentage="+studentage+"]";
		  
	  }
  }

public class mainapp {

	public static void main(String[] args) {
		System.out.println("main");
		
		Student sob =new Student();
		
		sob.inputStudentData();
		sob.displayStudentDetails();
		System.out.println(sob);
		Student sob1=new Student();
		sob1.inputStudentData();
		sob1.displayStudentDetails();
		System.out.println(sob);
		

	}

}
