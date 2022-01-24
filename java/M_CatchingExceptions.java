/* Exceptions are protected sections of code that are likely to go wrong
 * The protected code is insterted into the try{ } block.
 *
 * Exception types are identified at compile time, or discovered at runtime
 * They are then "Caught" through the catch{ } block.
 *
 * The finally{ } block sweeps up anything and can either return or exit.
 * */

public class M_CatchingExceptions {

	public static void main(String [] args)
	{
		/* this method doesn't need to be in a block, because it throws a runtime exception
		 * Howerver it will stop the running of the program if it is.  Try putting a try/catch block
		 * around it and seeing if the program continues to run!
		 */
		doSomething(1);

		try {
			// This method must be contained in a `catch` block so that the exception is handled
		   doSomethingElse(11);
		} catch (ArrayIndexOutOfBoundsException e) {
			// The stack trace is printed, but the execution of `doSomethingElse` is stopped early
			e.printStackTrace();
		}finally {
		   // The finally block always executes.
			doTheLastThing();
		}
	}

	private static void doSomething(int n)
	{
		if(n == 10)
		{
			// Code that should work
		}
		else
			throw new RuntimeException("Oh no!");
	}

	private static void doSomethingElse(int n) throws ArrayIndexOutOfBoundsException
	{
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		if( n >= array.length)
			throw new ArrayIndexOutOfBoundsException("index n is greater than the array size");

		System.out.println("This won't be printed because the exception is thrown up and the method stops");

	}

	private static void doTheLastThing()
	{
		System.out.println("This always works");
	}
}
