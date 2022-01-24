/* Type Casting.
 * Primative data types can be converted from one to another in two ways:
 * 	
 *	Widening. Done automatically
 * 	Narrowing. Done manually by usuing the type in brackets.
 *
 * Example below:
 */

public class TypeCasting{

	public static void Main(String[] args)
	{
		// Primitive data types in order of size	
		byte aByte = 1;
		short aShort = 1;
		char aChar = '1';
		int anInt = 1;
		long aLong = 1l;
		float aFloat = 1.0f;
		double aDouble = 1.0d; 
	
		// All of the below can happen automatically as they are scaling up in size, so the
		// java compiler automatically type casts.
		aShort = aByte;
		anInt = aChar;
		aLong = anInt;
		aFloat = aLong;
		aDouble = aFloat; 

		// All if the below need to be cast manually as they are scaly down.
		aFloat = (float) aDouble; 
		aLong = (long) aFloat;
		anInt = (int) aLong;
		aChar = (char) anInt;
		aShort = (short) aChar;
		aByte =	(byte) aShort;
	}
}
