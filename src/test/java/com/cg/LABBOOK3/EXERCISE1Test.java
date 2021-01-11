package com.cg.LABBOOK3;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Before;
import org.junit.Test;

public class EXERCISE1Test {

	private EXERCISE1 exercise;
	@Before
	public void setup() {
		exercise = new EXERCISE1();
	}
	@Test
	public void sortString_whenCalled_ShouldReturnSum() {
		StringTokenizer token=new StringTokenizer("1 2 3 4 5 6");
		int result=  exercise.Sumtoken(token);
		  assertEquals(21, result);
		  
		}

	@Test
	public void sortString_whenCalled_ShouldReturnZero() {
		StringTokenizer token=new StringTokenizer("");
		int result=  exercise.Sumtoken(token);
		  assertEquals(0, result);
		  
		}
}
