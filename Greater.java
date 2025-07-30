import java.util.*;

public class Greater
{
	public static void main(String args[])
	{
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number:");
		a = sc.nextInt();

		System.out.println("Enter 2nd number:");
		b = sc.nextInt();

		if(a > b)
		{
			System.out.printf("%d is greater than %d\n", a, b);
		}
		else
		{
			System.out.printf("%d is greater than %d\n", b, a);
		}
	}
}