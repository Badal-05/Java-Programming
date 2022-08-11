import java.util.*;

class Exp2B9
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		int [][]arr = new int[4][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		arr[3] = new int[5];

		System.out.println("Enter the marks of Raja:");
		for(int i = 0 ; i<arr[0].length;i++)
		{
			arr[0][i] = s1.nextInt();
		}
		System.out.println("Enter the marks of Dev:");
		for(int i = 0 ; i<arr[1].length;i++)
		{
			arr[1][i] = s1.nextInt();
		}
		System.out.println("Enter the marks of Arush:");
		for(int i = 0 ; i<arr[2].length;i++)
		{
			arr[2][i] = s1.nextInt();
		}
		System.out.println("Enter the marks of John:");
		for(int i = 0 ; i<arr[3].length;i++)
		{
			arr[3][i] = s1.nextInt();
		}
	
		System.out.println("The marksheet is:");
		for(int i= 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[i].length ; j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();	
		}
	}
}