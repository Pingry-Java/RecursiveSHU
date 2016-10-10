import java.util.Scanner;
public class factorial
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Input a number. ");
		double userNumber = user.nextDouble();
		System.out.println("The factorial of " + userNumber + " is " + factorial(userNumber));
	}
	public static double factorial(double number)
	{
		if (number == 0)
			return 1;
		return number * factorial(number - 1);
	
	}
}
