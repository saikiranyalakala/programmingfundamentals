package com.manipal.pf.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryCalculation {
	public float calculateSalary(int basic, int days) {
		float salary = 0.0f;
		if (days == 31)
			salary = (float) (basic * 50) / 100 + (float) (basic * 75) / 100 + basic + 500;
		else
			salary = (float) (basic * 50) / 100 + (float) (basic * 75) / 100 + basic;
		return salary;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int basic=scan.nextInt();
		int days=scan.nextInt();
		if(basic>10000||basic<0||days>31||days==0||days<0){
		System.out.println("invalid input");
		}else{
		SalaryCalculation sc=new SalaryCalculation();
		DecimalFormat f=new DecimalFormat("##.00");
		System.out.println(f.format(sc.calculateSalary(basic, days)));
		}
	}
}
