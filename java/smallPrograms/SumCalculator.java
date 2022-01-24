package smallPrograms;

import java.util.Scanner;

public class SumCalculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		// Set this to run forever 
		while(true)
		{
			// Ask the user to enter an integer and read it with the scanner
			System.out.print("Enter integer value to sum up (-1 to terminate)):");
			int n = scanner.nextInt();

			// Check if the integer is -1, if it is, break the loop
			if( n == -1)
				break;

			// Add n to the total sum of numbers
			sum += n;
		}
		// Print out the final sum
		System.out.println("The sum is: " + sum);
	}
}
