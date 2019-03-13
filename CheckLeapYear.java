package com.manipal.pf.demo;

import java.util.Scanner;

public class CheckLeapYear {
	public int checkLeapYear(int year) {
		 boolean flag = false;
	        if(year % 400 == 0)
	        {
	            flag = true;
	        }
	        else if (year % 100 == 0)
	        {
	            flag = false;
	        }
	        else if(year % 4 == 0)
	        {
	            flag = true;
	        }
	        else
	        {
	            flag = false;
	        }
	        return year;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any year:");
		int year = s.nextInt();
		if (year < 0) {
			System.out.println("invalid input");
		} else {
			CheckLeapYear ly = new CheckLeapYear();
			System.out.println(ly.checkLeapYear(year));
		}
	}
}