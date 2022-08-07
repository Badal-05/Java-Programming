import java.util.*;

class Exp2B5
{
	public static void main(String arg[])
	{
		String []arr = {"dhyey","Tirth","badal","Samarth","Neelay"};
		int len = arr.length;
		for(int i = 0; i < len-1 ; i++)
		{
			for(int j = i+1 ; j < len ; j++)
			{
				if (arr[i].compareTo(arr[j]) > 0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < len ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}