package com.manipal.pf.demo;

import java.util.Scanner;

public class FeeCalculation {
	public int feeCalculation(int fee,int marks){
		int fee_final=0;
		float discount=0.0f;
		if(marks>90)
		discount = .50f;
		else if(marks>80 && marks<=90)
		discount = .25f;
		else if(marks>=70 && marks<=80)
		discount = .10f;
		else
		discount = 0;
		fee_final = (int) (fee-(fee*discount));
		return fee_final;
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int flag=0;
		int fee=scan.nextInt();
		if(fee>32767){
			System.out.println("invalid input");
		} 
		int marks=scan.nextInt();
		if(marks>100)
			System.out.println("invalid input");
		else{
		FeeCalculation fc=new FeeCalculation();
		System.out.println(fc.feeCalculation(fee, marks));
		}
	}

}
