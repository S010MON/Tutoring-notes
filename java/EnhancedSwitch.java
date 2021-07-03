public class EnhancedSwitch
{
	public static void main(String[] args)
	{
		if(args.length != 1)
		{
			System.out.println("Please enter a or b as an argument");
			System.exit(0);
		}
		
		// The Lambda operator can be used in switch statements to provide cleaner calls to functions
		// This is great for handling key presses or simple switches that take up less space
		
		switch (args[0]) 
            	{
                	case "a" ->  System.out.println("You provided argument a");
			case "b" ->  functionCall();
                	
                }
	
	}

	private static void functionCall()
	{
		System.out.println("You called a function");
	}
}
