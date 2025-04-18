package task9;

public class Main {

	public static void main(String[] args) 
	{
		SendIntroMessage();
	}
	
	private static void print(String message)
	{
		System.out.println(message);
	}
	
	private static void SendIntroMessage()
	{
		print("Hello World");
		print("This is my print method");
		print("Thank you for viewing");
	}
}
