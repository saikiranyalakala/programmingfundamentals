package com.manipal.pf.demo;

import java.util.Scanner;

public class RepeatedSalaryCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=0;
		int size=scan.nextInt();
		if(size<0)
			System.out.println("Invalid Input");
		else{
			int a[]=new int[size];
			for(int i=0;i<size;i++)     
			{
				a[i]=scan.nextInt();
				if(a[i]<0){
					System.out.println("Invalid Input");
				}}
			for(int i=0;i<size-1;i++)   
			{
				for(int j=i;j<size;j++){
					if(i==j)
						continue;
					if(a[i]==a[j])
						count++;
				}
				if(count>=1)
					break;
			}
		}
		if(count>0)
			System.out.println(count+1);
	}}