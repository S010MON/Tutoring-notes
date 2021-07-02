/* Switch Operations
 * The switch expression is evaluated once.
 * The value of the expression is compared with the values of each case.
 * If there is a match, the associated block of code is executed.
 */

package toolbox;

public class Switch
{
	public static void main(String[] args)
	{
		int day = args[0];			// The argument is parsed from the terminal arguments.
		switch (day) 				// The int day is compared to each case.
		{
		case 1:
			System.out.println("Monday");
			break;				// The use of 'break' stops the execution of any other code.
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:				// The 'default' command will execute if there are no matches.
			System.out.println("Every day is a school day"); 
		}
	}
}






