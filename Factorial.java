package nit;

import java.util.Scanner;

public class Factorial {
	
	public int calculateFactorial(int number)
	{
		if(number<0)
		{
			return -1;
		}
		else {
		int i,result=1;
		
		for(i=number;i>=1;i--)
		{
			result=result*i;
		}
		
		return result;
	}
	}

	public static void main(String[] args) {
		
		System.out.println("enter the number:");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		Factorial factorial=new Factorial();
		int result=factorial.calculateFactorial(number);
		if(result<0)
		{
			System.out.println("invalid input");
		}
		else {
		System.out.println("Factorial is:"+result);
		
}
	}
}
