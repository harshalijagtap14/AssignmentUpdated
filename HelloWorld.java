package nit;

public class HelloWorld {
	
	public String getMessage()
	{
		return "Hello World";
	}
	

	public static void main(String[] args) {
		
		HelloWorld helloWorld=new HelloWorld();
		
		System.out.print(helloWorld.getMessage());

	}

}
