package com.manipal.pf.demo;

import java.util.Scanner;

import java.util.Scanner;

public class SumOfPrime {
	int primeIndexSum(int array[], int size){
		int sum=0,i,j=0,count=0,temp=0,avg=0;
		for(i=2;i<=size;i++){
			count=0;
			for(j=1;j<=i;j++){
				if(i%j==0)
					count++;
				}
			if(count==2){
				sum = sum+array[i];
				temp++;
				}
			else continue;
			}
		avg=sum/temp;
		return avg;
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int []array=new int[size];
	for(int i=0;i<size;i++){
		array[i]=scan.nextInt();
	}
	SumOfPrime sp=new SumOfPrime();
	System.out.println(sp.primeIndexSum(array, size));
	}
}
