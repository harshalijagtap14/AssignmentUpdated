package nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void testmarkValidator() {
		
		MarkValidator markValidator=new MarkValidator();
		String result=markValidator.markGrade(95);
		assertEquals("A",result);
		}
	
	void testinvalidInput() {
		
		MarkValidator markValidator=new MarkValidator();
		String result=markValidator.markGrade(-76);
		assertEquals("invalid input",result);
	}

}
