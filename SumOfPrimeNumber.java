import java.util.Scanner;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int len=sc.nextInt();
		int sum=0,c=1;
		if(len<=0)
		{
			System.out.println("entered length of array is less than 0");
		}
		else
		{
			int a[]=new int[len];
			System.out.println("enter the elements of the array");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<a.length;i++)
			{ 
				if(a[i]==0||a[i]==1){
				
				c=0; 
			}else{
				for(int j=2;j<=a[i]/2;j++)
				{
					if(a[i]%j==0)
					{
						c=0;
						break;
					}
					else{c=1;}
					
				}
				if(c==1){
				sum+=a[i];
				}
				
			}}
			System.out.println("sum of prime numbers is "+sum);}}}