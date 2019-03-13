package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
class Movies{
int movieid;
String moviename;
String leadactor;
public Movies(int movieid, String moviename, String leadactor) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.leadactor = leadactor;
}
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getLeadactor() {
	return leadactor;
}
public void setLeadactor(String leadactor) {
	this.leadactor = leadactor;
}

}
public class ArrayListDemoTwo {

	public static void main(String[] args) {
ArrayList friends=new ArrayList();
friends.add("joe");   // adding the name or data to the array
friends.add("ravi");
friends.add("raj");
friends.add("vishnu");

int noOfFriends=friends.size();
System.out.println("number of friends are "+noOfFriends);
// one way of accessing the array
for(int i=0;i<4;i++)
{

System.out.println("name: "+friends.get(i));
	}
//accesssing the data in enchanced value
for(Object friend:friends)
{
System.out.println(friend);
}
// option 3 using the iterator
Iterator it=friends.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}
}
