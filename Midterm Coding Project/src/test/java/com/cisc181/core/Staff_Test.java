package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.cisc181.core.Staff;
import com.cisc181.eNums.eTitle;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


public class Staff_Test {

	@BeforeClass
	public static void setup(){
		
	}
	
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> list = new ArrayList<Staff>();
		
		Staff test1 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0000", "ajhart@udel.edu", "Monday", 1, 50000, null, eTitle.MR);
		Staff test2 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0000", "ajhart@udel.edu", "Monday", 1, 40000, null, eTitle.MR);
		Staff test3 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0000", "ajhart@udel.edu", "Monday", 1, 42000, null, eTitle.MR);
		Staff test4 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0000", "ajhart@udel.edu", "Monday", 1, 45000, null, eTitle.MR);
		Staff test5 = new Staff("Alex", "James", "Hart", null, "UD", "000-000-0000", "ajhart@udel.edu", "Monday", 1, 47000, null, eTitle.MR);
		list.add(test1);
		list.add(test2);
		list.add(test3);
		list.add(test4);
		list.add(test5);
		
		double average = (test1.getSalary() + test2.getSalary() + test3.getSalary() + test4.getSalary() + test5.getSalary()) / 5;
		assertEquals(average, 44800, .001);
	}	

}
