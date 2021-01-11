/**
 * Exercise 4: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is. 
 *@author Tashi Dobhal
 *
 */package com.cg.LABBOOK3;
import java.lang.*;
import java.util.*;

public class EXERCISE4 {
  public static void main(String[] args) {
	    int diff=12345;
        System.out.println(modifyNumber(diff));
        }
   static String modifyNumber(int number1)	
       {
        	int number = 12345;
         	int i,diff=0;
	        String result = "";
        	String str1 = Integer.toString(number);
	for(i=0;i<str1.length()-1;i++)
	  {
	    	char ch= str1.charAt(i);
	    	int num=Integer.parseInt(String.valueOf(ch));
	    	char ch1= str1.charAt(i+1);
	 	    int num1=Integer.parseInt(String.valueOf(ch1));
	       diff=Math.abs(num-num1);
	 
	       result +=Integer.toString(diff);
	}
	char ch= str1.charAt(0);
	int num=Integer.parseInt(String.valueOf(ch));
	char ch1= str1.charAt(str1.length()-1);
	int num1=Integer.parseInt(String.valueOf(ch1));
	diff = Math.abs(num-num1);
	result +=Integer.toString(diff);
	return result;

	}
}
