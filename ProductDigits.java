package com.manipal.pf.demo;

import java.util.Scanner;

public class ProductDigits {
	int r,product=1;
public int productDigits(int num){
	while(num>0){
		r=num%10;
		num=num/10;
		product=product*r;
	}
	return product;
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num<0&&num>32767)
			System.out.println("Invalid Input");
		ProductDigits pd=new ProductDigits();
		int pro=pd.productDigits(num);
		System.out.println(pro);
	}

}

