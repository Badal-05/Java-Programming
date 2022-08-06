import java.util.*;

public class Exp2A5
{
	
	static void delete(int [] arr,int x)
	{
		int len = arr.length;
		for(int i = 0 ; i<len; i++)
		{
			if (i>x)
			{
				arr[i-1] = arr[i];
			}	
		}
		
		len--;
		System.out.println("The new array is: ");
		for(int i = 0; i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	static void insert(int [] arr1,int x,int y)
	{
		int len = arr1.length;		
		for(int i = 0 ; i<len; i++)
		{
			if (i>=x)
			{
				arr1[i+1] = arr1[i];
			}	
		}
		arr1[y] = x;
		System.out.println("The new array is: ");
		for(int i = 0; i<len;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = s1.nextInt();
		int [] arr = new int[size];
		int [] arr1 = new int[size+1];
		for (int i = 0;i<size ;i++)
		{
			System.out.println("Enter the value: ");
			int val = s1.nextInt();
			arr[i] = val;
			arr1[i] = val;
 		}
		System.out.println("The array you entered is:");
		for (int i = 0;i<size ;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println("\nEnter your choice:\n1.Insert in the array\n2.Delete from the array");
		int choice = s1.nextInt();
		if (choice == 1)
		{
			System.out.println("Enter the position where you want to insert the value: ");
			int pos = s1.nextInt();
			System.out.println("Enter the element: ");
			int elem = s1.nextInt();
			insert(arr1,elem,pos);
		}
		else if (choice == 2)
		{
			System.out.println("Enter the position which you want to delete: ");
			int pos = s1.nextInt();
			delete(arr,pos);
		}
		else
		{
			System.out.println("Enter a valid input");
		}


	}

}