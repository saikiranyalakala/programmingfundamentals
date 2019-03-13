package com.manipal.cts;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class main1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int g=sc.nextInt();
		int h=sc.nextInt();
		int i=a*c+d;
		int j=a*e+f;
		int k=a*g+h;
		if(i<j&&i<k)
		{
			System.out.println("train");
			
		}
		else if(j<i&&j<k)
		{
			System.out.println("bus");
			
		}
		else
		{
			System.out.println("flight");
		}
	
	}

}
