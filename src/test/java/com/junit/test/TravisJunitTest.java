package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.travis.test.TravisTest;

public class TravisJunitTest {

	@Test
	public void test() {
		assertTrue(new TravisTest().travisTest(1, 2) == 3);
	}
	
}
