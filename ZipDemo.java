package com.manipal.collection.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ZipDemo {

	public static void main(String[] args) {
		Map<String,String> zip=new HashMap();
		zip.put("123456", "Banglore");
		zip.put("124569", "Manglore");
		zip.put("570018", "Mysore");
		zip.put("570321", "Hassan");
		zip.put("570321", "jam ");
		System.out.println(zip);
		System.out.println(zip.get("560054"));
		Set<String> set=zip.keySet();
		Iterator<String> it =set.iterator();
		while(it.hasNext())
		{
			String code=it.next();
			String msg=zip.get(code);
			System.out.println(code+": "+msg);
		}
	}

}
