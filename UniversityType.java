package com.manipal.pf.demo;

import java.util.Scanner;

public class UniversityType {
	 public int calculateGrade(int []array,int num){
		 int sum=0,avg=0;
		 for(int i=0;i<num;i++){
			 sum=sum+array[i];
		 }
		 avg=sum/num;
		 if(avg>80&&avg<100){
			 return 1;
		 }else if(avg>60&&avg<80){
			 return 2;
		 }else if(avg<60){
			 return 3;
		 }else{
			 return -1;
		 }
	 }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int []array=new int[num];
		for(int i=0;i<num;i++){
			array[i]=scan.nextInt();
		}
		UniversityType ut=new UniversityType();
		int a=ut.calculateGrade(array, num);
		if(a==1){
			System.out.println(" First Grade University");
		}
		if(a==2){
			System.out.println(" second Grade University");
		}
		if(a==3){
			System.out.println(" Third Grade University");
		}
		if(a==-1){
			System.out.println("invalid input");
		}
	}

}
