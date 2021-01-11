/**
 * Exercise 8:: Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.  
 *@author Tashi Dobhal
 *
 */
package com.cg.LABBOOK3;

public class EXERCISE8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ant";
		System.out.println(positive());
		
	}
	static boolean positive()
	{
		String s="ant";
	    for (int i = 0; i != s.length(); ++i) {
	    	
	        if (!Character.isLetter(s.charAt(i))) 
	        {
	            return false;
	        }
	       
	    }
	    return true;
	}
		}







