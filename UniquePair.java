package com.manipal.cts;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class UniquePair {
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 int m=sc.nextInt();
		 int n=sc.nextInt();
		 int [][] a=new int[m][n];
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 int c=0;
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 for(int k=j+1;k<n;k++)
				 {
					 if(a[i][j]==a[i][k])
					 {
						 c++;
						 break;
					 }
				 }
			 }
		 }
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 for(int k=i+1;k<m;k++)
				 {
					 if(a[i][j]==a[k][j])
					 {
						 c++;
						 break;
					 }
				 }
			 }
		 }
		 
		System.out.println(c); 
 }

}

