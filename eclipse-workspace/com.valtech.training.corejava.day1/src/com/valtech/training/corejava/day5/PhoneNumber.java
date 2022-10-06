package com.valtech.training.corejava.day5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneNumber {
	 public static int phoneNum(int sz,List<Long> num) {
	      
	      int n=countUniqueDigits( sz, num);
	      return n;
	  }

	  public static int countUniqueDigits(int s,List<Long> num) {
	      Set<Long> digits = new HashSet<Long>();
	      long a=0;
	      int j=0;
	      	for(int i=0;i<s;i++) {
	      		long count=0,e=0;
	      		Long el=num.get(i);
	      		while(el > 0) {	
			         if(digits.add(el % 10)) { 
			        	 e=el%10;
			        	 count=count+1;
			         }
			         else {
			        	 long n=el%10;
			        	 if(e==n) {
			        		 count=count+2;
			        	 }
			        	 else if(e==(n+1)) {
			        		 count=count+2;
			        	 }
			        	 else if(e==(n-1)) {
			        		 count=count+2;
			        	 }
			        	 
			         }
			         el /= 10;
			         }
	      		System.out.println("count"+count);
	      		if(a<count) {
	      			a=count;
	      			j=i;
	      		}
	      		
	      	}
	      	return j;
	  }

}