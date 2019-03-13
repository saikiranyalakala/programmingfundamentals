package com.manipal.cts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int x=sc.nextInt();
		
		int c=0;
		int g=0;
		 while(c==0)
		 {
			 for(int i=1;i<=n;i++)
			 {
				 String d=sc.next();
				String b="bus";
				 g++;
				 if(g%x==0)
				 {
					 //System.out.println(d);
					 if(d.equals(b))
					 {
						 continue;
					 }
					 else
					 {
						 c=1;
						 System.out.println(i);
						 break;
					
				 }
					 
			 }
				
		 }
		
			
			
			
				
				
		
       
		
	

}
}
}