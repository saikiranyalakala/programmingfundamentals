package com.manipal.io.demo;

import java.io.FileInputStream;
import java.io.IOException;

public class ProverbReader {

	public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream("TopProver.txt");
			int i;

			while((i=file.read())!=-1){
				System.out.print((char)i);
			}
		}


	}


