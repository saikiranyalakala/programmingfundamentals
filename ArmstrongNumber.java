package com.manipal.pf.demo;

import java.util.Scanner;

public class ArmstrongNumber {
public int checkArmstrong(int n){
	int res=0,temp=0,rem=0,sum=0;
	if(n<0 || n>999)
	res=-1;
	else{
	temp = n;
	while (temp != 0) {
	rem = temp%10;
	sum = sum + (rem*rem*rem);
	temp = temp/10;
	}
	if (n == sum)
	res=1;
	else
	res=0;
	}
	return res;
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	ArmstrongNumber an=new ArmstrongNumber();
	int r=an.checkArmstrong(n);
	if(r==1){
		System.out.println("yes");
	}else if(r==0){
		System.out.println("no");
	}else{
		System.out.println("invalid input");
	}
	}

}
