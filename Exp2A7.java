import java.util.*;

class Exp2A7
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int num = s1.nextInt();
		int temp = num;
		int sum = 0;

		while(temp>0)
		{
			sum += temp%10;
			
			temp=temp/10;
		}
		System.out.print("The sum of digits of "+num+" is: "+sum);
	}
}