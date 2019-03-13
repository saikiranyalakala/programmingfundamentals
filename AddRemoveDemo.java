package com.manipal.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddRemoveDemo {

	public static void main(String[] args) {
		Set<String> fruits =new TreeSet<>();
		fruits.add("Mango");
		fruits.add("Cheeku");
		fruits.add("Apple");
		fruits.add("Grapes");
		
		
		List<String> baskt=new ArrayList();
		baskt.add("Banana");
		baskt.add("Butter Fruit");
		baskt.add("Berry");
		System.out.println("before sorting"+baskt);
		Collections.sort(baskt);
		System.out.println("after sorting "+baskt);
		
		baskt.addAll(fruits);
		System.out.println(baskt);
		
		baskt.removeAll(fruits);
		System.out.println("after removing"+baskt);
		
		baskt.addAll(fruits);
		baskt.remove("Apple");
		System.out.println(baskt);

		
		
	}

}
