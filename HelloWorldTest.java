package nit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void helloWorldtest() {
		
		HelloWorld helloWorld=new HelloWorld();
		String result=helloWorld.getMessage();
		assertEquals("Hello World",result);
	}

}
