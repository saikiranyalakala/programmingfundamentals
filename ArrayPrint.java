package classqsns;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		String s=String.valueOf(a);
		int x[]=new int[s.length()];
		for(int i=0;i<s.length();i++)
		{
			String temp=""+s.charAt(i);
			x[i]=Integer.parseInt(temp);
			System.out.println(x[i]);
		}
	}

}
