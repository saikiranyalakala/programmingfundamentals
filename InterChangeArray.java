package com.manipal.pf.demo;

import java.util.Scanner;

public class InterChangeArray {
public void interChangeArray(int size,int []array){
	int temp=0;
	for(int i=0,j=size-1;i<size/2;i++,j--){
	temp = array[i];
	array[i] = array[j];
	array[j] = temp;
	}
	for( int i=0;i<size;i++)
	{
	System.out.println(array[i]);
	
	}
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		if(size<0){
			System.out.println("invalid input");
		}else{
		int []array=new int[size];
		InterChangeArray i=new InterChangeArray();
		for(int k=0;k<size;k++){
			array[k]=scan.nextInt();
			if(array[k]<0){
				System.out.println("invalid input");
			}
		}
		i.interChangeArray(size,array);
	}
	}
}
