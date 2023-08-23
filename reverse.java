package com.prano;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no =");
        int num =sc.nextInt();
        
        int rev =0;
        while(num>0) {
        	int dig=num%10;
        	rev =rev*10+dig;
        	num=num/10;
        	
        			
        }
        System.out.println(rev);
        	
	}

}
