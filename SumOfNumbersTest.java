package nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	
   	
		
		void testSumOfEvenNumbers() {
			
			SumOfNumbers sumOfNumbers=new SumOfNumbers();
			int result=sumOfNumbers.SumOfEvenNumbers(1, 10);
			assertEquals(30,result);
		}


	
		void testSumOfOddNumbers() 
		{
			SumOfNumbers sumOfNumbers=new SumOfNumbers();
			int result=sumOfNumbers.SumOfOddNumbers(1,10);
			assertEquals(25,result);
		}

	}


