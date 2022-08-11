import java.util.*;
class Exp2B8
{
    
	static void sort_3x3(int[][] arr)
	{
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				for(int k = 0 ; k < 3 ; k++)
				{
					for(int l = 0 ; l < 3 ; l++)
					{
						if(arr[i][j] < arr[k][l])
						{
							int temp = arr[i][j];
							arr[i][j] = arr[k][l];
							arr[k][l] = temp;
						}
					}
				}
			}
		}
	}
	

	static void display(int[][] arr)
	{
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
	
	static void get(int[][] arr)
	{
		
		Scanner s1 = new Scanner(System.in);
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				int a = s1.nextInt();
				arr[i][j] = a;
			}
		}
	}
	
	static void del(int[][] arr,int x)
	{
		
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				if(arr[i][j] == x)
				{
					System.out.print("  ");
				}
				else
				{	
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	
	

	public static void main(String arg[])
    {
		Scanner s1 = new Scanner(System.in);	
		int [][]arr = new int[3][3];
		
		System.out.println("Enter the elements of the array: ");
		get(arr);
		
		System.out.println("/nThe sorted array is: ");
		sort_3x3(arr);
		
		display(arr);
		System.out.println("Enter the element which you want to delete: ");
		
		int n = s1.nextInt();
		System.out.println("/nThe resultant array is: ");
		del(arr,n);
		
		System.out.println("The biggest element in row 1 is: "+arr[0][2]);
		System.out.println("The biggest element in row 2 is: "+arr[1][2]);
		System.out.println("The biggest element in row 3 is: "+arr[2][2]);
		System.out.println("The biggest element in col 1 is: "+arr[2][0]);
		System.out.println("The biggest element in col 2 is: "+arr[2][1]);
		System.out.println("The biggest element in col 3 is: "+arr[2][2]);
		System.out.println("The biggest element in the entire array is: "+arr[2][2]);
		
    }
}