import java.util.*;

class Exp2A6
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = s1.nextInt();
		int []arr = new int[size];
		
		for(int i = 0 ; i< size ; i++)
		{
			System.out.println("Enter the value: ");
			arr[i] = s1.nextInt();
		}
		
		int max=arr[0],min;
		for(int i = 0; i<size ; i++)
		{
			for (int j =0 ; j<size ; j++)
			{
				if(arr[i] > max)
				{
					max = arr[i];
				}
			}
		}
		System.out.println("The Largest number is: "+max);

		for(int i = 0; i<size ; i++)
		{
			for (int j =0 ; j<size ; j++)
			{
				if(arr[i] < max)
				{
					max = arr[i];
				}
			}
		}
		System.out.println("The Smallest number is: "+max);
		
	}
}