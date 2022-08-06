import java.util.Scanner;

class Exp2B4
{
    public static void main(String args[]) 
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the first string: ");
		 String str1 = scan.nextLine();
		 System.out.println("Enter the second string: ");
		 String str2 = scan.nextLine();
		 
		 System.out.println("Strings before swapping : \nString 1: "+str1+"\nString 2: "+str2);
		 
		 str1 = str1+str2;
		 str2 = str1.substring(0,(str1.length() - str2.length()));
		 str1 = str1.substring(str2.length(),str1.length());

		 System.out.println("Strings before swapping : \nString 1: "+str1+"\nString 2: "+str2);
		 
	}
}
