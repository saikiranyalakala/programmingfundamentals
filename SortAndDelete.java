package com.manipal.pf.demo;

import java.util.Scanner;

public class SortAndDelete {
	public void sortAndDelete(int array[],int num,int element){
		int i,j,temp=0;
	 for(i=0;i<num;i++){
		for(j=i;j<num;j++){
			if(array[i]>array[j]){
			temp=array[j];
			array[j]=array[i];
			array[i]=temp;
		}
		}
		
	}
	 for(i=0;i<num;i++){
			if(array[i]==element){
				array[i]=-1;
				} }
	 for(i=0;i<num;i++){
		 if(array[i]>0){
			 System.out.println(array[i]);
		 }
	 }
	}
	 public static void main(String[] args) {
			SortAndDelete sd=new SortAndDelete();
			Scanner scan=new Scanner(System.in);
			int size=scan.nextInt();
			int []array=new int[size];
			int i;
			for(i=0;i<size;i++){
				array[i]=scan.nextInt();
				}
			int element=scan.nextInt();
			sd.sortAndDelete(array, size, element);
			
		}


}
