package com.prano;

public class nestedseries {

	public static void main(String[] args) {
		int  n=100;
		double sum = 0;
		for(int i =1;i<=n;i++) {
			sum+=1.0/i;
			System.out.print("1/"+i);
			
			if(i!=n) {
				System.out.print("+");
			}
		}

	}
}
