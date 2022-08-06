import java.util.*;

class Exp2B1
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = s1.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = s1.nextLine();
		
		
		System.out.println("The lenght of first string is: "+str1.length());
		System.out.println("The lenght of second string is: "+str2.length());
		System.out.println("The concatenated string is: "+str1.concat(str2));
		System.out.println("First string in upper case is: "+str1.toUpperCase());		

	}	
}