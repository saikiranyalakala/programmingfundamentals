package com.manipal.pf.demo;

import java.util.Scanner;

public class FindMileage {
	public int findMileage(int cc){
		int mileage=0;
		if(cc>=100 && cc<=125){
		mileage=75;
		}
		else if(cc>=126 && cc<=135){
		mileage=70;
		}
		else if(cc>=136 && cc<=150){
		mileage=60;
		}
		else if(cc>=151 && cc<=200){
		mileage=50;
		}
		else if(cc>=201 && cc<=220){
		mileage=35;
		}
		return mileage;
	}
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cc=scan.nextInt();
		FindMileage fm=new FindMileage();
		if(cc<100)
			System.out.println("Number too small ");
		else if(cc>220){
				System.out.println("number too larger");
			}
	else{
		System.out.println(fm.findMileage(cc));
	}
	}

}
