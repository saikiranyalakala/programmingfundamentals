package AssignmentNew;


import java.util.Scanner;

public class RepeatedSalaryCount {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int count=0;
int s=scan.nextInt();
if(s<0)
	System.out.println("Invalid Input");
else{
int a[]=new int[s];
for(int i=0;i<s;i++)     //enter the values into an array
{
	a[i]=scan.nextInt();
	if(a[i]<0){
		System.out.println("Invalid Input");
	}}
	for(int i=0;i<s-1;i++)   //check the same values in the array
	{
	for(int j=i;j<s;j++){
		if(i==j)
			continue;
		if(a[i]==a[j])
			count++;
	}
	if(count>=1)
		break;
	}
}
	if(count>0)
		System.out.println(count);
}}