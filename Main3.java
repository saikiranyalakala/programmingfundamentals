package com.manipal.cts;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		
		int h=sc.nextInt();
		int d=sc.nextInt();
		int wi=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int p=sc.nextInt();
		int mul=2*l*h+2*w*h;
		int door=d*a*b;
		int window=wi*e*f;
		int area=mul-door-window;
		int cost=area*p;
		System.out.println(cost);
				
		
		
	}

}
