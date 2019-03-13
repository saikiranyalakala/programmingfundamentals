package com.manipal.collection.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> sqlErrors = new HashMap<>();
		sqlErrors.put("007", "Statments contains illegal caharacter");
		sqlErrors.put("105", "Invalid String");
		sqlErrors.put("104", "Invalid Symbol");
		sqlErrors.put("029", "Into class required");
		System.out.println(sqlErrors);
		
		String message=sqlErrors.get("007");
		System.out.println(message);
		//to get the itirator function in map
		Set<String> errorCodeSet =sqlErrors.keySet();
		Iterator<String> it=errorCodeSet.iterator();
		
		while(it.hasNext()){
			String code=it.next();
			String msg=sqlErrors.get(code);
			System.out.println(code+" :"+msg);
		}
		
	}

}
