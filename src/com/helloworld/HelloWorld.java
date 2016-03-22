package com.helloworld;
public class HelloWorld
{ 
	int triangle (int a, int b, int c)
	{ 
		if (a == b && b == c )
			return 1 ;
		
		if (a == b || b== c || a==c )
			return 2;
		
		return 3 ;
	}	
}