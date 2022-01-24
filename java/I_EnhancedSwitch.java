public class I_EnhancedSwitch
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
	

	public String assignmentUsingSwitch(int errorCode)
	{
		// This is an example where a switch can assign a value 

		String message = switch (errorCode) 
		{
    			case 404:
        			yield "Not found!";
    			case 500:
        			yield "Internal server error!";
    			default:
        			throw new IllegalArgumentException("Unexpected value: " + errorCode);
		};
		return message;
	}

	private static void functionCall()
	{
		System.out.println("You called a function");
	}
}
