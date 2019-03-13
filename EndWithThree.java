package com.manipal.pf.demo;

import java.util.Scanner;

public class EndWithThree {
	public  int endWithThree(int numbers[], int size){
		int count=0,i,temp,rem=0;
		for(i=0 ; i<size ; i++){
		temp = numbers[i];
		rem = temp%10;
		if(rem==3)
		count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int flag=0;
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		if(size<0){
			System.out.println("invalid input");
		}else{
		int [] numbers=new int[size];
		for(int i=0;i<size;i++){
			numbers[i]=scan.nextInt();
			if(numbers[i]<0){
				System.out.println("invalid input");
				flag=1;
				break;
			}
		}
		if(flag==0){
		EndWithThree et=new EndWithThree();
		System.out.println(et.endWithThree(numbers, size));
		}
	}
	}
}
