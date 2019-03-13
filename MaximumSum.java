package AssignmentNew;
import java.util.Scanner;

public class MaximumSum {
int sum,add=0;
public int maximumSum(int[] a,int size){
	for(int i=0;i<size;i++){
		if(a[i]%2==0)
			sum=sum+a[i];
		else
			add=add+a[i];
			
	}
	if(sum>add)
		return sum;
	else
		System.out.println(add);
			return add;
		}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		if(size<0)
			System.out.println("Invalid Input");
		else{
		int a[]=new int[size];
		for(int i=0;i<size;i++)     //enter the values into an array
		{
			a[i]=scan.nextInt();
			if(a[i]<0){
				System.out.println("Invalid Input");
			}
		  }
		MaximumSum obj=new MaximumSum();
		int max=obj.maximumSum(a,size);
		System.out.println(max);

		}}}
