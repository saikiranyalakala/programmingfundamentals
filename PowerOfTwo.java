package com.manipal.pf.demo;

import java.util.Scanner;

public class PowerOfTwo {

	 public static void main(String args[])  
	    {  

	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter the number : ");
	        int num = in.nextInt();
	        if((num%2) == 0)  
	        {  
	            System.out.println("yes");  
	        }  
	        else if(num> 32767)
				System.out.println("number too large");
	        else if(num<0)
				System.out.println("number too Small");
	        else  
	        {
	            System.out.println("no");  
	        }
	    }  
}
