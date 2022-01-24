/* Switch Operations
 * The switch expression is evaluated once.
 * The value of the expression is compared with the values of each case.
 * If there is a match, the associated block of code is executed.
 */

public class H_SwitchStatement
{
	public static void main(String[] args)
	{
		String day = args[0];			// The argument is parsed from the terminal arguments.
		switch (day) 				// The int day is compared to each case.
		{
		case "Monday":
			System.out.println(1);
			break;				// The use of 'break' stops the execution of any other code.
		case "Tuesday":
			System.out.println(2);
			break;
		case "Wednesday":
			System.out.println(3);
			break;
		case "Thursday":
			System.out.println(4);
			break;
		case "Friday":
			System.out.println(5);
			break;
		case "Saturday":
			System.out.println(6);
			break;
		case "Sunday":
			System.out.println(7);
			break;
		default:				// The 'default' command will execute if there are no matches.
			System.out.println("Every day is a school day"); 
		}
	}
}






