package com.liuxu.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;



public class RrandomUtilTest {

	@Test
	public void testRandom() {
		int i = RrandomUtil.random(1, 10);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is = RrandomUtil.subRandom(1, 10, 4);
		 for(int i : is) {
			 System.out.println(i);
		 }
	}

	@Test
	public void testRandomCharacter() {
		char c = RrandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String string = RrandomUtil.randomString(4);
		System.out.println(string);
	}

}
