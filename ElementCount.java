package com.manipal.pf.demo;

import java.util.Scanner;

public class ElementCount {
		int count=0;
	public int FindElementCount(int a[],int size,int search){
		for(int i=0;i<size;i++){
			if(a[i]==search)
				count++;
		}
		return count;
	}
		public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter size");
	  int size=sc.nextInt();
	  int a[]=new int[size];
	  for(int i=0;i<size;i++){
		  a[i]=sc.nextInt();
		}
	  	System.out.println("enter search elemenet");
	  	int search=sc.nextInt();
	  	ElementCount ec=new ElementCount();
	  	ec.FindElementCount(a, size, search);
	  	System.out.println(ec.count);
		}
	  	
	}