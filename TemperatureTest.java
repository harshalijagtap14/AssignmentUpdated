package nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void testConvert33degreesCelciusToFarenheit() {
		
		Temperature temperature=new Temperature();
		int result=temperature.convertToFarenheit(33);
		assertEquals(result,91);
	}
	
	void testConvert100degreesFarenheitToCelcius()
	{
		Temperature temperature=new Temperature();
		int result=temperature.convertToCelsius(100);
		assertEquals(result,37);
		
		
		
		
		
}

}
