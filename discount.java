package com.prano;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
      String pname;
      float pprice,discount,amt   ;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the product name");
      pname = sc.nextLine();
      
      System.out.println("enter the product price");
      pprice = sc. nextFloat();
      
      if(pprice>0 && pprice<=10000){
    	  discount=pprice*0.05f;
    	  
      }	   
      else if (pprice>10000 && pprice<=20000) {
    	  discount = pprice*0.1f;
      }
      else if (pprice >20000 && pprice<= 35000) {
    	  discount = pprice*0.15f;
      }
      else {
    	  discount = pprice * 0.2f;
      }
      amt = pprice/100;
    		  System.out.println("amount after discount="+amt);
      
      
	}

}
