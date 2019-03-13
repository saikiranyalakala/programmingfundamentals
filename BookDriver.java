package com.manipal.collection.demo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class BookDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book details");
		Books b1=new Books(sc.next(),sc.next(),sc.nextInt(),sc.next());
		Books b2=new Books(sc.next(),sc.next(),sc.nextInt(),sc.next());
		Books b3=new Books(sc.next(),sc.next(),sc.nextInt(),sc.next());
		ArrayList<Books> boo=new ArrayList<>();
		boo.add(b1);
		boo.add(b2);
		boo.add(b3);
		int count=0;
		Iterator it =boo.iterator();
		while(it.hasNext())
		{
			Books b=(Books) it.next();
			System.err.println(b.getBookId()+"\t"+b.getBookTitle()+"\t"+b.getPrice()+"\t"+b.getAuthor());
		}
		System.out.println("enter the name of the book to be searched");
		String s=sc.next();
		System.out.println(s);
		Iterator it1 =boo.iterator();
		while(it1.hasNext())
		{
			Books c=(Books) it1.next();
			if(s.equals(c.getBookTitle()))
			{
				System.out.println("book is present");
			System.err.println(c.getBookId()+"\t"+c.getBookTitle()+"\t"+c.getPrice()+"\t"+c.getAuthor());
		
			break;}
			else
				{
				count=1;
				}
		
	}
		if(count==1)
		{
			System.out.println("book is not present");}
		}

}
