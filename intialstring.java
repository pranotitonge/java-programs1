package com.prano;

public class intialstring {

	public static void main(String[] args) {
		String s1 = "Mahatma karamchand Gandhi";
		String s2 ="";
		s2=s2+s1.charAt(0)+".";
		for(int i =0; i<s1.length();i++) {
			if(s1.charAt(i)==' ')
				s2=s2+s1.charAt(i+1)+".";
		}
		System.out.println(s2);

	}

}
