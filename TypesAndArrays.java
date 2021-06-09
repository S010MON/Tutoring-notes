public class TypesAndArrays
{
	public static void main(String[] args)
	{
		// These are primitive types, they are just a bucket for storing raw information
		
		int i = 5;  		// a primitive integer (note the lowercase letter!)

		char c = 'c';  		// a primitive character (note the use of ' ' single quotes)


		// These are Objects (note Capital letter)
		
	       	Integer integer = 10;

		Character character = 'c';	

		String s = "This is a string, a list of chars";

		// Objects hold data, and can be acted upon using METHODS, this is done with the '.' dot operator
		
		s = "a word";
		s.length();		// This gets the length of the String s



		// If we want to store multiple objects or primitives we can use an array
		// This is essentially a block of memory where the elements are stored sequentially.
		// The [] square brackets show that this is a list of integers, and not just one
		
		int[] numbers = new int[10];		// We must give the array a size limit when we make a new array

		numbers[0] = 100;			// use the [] brackets to access the element's value
		numbers[9] = 900;			// all arrays start at zero and go to the length -1

		// To print out an element of an array, we can use the same notation
		
		System.out.println(numbers[0]);

		// If we try and access an element that doesn't exist, or is outside the range we will get an Exception
		
		System.out.println(numbers[5]);		// <- this fails because it doesn't exist
		System.out.println(numbers[30]);	// <- this fails because it is out of range



		// Objects can also be used in arrays, we can make an array of just about anything!
		
	        Character[] letters = new Character[5];
       		String[] words = new String[10];

		// This means we can combine the '.' dot operator and the '[]' array operator and call methods on an element of an array
		
		words[0] = "ALL UPPER CASE";
		words[1] = words[0].toLowerCase();	// <- this accesses the String element at words[0] and makes it lower case, before putting 
							// it into the element at words[1].  This would look like this:
							//
							//	element		contents before		contents after
							//	
							//	0		"ALL UPPER CASE"	"ALL UPPER CASE"
							//	1		- null - 		"all upper case"
	}

}
