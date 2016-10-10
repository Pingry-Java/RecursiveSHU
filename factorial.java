import java.util.Scanner;
public class factorial
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Input a number. ");
		int userNumber = user.nextInt();
		System.out.println("The factorial of " + userNumber + " is " + factorial(userNumber));
	}
	public static int factorial(int number)
	{
		if (number == 0)
			return 1;
		return number * factorial(number - 1);
	
	}
}