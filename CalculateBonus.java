package com.manipal.pf.demo;

import java.util.Scanner;

public class CalculateBonus {
	int calculateBonus(int basic){
		int res=0;
		if(basic>20000)
			res=(basic*17/100)+1500;
		else if(basic>15000)
		res=(basic*15/100)+1200;
		else if(basic>10000)
			res=(basic*12/100)+1000;
		else 
			res=(basic*8/100)+500;
		return res; 
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int basic=scan.nextInt();
		CalculateBonus cb=new CalculateBonus();
		if(basic<0)
			System.out.println("Number too small ");
		else if(basic>32767){
				System.out.println("number too larger");
			}
	else{
		System.out.println(cb.calculateBonus(basic));
	}
	}

}
