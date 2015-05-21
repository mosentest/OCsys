package com.llx.ocsys.test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testTbBillsInformation() {
		Calendar instance = Calendar.getInstance();
		System.out.println(instance.getTime());
		System.out.println(instance.getTimeInMillis());
		System.out.println(Long.toString(instance.getTimeInMillis()));
	}

}
