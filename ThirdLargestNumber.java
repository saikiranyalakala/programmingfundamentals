package com.manipal.pf.demo;

import java.util.Scanner;

public class ThirdLargestNumber {
	public static void main(String[] args) 
	{
	    int n, temp;
	    int v;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    if(n<0){
	    	System.out.println("invalid input");
	    }else{
	    int a[] = new int[n];
	    System.out.println("Enter all the elements:");
	    for (int i = 0; i < n; i++) 
	    {
	        a[i] = s.nextInt();
	        if(a[i]<0){
	        	System.out.println("invalid input");
	        }
	    }
	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = i + 1; j < n; j++) 
	        {
	            if (a[i] <a[j]) 
	            {
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    System.out.println("product of first and thrid Largest:"+a[0]*a[2]);
	    }
	}
	}