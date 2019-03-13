package com.manipal.cts;
import java.util.Scanner;

public class FractionComparrision {
	public static void main(String[] args){
		
	
	Scanner sc=new Scanner(System.in);
	int s1=sc.nextInt();
	int s2=sc.nextInt();
	int s3=sc.nextInt();
     int s4=sc.nextInt();	
	if((s1/s2)==(s3/s4))
	{
		int n1=s1;
		int n2=s2;
		while(s1!=s2)
		{
			if(s1>s2)
			{
				s1=s1-s2;
			}
			else
			{
				s2=s2-s1;
			}
			
		}
		System.out.println("equal");
		System.out.println((n1/s1)+"/"+(n2/s1));
		
		
		
	}
	else
		if(s1/s2>s3/s4)
		{
			int v1=s1*s4-s2*s3;
			int v2=s2*s4;
			int n1=v1;
			int n2=v2;
			while(v1!=v2)
			{
				if(v1>v2)
				{
					v1=v1-v2;
				}
				else
				{
					v2=v2-v1;
				}
				
			}
			System.out.println("greater");
			System.out.println((n1/v1)+"/"+(n2/v1));
			
		}
		else
		{
			int v1=(s3*s2)-(s1*s4);
			System.out.println(v1);
			int v2=s2*s4;
			System.out.println(v2);
			int n1=v1;
			int n2=v2;
			while(v1!=v2)
			{
				if(v1>v2)
				{
					v1=v1-v2;
				}
				else
				{
					v2=v2-v1;
				}
				
			}
			System.out.println("lesser");
			System.out.println(v1);
			
			System.out.println((n1/v1)+"/"+(n2/v1));
			
		}
	
	
	
	
	

}
}
