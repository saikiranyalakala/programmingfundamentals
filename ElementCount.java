package AssignmentNew;

import java.util.Scanner;

public class ElementCount {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int len =sc.nextInt();
int count=0;
if(len<0)
{
	System.out.println("invalid size");
}
else
{
	int a[]=new int[len];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		if (a[i]<0){
			count=1;
			System.out.println("invalid element");
			break;
		
		}
	}
	if(count==0){
	int n=sc.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(n==a[i])
		{
			count++;
		}
	}
	System.out.println(count);}
}
	}

}
