package com.helloworld;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HelloWorldTest {
	private int input1;
	private int input2;
	private int input3;
	private int expected;
	private HelloWorld cal = null;
	public HelloWorldTest(int input1,int input2,int input3,int expected){
	this.input1 = input1;
	this.input2 = input2;
	this.input3 = input3;
	this.expected = expected;
	}
	@Before
	public void setUp(){
	cal = new HelloWorld();
	}
	@Parameters
	public static Collection<Object[]> getData(){
	return Arrays.asList(new Object[][]{
	{1,1,1,1},
	{2,2,5,1},
	{3,5,8,1},
	{1,1,1,2},
	{2,2,5,2},
	{3,5,8,2},
	{1,1,1,3},
	{2,2,5,3},
	{3,5,8,3}
	});
	}
	@Test
	public void testAdd() {
	assertEquals(this.expected,cal.triangle(input1, input2, input3));
	}
	}

