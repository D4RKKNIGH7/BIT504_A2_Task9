package task9;

public class Main {

	public static void main(String[] args) 
	{
		SendIntroMessage();
		SendExitMessage();
	}
	
	private static void print(String message)
	{
		System.out.println(message);
	}
	
	private static void SendIntroMessage()
	{
		print("Hello World");
		print("I hope you enjoy your stay");
	}
	
	private static void SendExitMessage()
	{
		print("Goodbye World");
		print("Thank you for viewing");
	}
}
