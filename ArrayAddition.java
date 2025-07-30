import java.util.*;

public class ArrayAddition
{
	public static void main(String args[])
	{
		int size;
		System.out.println("Enter Size:");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();

		int a[] = new int[size];
		int sum = 0;

		System.out.println("Enter the Numbers:");
		for(int i = 0; i < size; i++)
		{
			a[i] = s.nextInt();
			sum += a[i];  // Corrected: add array value, not index
		}

		System.out.println("The sum is: " + sum);
	}
}