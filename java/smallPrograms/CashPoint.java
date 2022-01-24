package smallPrograms;

import java.util.Scanner;

public class CashPoint
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount: ");
		int amount = scanner.nextInt();

		if(amount > 250)
			System.out.println("You cannot draw more than £250");
		else if((amount % 5) != 0)
			System.out.println("Amount must be factor of 5 or 10");
		else
		{
			int remainder = amount;
			int fifties = 0;
			int twenties = 0;
			int tens = 0;
			int fives = 0;

			if(remainder > 50)
			{
				fifties = remainder / 50;
				remainder -= fifties * 50;				
			}
			if(remainder > 20)
			{
				twenties = remainder / 20;
				remainder -= twenties * 20;
			}
			if(remainder > 10)
			{
				tens = remainder / 10;
				remainder -= tens * 10;
			}
			fives = remainder / 5;
			remainder -= fives * 5;

			System.out.println("£50=" + fifties);
			System.out.println("£20=" + twenties);
			System.out.println("£10=" + tens);
			System.out.println(" £5=" + fives);
		}
	}
}
