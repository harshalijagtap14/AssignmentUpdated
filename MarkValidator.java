package nit;

import java.util.Scanner;

public class MarkValidator {
	
   public  boolean isPass(int marks) {
		
		if(marks>=40)
		{
			return true;
		}
		else {
			
			return false;
}
		
}
	
	public String markGrade(int marks)
	{
		if(marks<0)
		{
			return "invalid input";
		}
		if(marks>=0&&marks<=40)
		{
		   if(isPass(marks))
		   {
			   return "pass";
		   }
		   else {
			   
			   return "fail";
			   
		   }
		   
		   }
		else if(marks>90)
			return "A";
		else if(marks>75&&marks<=90)
			return "B";
		else if(marks>60&&marks<=75)
			return "C";
		else
			return "D";
		
	}
	
	public static void main(String args[])
	{
		System.out.println("enter the marks:");
		Scanner scanner=new Scanner(System.in);
		int marks=scanner.nextInt();
		
		
		MarkValidator markValidator=new MarkValidator();
		System.out.print(markValidator.markGrade(marks));
		
	}

}



