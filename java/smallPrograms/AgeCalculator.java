package smallPrograms;

import java.util.Scanner;


public class AgeCalculator
{
	public static void main(String[] args)
	{
		// Create a new scanner objest and ask for all the required data
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the current year then press RETURN: ");
		int currentYear = scanner.nextInt();

		System.out.print("Enter the current month (a number from 1 to 12): ");
		int currentMonth = scanner.nextInt();

		System.out.print("Enter your current age in years: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter the month in which you were born (a number from 1 to 12): ");
		int birthMonth = scanner.nextInt();

		System.out.print("Enter the year for which you wish to know your age: ");
		int tgtYear = scanner.nextInt();

		System.out.print("Enter the month in this year: ");
 		int tgtMonth = scanner.nextInt();
		
		// Calculate the year that the person was born
		int birthYear = currentYear - age;

		// Calculate the month the person was born
		int months = currentMonth - birthMonth;
		if(months < 0)				// If we roll to negative, restart from 12
			months = 12 + months;
		if(months > 13)				// If we roll to 13 months, restart from 0
			months = months - 12;
		
		// Use the birthday info to calculate years
		int years = tgtYear - birthYear;	

		System.out.println("Your age will be " + years + " years and " + months 
				+ " months in " + currentYear + "/" + currentMonth );
	}
}
