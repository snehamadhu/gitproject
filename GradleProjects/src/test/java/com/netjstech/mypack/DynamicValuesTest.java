package com.netjstech.mypack;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class DynamicValuesTest {
	private SumNumbers obj;

	@BeforeAll
    void setUpBeforeClass() throws Exception {
		System.out.println("In the beginning");
		obj=new SumNumbers();
	}

	@TestFactory
	public Stream<DynamicTest> testAdditons() {
		int[][] data= new int[][] {{1,2,3},{5,3,8},{6,7,13}};
		 return Arrays.stream(data).map(entry ->{
			 int a=entry[0];
			 int b=entry[1];
			 int sum=entry[2];
			 return dynamicTest(a+ " + " + b + " = "+ sum,()-> {
				 assertEquals(sum,obj.sum(a,b));
			 });
		 });
	}
}
			