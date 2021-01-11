/**
 * Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 *@author Tashi Dobhal
 *
 */package com.cg.LABBOOK3;

import java.util.StringTokenizer;

public class EXERCISE1 {

	
   
 int  Sumtoken(StringTokenizer token)
{
	int sum = 0, dig = 0;
	 while(token.hasMoreTokens())
   {
               String s=token.nextToken();
               dig=Integer.parseInt(s);
               System.out.print(dig+" ");
               sum=sum+dig;
   }
	 return sum;
}

}
