package com.manipal.cts;
import java.util.Scanner;
public class RedBall {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		int c=b+r;
		 float temp=1f;
		 float z=0;
		 for( int i=0;i<n;i++)
		 {
			 z=(float)r/c;
			 temp=temp*z;
			 r--;
			 c--;
		 }
		 System.out.printf("%.2f",temp);
	}

}
