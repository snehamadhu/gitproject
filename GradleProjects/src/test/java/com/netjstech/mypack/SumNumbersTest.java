package com.netjstech.mypack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumNumbersTest {
	private final SumNumbers obj =new SumNumbers();

	@Test
	 void testSum() {
		assertEquals(5, obj.sum(2, 3));
	}
    @Test
    void testSumNegative() {
    	assertNotEquals(7, obj.sum(2,3));
    }
}

