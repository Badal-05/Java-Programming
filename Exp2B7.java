import java.util.*;
class Exp2B7
{
    public static void main(String arg[])
    {
		Scanner s1 = new Scanner(System.in);
		String s = s1.nextLine();
		StringBuffer str = new StringBuffer(s);
		String mask = s1.nextLine();
		
		for(int i = 0 ; i<str.length(); i++)
		{
			for(int j = 0 ; j < mask.length() ; j++)
			{	
				if(str.charAt(i) == mask.charAt(j))
				{
					str.deleteCharAt(i);
				}
			}
		}
		System.out.println(str);
    }
}