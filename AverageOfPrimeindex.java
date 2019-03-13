package AssignmentNew;

import java.util.Scanner;

public class AverageOfPrimeindex {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
int sum=0,c=0,count=1;
if(len<=0)
{
	System.out.println("invalid Size");
}
else
{
	int a[]=new int[len];
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
	if(a[i]<0)
	{
		System.out.println("invalid element");
		break;
	}
	int k=i+1;
	if(k>1){
	for(int j=2;j<=k/2;j++)
	{
		if(k%j==0)
		{
			count=0;
			break;
		}
		else
		{
			count=1;
		}
		
	}
	if(count==1)
	{
		sum+=a[i];
		c++;
		
	}}
}
System.out.println("average is :"+(sum/c));
	}

}
}
