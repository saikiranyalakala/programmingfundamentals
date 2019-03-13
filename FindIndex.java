package com.manipal.pf.demo;

import java.util.Scanner;

public class FindIndex {
	public int findIndex( int size,int array[], int search){
		int i=0;
		 if (array == null) 
			 return -1;
	        int len = array.length;
	        while (i < len) {
	            if (array[i] == search) 
	            	return i;
	            else i=i+1;
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int flag=0;
		int size=scan.nextInt();
		if(size<0){
			System.out.println("invalid input");
		}else{
		int []array=new int [size];
		
		for(int i=0;i<size;i++){
			array[i]=scan.nextInt();
			if(array[i]<0){
				System.out.println("invalid input");
				flag=1;
				break;
			}
		}
		if(flag!=1)
		{
		int search=scan.nextInt();
		FindIndex fi=new FindIndex();
		int r=fi.findIndex(size, array, search);
		
			if(r==-1){
				System.out.println("not found");
			}else{
				System.out.println(r);
			}
		}	
	}}

}
