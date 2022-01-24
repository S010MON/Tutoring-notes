/* For Loop
 * Used for repeated operations for a known number of itterations.
 * 
 * for(statement 1; statement 2; statement 3)
 * 
 * Statement 1 is executed (one time) before the execution of the code block.
 * 
 * Statement 2 defines the condition for executing the code block.
 * 
 * Statement 3 is executed (every time) after the code block has been execute
 * 
 */


public class F_ForLoop
{
	public static void main(String[] args)
	{
		int[] array = {0,1,2,3,4};
		for(int n = 0; n < array.length; n++)
		{
			array[n] += 1; 	// Adds 1 to every item in the array.
		} 
	}
}

