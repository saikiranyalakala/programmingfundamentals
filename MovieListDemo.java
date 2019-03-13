package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieListDemo {

	public static void main(String[] args) {
		
Movie m1=new Movie(123,"jabajaba","me");
Movie m2=new Movie(122,"dabadaba","he");
Movie m3=new Movie(124,"abbaabba","she");
ArrayList<Movie> Movies=new ArrayList<>();
Movies.add(m1);
Movies.add(m2);
Movies.add(m3);
Iterator it=Movies.iterator();
while(it.hasNext())
{
	Movie str=(Movie) it.next();
System.out.println(str.getMovieid()+"\t"+str.getMoviename()+"\t"+str.getLeadactor());	
}
	}

}
