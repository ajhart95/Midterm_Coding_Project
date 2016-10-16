package com.cisc181.core;

import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import org.junit.Test;
import org.junit.Rule;

import com.cisc181.eNums.eTitle;

public class Test_InvalidNumber {
	
	@Rule
	public ExpectedException thrown= ExpectedException.none();
	
	@Test
	public void test() throws PersonException{
		thrown.expect(PersonException.class);
		Staff person1 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0", "ajhart@udel.edu", "Monday", 1, 50000, null, eTitle.MR);
		Staff person2 = new Staff("Alex", "James", "Hart", null, "UD", "0-000-0000", "ajhart@udel.edu", "Monday", 1, 40000, null, eTitle.MR);
		Staff person3 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0000", "ajhart@udel.edu", "Monday", 1, 42000, null, eTitle.MR);
		Staff person4 = new Staff("Alex", "James", "Hart", null, "UD", "000-00-0000", "ajhart@udel.edu", "Monday", 1, 45000, null, eTitle.MR);
		Staff person5 = new Staff("Alex", "James", "Hart", null, "UD", "00-00-000", "ajhart@udel.edu", "Monday", 1, 47000, null, eTitle.MR);
	}

}
