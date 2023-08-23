package com.prano;
import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		String day;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter day name");
		day = sc.next().toLowerCase();
		switch(day) {
		case "monday": System.out.println("first day of the week");
		               break;
		case "tuesday":  System.out.println("second day of the week");
        break;
		case "wednesday": System.out.println("third day of the week");
        break;
		case "thurday": System.out.println("fourtht day of the week");
        break;
		case "friday": System.out.println("fifth day of the week");
        break;
		case "saturday": System.out.println("sixth day of the week");
        break;
		case "sunday": System.out.println("seventh day of the week");
		               break;
		default : System.out.println("Invalid Input"); 
		}

	}

}
