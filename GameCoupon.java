package com.manipal.pf.demo;

import java.util.Scanner;

public class GameCoupon {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int r=0,i=1,result=0;
	if(num<0)
		System.out.println("Number too small ");
	else{
		if(num>32767){
			System.out.println("number too larger");
		}
		else{
		while(num!=0){
			r=num%10;
			if(r%2==0){
				result=result+(r*i);
				i=i*10;
			}
			num=num/10;
		}
		System.out.println(result);
	}
	}
	}
}
