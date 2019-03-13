package classqsns;

public class StringOverride {

	public static void main(String[] args) {
int a[]={1,2,3,4,4,5,6,7,8,9};
int len=a.length;
for(int i=0;i<a.length;i++){
	
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			a[j]=a[j+1];
			
		}
		
	}	
}
int b[]=new int[len-1];
for(int i=0;i<len;i++){
	System.out.println(a[i]);
}
	}

}
