package com.manipal.pf.demo;

import java.util.Scanner;

public class DigitFactorial {

	public static void main(String[] args) {
		for(int i=1;i<=200;i++){
		    int sum = 0; //<--include this
		   int  temp = i;
		int    temp1 = i;
		    while(temp>0){
		      int  digit = temp%10;
		       int factorial =1;
		        for(int x = 1;x<=digit;x++){
		            factorial*=x;//factorial of digit
		        }
		        sum+=factorial; //sum of factorial
		        temp = temp/10;
		    }
		    if(sum == temp1){
		        System.out.println(temp1);
		    }
		}
	}
}


