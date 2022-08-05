import java.util.*;

public class Exp2A2
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		int[] arr = {4,8,9,12};
		int sum = 0;
		for(int i = 0; i<4;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The average of the numbers is : "+sum/4);
	}

}