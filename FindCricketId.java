package AssignmentNew;

import java.util.Scanner;

public class FindCricketId {
public void findCricketId(int[] a,int size,int score){
	for(int i=0;i<size;i++){
		if(score>a[i])
			System.out.println(i);
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
			if(size<0)
System.out.println("Invalid input");
else{
		int a[]=new int[size];
		for(int i=0;i<size;i++)     //enter the values into an array
		{
			a[i]=sc.nextInt();
if(a[i]<0){
System.out.println("Invalid input");
			}}
		for(int i=0;i<size;i++){
		a[i]=sc.nextInt();
		}
		int score=sc.nextInt();
		FindCricketId fid=new FindCricketId();
		fid.findCricketId(a,size,score);
	}
	}}
