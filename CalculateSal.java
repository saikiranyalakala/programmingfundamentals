package com.manipal.pf.demo;

import java.util.Scanner;
public class CalculateSal {
int saving=0;
public void calculateSal(int salary,int shifts)
{
	saving=(int) (salary*(0.5+0.02*shifts));
	System.out.println(saving);
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int salary=scan.nextInt();
		if(salary>8000)
			System.out.println("Salary too large");
		if(salary<0)
			System.out.println("Salary too Small");
		int shifts=scan.nextInt();
		if(shifts<0)
			System.out.println("Shift too small");
		else{
		CalculateSal obj=new CalculateSal();
		obj.calculateSal(salary, shifts);
				}
					}
}