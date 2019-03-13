package com.manipal.io.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {
	   
	static void storeProverb() throws IOException{
		String str="";
		FileOutputStream fos=new FileOutputStream("TopProver.txt");
		 Scanner sc = new Scanner(System.in);
		 do{
		     str = sc.nextLine();
		  
		      System.out.println(str);
		      byte []data=str.getBytes();
		      if(str.equals("stop")){
		    	  break;
		      }
		      fos.write(data);
		 }while(!str.equals("stop"));
		 sc.close();
		    }
	

	public static void main(String[] args)throws Exception {
		ProverbCollection.storeProverb();
	}

}
