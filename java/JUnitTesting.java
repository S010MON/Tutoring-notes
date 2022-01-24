import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTesting
{
	@Test                                       // annotation specifies that method is the test method.
	public void testOne()
	{
		/* A good way to structure tests is to use the 3 A's:
		 * Arrange:  	set up everything you need for a test, including expected result
		 * Act:		 	do the actions you need to do, including recording the actual result
		 * Assert:		make an assertion that will either pass or fail
		 */

		// Arrange
		int a = 10;
		int b = 15;
		int exp = 5; // our expected answer

		// Act
		int act = a - b; // our actual value from the tested code

		// Assert
		assertEquals(exp, act);
	}

	@BeforeClass                               // annotation specifies that method will be invoked only once, before starting all the tests.
	public void testTwo()
	{
		//Some code here
	}

	@Before                                     // annotation specifies that method will be invoked before each test.
	public void testThree()
	{
		//Some code here
	}

	@After                                      // annotation specifies that method will be invoked after each test.
	public void testFour()
	{
		//Some code here
	}
	
	@AfterClass									// annotation specifies that method will be invoked only once, after finishing all the tests.
	public void testFive()
	{
		//Some code here
	}
}
