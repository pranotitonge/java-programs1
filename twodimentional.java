package com.prano;

import java.util.Scanner;

public class twodimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]=new int[3][3];
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 3*3 matrix");
        
        for(int r=0;r<3;r++) {
        	for ( int c=0;c<3;c++) {
        	arr[r][c]=sc.nextInt();
        	}
        }
        System.out.println("entered matrix is");
        for(int r=0;r<3;r++) {
        	for(int c=0;c<3;c++) {
        		System.out.print(arr[r][c]+" ");
        		
        	}
        	System.out.println();
        }
        
	}

}
