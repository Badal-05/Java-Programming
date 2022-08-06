import java.util.*;

class Exp2A8
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number of even terms:  ");
		int num = s1.nextInt();
		int temp = 2*num;
		int sum =0;
		
		for(int i = 0;i<temp ; i=i+2)
		{
			if(i%3 == 0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum is : "+sum);
	}
}