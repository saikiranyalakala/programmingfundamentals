package com.manipal.pf.demo;

import java.util.Scanner;

public class MinimumOfThree {
	public int findSmallest(int a,int b,int c){
		int res=0;
		if(a<b && a<c)
		res=a;
		else if(b<a && b<c)
		res=b;
		else
		res=c;
		return res;
		}
	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		 MinimumOfThree mt=new  MinimumOfThree();
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 int c=scan.nextInt();
		 System.out.println(mt.findSmallest(a, b, c));
	}
}
