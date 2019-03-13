package com.manipal.cts;

import java.util.Scanner;

public class MultiplicationTable {
	
    public static void main(String[] args)
	  {
		Scanner sc=new Scanner (System.in);
		int m =sc.nextInt();
		int n =sc.nextInt();
		int [][] a =new int [m][n];
		int[] b=new int [m*n];
		int g=0;
		for(int  i=0;i<m;i++)
		{
			int x=i+1;
			for(int j=0;j<n;j++)
			{
				int y=j+1;
			    a[i][j]=x*y;
			    b[g]=x*y;
			    g++;
				
			}
		}
		for(int i=0;i<m*n;i++)
		{
			for(int k=1;k<m*n-i;k++)
			{
				if(b[k-1]>b[k])
				{
					int temp=b[k];
					b[k]=b[k-1];
					b[k-1]=temp;
				}
			}
		}
		/*for(int t:b)
		{
			System.out.println(t);
		}*/
		int s=1;
		for(int i=0;i<m*n-1;i++)
		{
			if(b[i]!=b[i+1])
			{
				s++;
			}
		}
		System.out.println(s);
		


			
			
			

			    }

			


		

	}



