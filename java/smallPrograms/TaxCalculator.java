package smallPrograms;

import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your salary in GBP:");
		
		int salary = scanner.nextInt();
		double tax = 0;
	
		
		salary -= 12500;
		if(salary > 0)
			tax += salary * 0.2;
		
		salary -= (37500);

		if(salary > 0)
			tax += salary * 0.4;

		salary -= (100000);

		if(salary > 0)
			tax += salary * 0.05;
	
		System.out.println("Tax: " + tax);

	}

}
