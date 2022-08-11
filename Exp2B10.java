import java.util.*;

class Exp2B10
{
	static void sortin(int[] arr)
	{
		int l = arr.length;
		for(int i = 0; i<l ; i++)
		{
			for(int j = i+1 ; j < arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	static int bin_srch(int[] arr,int size,int key)
	{
		int s =0;
		int e = size;
		while(s<=e)
		{
			int mid = (s+e)/2;

			if (arr[mid] == key)
			{
				return mid;
			}
			
			else if(arr[mid] > key)
			{
				e=mid-1;
			}
			
			else 
			{
				s = mid+1;
			}
		}	
		return -1;
	}
	
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = s1.nextInt();
		System.out.println("Enter the elements: ");
		int []arr = new int[size];
		
		for(int i=0 ; i<size ; i++)
		{
			arr[i]=s1.nextInt();
		}
		System.out.println("Enter the key: ");
		int key = s1.nextInt();
		System.out.println("The key is present at: ");
		sortin(arr);
		System.out.println(bin_srch(arr,size,key));
	}
}
