package com.manipal.pf.demo;

import java.util.Scanner;

public class Clock {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the time");
		int num=scan.nextInt();
		if(num<=0)
			System.out.println("invalid input");
		if(num>24)
			System.out.println("invalid input");
		if(num>19|| num<=7)
			System.out.println(" no tick yock");
		else
		System.out.println("tick tock");
	}
}
