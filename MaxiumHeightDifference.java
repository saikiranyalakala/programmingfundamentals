package com.manipal.cts;

import java.util.Scanner;

public class MaxiumHeightDifference {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();
         int[] a=new int[n];
         for(int i=0;i<n;i++)
         {
        	a[i]=sc.nextInt(); 
        	 
         }
         
         for(int i=0;i<n-1;i++)
         {
        	 for(int j=0;j<n-i-1;j++)
        	 {
        		 if(a[j]>a[j+1])
        		 {
        		   int temp=a[j];
        		   a[j]=a[j+1];
        		   a[j+1]=temp;
        			 
        		 }
        	 }
         }
        /* for(int t:a)
        	 System.out.print(t+" ");*/
         
        // System.out.println();
         int m=n*n;
         int[] b =new int[m];
         int k=0;
         for(int i=0;i<n-1;i++)
         {
        	for(int j=0;j<n-1;j++)
        	{
        		
        		    b[k]=a[j+1]-a[i];
        		
        		k++;
        	}
         }
       /*  for(int t:b)
         System.out.print(t+" ");*/
         
         
         //System.out.println();
         for(int i=0;i<m-1;i++)
         {
        	 for(int j=0;j<m-i-1;j++)
        	 {
        		 if(b[j]<b[j+1])
        		 {
        			 int temp=b[j];
        			 b[j]=b[j+1];
        			 b[j+1]=temp;
        		 }
        	 }
         }
         
       /*  for(int t:b)
             System.out.print(t+" "); */
       
         
         System.out.println(b[0]);
	}

}
