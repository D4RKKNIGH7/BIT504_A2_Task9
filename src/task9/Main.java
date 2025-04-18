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
	}
	
	private static void SendExitMessage()
	{
		print("Goodbye World");
		print("Thank you for viewing");
	}
}
