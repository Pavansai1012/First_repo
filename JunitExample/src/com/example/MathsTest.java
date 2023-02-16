package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathsTest {

	Maths P;
	@Before
	public void setUp() throws Exception {
		P=new Maths();
		
	}
/*
	@Test
	public void testforsum()
	{
		assertEquals(25, P.add(5, 5));
	}
	*/
@Test
public void testForSquare()
{
	assertEquals(36,P.square(6));
}
}
