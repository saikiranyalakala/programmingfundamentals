package com.manipal.cts;

import java.util.Scanner;

public class pushthezero {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int max=sc.nextInt();
	int[] a=new int[max];
	for(int i=0;i<max;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<max-1;i++)
	{
		if(a[i]==a[i+1])
		{
			a[i]=2*a[i];
			a[i+1]=0;
		}
	}
	/*for(int t:a)
	{
		System.out.print(t);
	}*/
	int[] b=new int[max];
	int j=0;
	for(int i=0;i<max;i++)
	{
		if(a[i]!=0)
		{
			b[j]=a[i];
			j++;
		}
	}
	for(int t:b)
	{
		System.out.print(t+" ");
	}
	}
}


