/**
 * Exercise 5: Write a Java program that displays the number of characters, lines and words in a text? 
 *@author Tashi Dobhal
 *
 */package com.cg.LABBOOK3;
import java.util.*;
import java.io.*;

public class EXERCISE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

                        int nl=1,nw=0;           
                        char ch;
                       
                         
                        FileInputStream f=new FileInputStream("text.txt");
                        int n=f.available();
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)f.read();
                                    if(ch=='\n')
                                    nl++;
                                    else if(ch==' ')
                                                nw++;
                                                                       
                        }
                        System.out.println("\nNumber of lines : "+nl);
                        System.out.println("\nNumber of words : "+(nl+nw));
                        System.out.println("\nNumber of characters : "+n);
                       

            }
}


