package com.manipal.io.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProverbReverser {
	static void reverseWord() throws FileNotFoundException {
		FileInputStream fos=new FileInputStream("TopProver.txt");
		DataInputStream fis=new DataInputStream(fos);
		String str="";
		try {
			 str=fis.readUTF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int length = str.length();
		String rev="";
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		FileOutputStream hos=new FileOutputStream("raj");
		DataOutputStream his=new DataOutputStream(hos);
		try {
			his.writeUTF(rev);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
	public static void main(String[] args) throws Exception {
		try{ProverbReverser.reverseWord();}
		catch(Exception E){
			
		}
	}
}

	 