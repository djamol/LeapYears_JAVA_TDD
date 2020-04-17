package test.java;

import static org.junit.Assert.*;

import main.java.LeapYear;

import org.junit.Test;

public class LeapYearAmolTest {
		LeapYear leapyear = new LeapYear();
	int arr[] = {1700, 1800, 1900, 2000, 2008, 2012, 2016, 2017, 2018, 2019};
	@Test
	public void Test_1700() {
	boolean output=	leapyear.Check(arr[0]);
	assertEquals(false,output);
	}
	@Test
	public void Test_1800() {
	boolean output=	leapyear.Check(arr[1]);
	assertEquals(false,output);
	}

	@Test
	public void Test_1900() {
	boolean output=	leapyear.Check(arr[2]);
	assertEquals(false,output);
	}
	@Test
	public void Test_2000() {
	boolean output=	leapyear.Check(arr[3]);
	assertEquals(true,output);
	}
	@Test
	public void Test_2008() {
	boolean output=	leapyear.Check(arr[4]);
	assertEquals(true,output);
	}
	@Test
	public void Test_2012() {
	boolean output=	leapyear.Check(arr[5]);
	assertEquals(true,output);
	}
	@Test
	public void Test_2016() {
	boolean output=	leapyear.Check(arr[6]);
	assertEquals(true,output);
	}
	@Test
	public void Test_2017() {
	boolean output=	leapyear.Check(arr[7]);
	assertEquals(false,output);
	}	@Test
	public void Test_2018() {
	boolean output=	leapyear.Check(arr[8]);
	assertEquals(false,output);
	}
	@Test
	public void Test_2019() {
	boolean output=	leapyear.Check(arr[9]);
	assertEquals(false,output);
	}

}
