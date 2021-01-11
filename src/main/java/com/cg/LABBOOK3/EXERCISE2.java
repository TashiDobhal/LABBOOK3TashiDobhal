/** 
 * Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
 * @author TASHI DOBHAL
 *
 */package com.cg.LABBOOK3;

public class EXERCISE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ss="Earth";
 System.out.println(getImage(ss));

	}
 static String getImage(String Earth ) {
		
		
	        String str = "Earth";
	 
	        // conversion from String object to StringBuffer
	        StringBuffer sbr = new StringBuffer(str);
	        // To reverse the string
	     sbr.reverse();
	    String b= (str+"|"+sbr);
	    return b;
	      
	    }
	}




