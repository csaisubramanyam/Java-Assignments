package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Recursion {

		public long factorial(long n) 
		{
			if(n==1)
			{
				return 1;
			}
			else
			{
				return n*factorial(n-1);
			}
		}
}