package com.manipal.pf.demo;

import java.io.*;
import java.util.*;
public class Numbers{   
    public static void main(String[]args)throws Exception{
         
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] number = new int[size];
        int[] counter = new int[size];
        int i, j, c=0;
         
        for(i = 0;i<number.length; i++){
            System.out.print(" ");
            number[i] = sc.nextInt();
            if (number[i]==-1){
                break;
            }                       
        }
        Arrays.sort(number);
        System.out.println("Numbers\tCounts");
        for (i=2; i<number.length;i++){
             
            if (i!=0){
                if(number[i]==number[i-1]){
                    do{
                        i=i+1;
                        counter[i-2]=c+1;
                    }while(number[i]==number[i-1]);
                }
            }
            System.out.println(number[i]+"\t"+counter[i-2]);
             
        }       
    }
}