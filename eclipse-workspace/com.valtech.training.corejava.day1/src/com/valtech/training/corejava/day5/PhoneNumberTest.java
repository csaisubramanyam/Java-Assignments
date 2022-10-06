package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class PhoneNumberTest {

	PhoneNumber p= new PhoneNumber();
	List<Long> nums = new ArrayList<>();
	
	@Test
	public void test() {
		
		//Test Case Set 1
		
		nums.add(3642395455L);
		nums.add(3436043345L);
		int size=nums.size();
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, nums));
		
		//Test Case Set 2
		
		nums.add(5656565656L);
		nums.add(4444444444L);
		nums.add(23470636465L);
		size=nums.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, nums));
		
		//Test Case Set 3 
		
		nums.add(9465456406L);
		nums.add(4278396538L);
		size=nums.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, nums));
		
		// Test Case Set 4
		
		nums.add(2574730575L);
		nums.add(4835602765L);
		size=nums.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, nums));
		
		
		//Test Case Set 5
		
		nums.add(3131313131L);
		nums.add(4367640605L);
		size=nums.size();
		
		
		assertEquals(0,PhoneNumber.checkPhoneNumber(size, nums));
		
	}
	
	
	

}
