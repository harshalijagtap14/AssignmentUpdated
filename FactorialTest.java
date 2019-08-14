package nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {
	
	Factorial factorial=new Factorial();

	@Test
	void calculate5Factorialtest() {
		
	
		int result=factorial.calculateFactorial(5);
		assertEquals(result,120);
	}
	
	void calculate6Factorialtest()
	{
		int result=factorial.calculateFactorial(6);
		assertEquals(result,720);
		
	}
	
	void invalidInputTest()
	{
		int result=factorial.calculateFactorial(-6);
		assertEquals(result,-1);
	}

}
