package com.manipal.pf.demo;

import java.util.Scanner;

public class GenerateNewNumber {
		public int generateNewNumber(int number){
			int res=0,rem=0,i=1;
			
			while(number!=0){
				rem=number%10;
				if(rem%2==0){
					res=(rem+2)*i+res;
					i=i*10;
					}
				else {
					res=(rem+2)*i+res;
					i=i*10;
					}
				number = number/10;
				}
			return res;
				}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		GenerateNewNumber gc=new GenerateNewNumber();
		if(number<0)
			System.out.println("Number too small ");
		else if(number>32767){
				System.out.println("number too larger");
			}
	else{
		System.out.println(gc.generateNewNumber(number));
	}
	}
}
 


