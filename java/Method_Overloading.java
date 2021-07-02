/* 	Method Overloading
	A method can be defined twice as long as it calls parameters of different types
	For example:
*/

package toolbox;

public class Overloading
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		double c = 1.1;
		double d = 2.2; 	//lol boobs.
		
		System.out.println(add(a, b));	// Output = 3
		System.out.println(add(c, d));	// Output = 3.3
	}

	public int add(int a, int b)
	{
		int out = a + b;
		return out;
	}

	public double add(double a, double b)
	{
		double out = a + b;
		return out;
	}
}
