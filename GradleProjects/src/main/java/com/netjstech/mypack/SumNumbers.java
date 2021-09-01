package com.netjstech.mypack;

public class SumNumbers {
	public int sum(int a, int b) {
		if(a>=12)
			throw new IllegalArgumentException("Value should be less than 10");
		return a+b;
	}

}
