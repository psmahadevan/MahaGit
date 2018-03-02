package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.travis.test.TravisTest;

class TravisJunitTest {

	@Test
	void test() {
		 assertTrue(new TravisTest().travisTest(1, 2) == 3);
	}
}
