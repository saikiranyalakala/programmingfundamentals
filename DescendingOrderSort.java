package com.manipal.pf.demo;

import java.util.Scanner;

public class DescendingOrderSort {
	public void  sortArray(int array[], int size){
		int i,j,temp=0;
		for( i=0 ; i<size ; i++){
			for(j=i+1 ; j<size ; j++){
			if(array[i]<array[j]){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			}
			}
			System.out.println(array[i]);
			}
		
	}
	public static void main(String[] args) {
		int flag=0;
		Scanner scan=new Scanner(System.in);
		int size =scan.nextInt();
		if(size<0){
			System.out.println("invalid input");
		}else{
		int []array=new int[size];
		for(int i=0;i<size;i++){
			array[i]=scan.nextInt();
			if(array[i]<0){
				System.out.println("invalid input");
				flag=1;
				break;
			}
		}if(flag==0){
		DescendingOrderSort ds=new DescendingOrderSort();
		ds.sortArray(array, size);
		}}
	}

}
