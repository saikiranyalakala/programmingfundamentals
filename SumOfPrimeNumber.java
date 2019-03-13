package com.manipal.pf.demo;

import java.util.Scanner;

public class SumOfPrimeNumber {
	public int sumPrime(int []a,int n){
		int sum=0,flag=0;
		for(int i=0;i<n;i++){
			flag=0;
			for(int j=2;j<=a[i]/2;j++){
				if(a[i]%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				sum=sum+a[i];
			}
		}
			return sum;
			}
		

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]a=new int [n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		SumOfPrimeNumber sp=new SumOfPrimeNumber();
		System.out.println(sp.sumPrime(a, n));
	}

}
