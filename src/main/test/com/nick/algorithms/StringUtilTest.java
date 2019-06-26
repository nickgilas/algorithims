package com.nick.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import com.nick.algorithms.strings.StringUtil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringUtilTest {

	private StringUtil util = new StringUtil();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Disabled
	@Test
	public void testReplaceSpaces() {
		char[] array = "Mr John Smith    ".toCharArray();
		util.replaceSpaces(array, 13);
		assertEquals("Mr%20John%20Smith".toCharArray(), array);
	}

	@Test
	void testIsUnique() {
		assertFalse(util.isUnique("123fba66a"));
		assertTrue(util.isUnique("12dftg"));
	}

	@Test
	void testPermutation() {
		assertFalse(util.permutation("123456", "678901"));
		assertTrue(util.permutation("12345", "54321"));
	}

	@Test
	void testPermutation2() {
		assertFalse(util.permutation2("1223456", "6667890"));
		assertTrue(util.permutation2("122345", "543221"));
	}

}
