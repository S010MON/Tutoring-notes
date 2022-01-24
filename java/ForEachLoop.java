/* For Each Loop
 * Used to loop through arrays.
 * 
 * for (type variableName : arrayName)
 * 
 */

public class ForEachLoop
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};		
		for( int i: array )
		{
			System.out.println( i * 5 );	// Output: 5, 10, 15, 20, 25
		}
	}	
}
