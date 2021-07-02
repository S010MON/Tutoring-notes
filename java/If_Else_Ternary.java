/* If Shorthand. Aka 'Ternary Operator'
 * The use of a short notation for if/else statements uses three operators:
 * (conditionalStatement)? operationIfTrue : operationIfFalse;
 */

package toolbox;

public class If_Else_Ternary
{
	public static void main(String[] args)
	{
		boolean truth = true;
		String output = (truth == true)? "True!" : "False";
		System.out.println(output);
	}
}
