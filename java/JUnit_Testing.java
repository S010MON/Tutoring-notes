import junit.framework.*;

public class JUnit_Testing.java
{
	@BeforeClass                                    //annotation specifies that method will be invoked only once, before starting all the tests.
	public void assertNull(Object obj)              //checks that object is null.
	{
		//Some code here
	}
	
	@Before                                         //annotation specifies that method will be invoked before each test.
	public void assertNotNull(Object obj)           //checks that object is not null.
	{
		//Some code here
	}
	
	@Test                                                           //annotation specifies that method is the test method.
	public void assertEquals(boolean expected,boolean actual)       //checks that two primitives/objects are equal. It is overloaded.
	{
		//Some code here
	}
 
	@Test(timeout=1000)                             //annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).
	public void assertTrue(boolean condition)       //checks that a condition is true.
	{
		//Some code here	
	}
	
	@After                                          //annotation specifies that method will be invoked after each test.
	public void assertFalse(boolean condition)      //checks that a condition is false.
	{
		//Some code here
	}
	
	@AfterClass                                     //annotation specifies that method will be invoked only once, after finishing all the tests.
	public void assertNull(Object obj)
	{
		//Some code here
	}
}