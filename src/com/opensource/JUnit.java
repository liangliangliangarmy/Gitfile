package com.opensource;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit {
	private static jmeter new_jmeter = new jmeter();

	@Test
	public void testGetName() {
		new_jmeter.setName("name");
		assertEquals("name",new_jmeter.getName());
	}

	@Test
	public void testGetFriend() {
		new_jmeter.setFriend("friend");
		assertEquals("friend",new_jmeter.getFriend());
	}
}
