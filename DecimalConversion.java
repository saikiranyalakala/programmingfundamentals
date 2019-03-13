package com.manipal.pf.demo;

import java.util.Scanner;

public class DecimalConversion {
	int r=0,sum=0;
	public int convertToDecimal(int num)
	{
		int k=0;
		int r=0,sum=0;
		while(num>0){
				r=num%10;
				num=num/10;
				int  a= (int) ((Math.pow(2,k))*r);
				k++;
				sum=sum+a;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		DecimalConversion dc=new DecimalConversion();
		int sum1=dc.convertToDecimal(num);
		System.out.println(sum1);
	}
}
