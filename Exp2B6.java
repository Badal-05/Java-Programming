import java.util.*;
class Exp2B6
{
    public static void main(String arg[])
    {
		int k = 0; 
		char adj=0;
		Scanner s1 = new Scanner(System.in);
		String s = s1.nextLine();	
		char []arr = s.toCharArray();
		for(char c : arr)
		{
			if(adj !=c)
			{
				arr[k++] = c;
				adj= c;
			}
		}
		String str = new String(arr).substring(0,k);
		System.out.println(str);
    }
}