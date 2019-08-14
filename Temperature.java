package nit;

import java.util.Scanner;

public class Temperature {
	
	public int convertToFarenheit(int tempValue)
	{
		
		tempValue= (9*tempValue)/5 + 32;
		return tempValue;
	}
	
	public int convertToCelsius(int tempValue)
	{
		
		tempValue= ((tempValue-32)*5)/9;
		return tempValue;
    }
	
	public static void main(String args[])
	{
		Temperature temperature=new Temperature();
		System.out.println("enter the temperature value in degree celcius:");
		Scanner scanner=new Scanner(System.in);
		int tempValue=scanner.nextInt();
		System.out.println("Temperature in farenheit : " +temperature.convertToFarenheit(tempValue));
		
		System.out.println("enter the temperature value in degree farenheit:");
		int tempValue1=scanner.nextInt();
		System.out.println("Temperature in Celcius : " +temperature.convertToCelsius(tempValue1));
	}

}
