package nit;

import java.util.Scanner;

public class MarkValidator1 {
	
	public boolean isPass(int marks)
	{
		if(marks>=40)
			return true;
		else 
			return false;
	}
	
	public String markGrade(int marks)
	{
		switch(marks)
		{
			
			case 91: return "A";
			case 90:
			case 76:
				return "B";
			case 75:
			case 61:
				return "C";
			case 40:
			case 0:
				if(isPass(marks))
				{
					return "pass";
				}
				else
				{
					return "fail";
				}
					
		    default:
		    	return "D";
		}
	}
	
	
	
	public static void main(String args[])
	{
		
		System.out.println("enter the marks:");
		Scanner scanner=new Scanner(System.in);
		int marks=scanner.nextInt();
		MarkValidator obj=new MarkValidator();
		System.out.print(obj.markGrade(marks));
	}

}
