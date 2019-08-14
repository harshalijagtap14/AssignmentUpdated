package nit;

import java.util.Scanner;

public class SumOfNumbers {
	
	public int SumOfEvenNumbers(int firstNumber,int secondNumber)
	{
		int i,evenSum=0;
		if(firstNumber%2==0)
		{
			for(i=firstNumber;i<=secondNumber;i=i+2)
			{
				evenSum=evenSum+i;
			}
		}
		
		else {
			
			for(i=firstNumber+1;i<=secondNumber;i=i+2)
			{
				evenSum=evenSum+i;
			}
		}
		
		return evenSum;

}
	
	public int SumOfOddNumbers(int firstNumber,int secondNumber)
	{
		int i,oddSum=0;
		if(firstNumber%2!=0)
		{
			for(i=firstNumber;i<=secondNumber;i=i+2)
			{
				oddSum=oddSum+i;
			}
		}
			
			else {
				
				for(i=firstNumber+1;i<=secondNumber;i=i+2)
				{
					oddSum=oddSum+i;
				}
			}
		
			
			return oddSum;
		
	}
	
	public static void main(String args[])
	{
		SumOfNumbers sumOfNumber=new SumOfNumbers();
		
		System.out.println("enter starting and ending number:");
		Scanner scanner=new Scanner(System.in);
		int startingNumber=scanner.nextInt();
		int endingNumber=scanner.nextInt();
		System.out.println("Sum of even numbers: "+sumOfNumber.SumOfEvenNumbers(startingNumber,endingNumber));
		System.out.println("Sum of odd numbers: "+sumOfNumber.SumOfOddNumbers(startingNumber,endingNumber));
	}

}
