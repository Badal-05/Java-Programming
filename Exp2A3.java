import java.util.*;

public class Exp2A3
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array: ");
		size = s1.nextInt();

		int[] arr = new int[size];
		boolean ans = false;
		
		
		for(int i = 0; i<size;i++)
		{
			System.out.println("Enter the element: ");
			int a = s1.nextInt();
			arr[i] = a;
		}
		
		System.out.println("Enter the value to be searched: ");
		int value = s1.nextInt();

		for(int i = 0; i<size;i++)
		{
			if(arr[i] == value)
			{
				System.out.println("The number is present in the array!!!");
				ans = true;
				
			}
			
		}
		if(ans == false)
		{
			System.out.println("The number is not present in the array!!!");
		}
		
	}

}