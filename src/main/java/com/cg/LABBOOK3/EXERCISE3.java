/** 
 * Create a method which accepts a String and replaces all the consonants in the String with the next alphabet
 * @author TASHI DOBHAL
 *
 */package com.cg.LABBOOK3;

public class EXERCISE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java"; 
		System.out.println(alterString(s.toCharArray())); 
	}
	static boolean isVowel(char ch) 
	{ 
		if (ch != 'a' && ch != 'e' && ch != 'i'
				&& ch != 'o' && ch != 'u') 
		{ 
			return false; 
		} 
		return true; 
	} 
	static String alterString(char[] s) 
	{ 
		// Start traversing the string 
		for (int i = 0; i < s.length; i++) 
		{ 
			if (!isVowel(s[i])) 
			{ 

			
				if (s[i] == 'z') 
				{ 
					s[i] = 'a'; 
				} 
				else
				{
					s[i] = (char) (s[i] + 1); 

					
				} 
			} 
		} 
		return String.valueOf(s); 
	} 


	
} 




