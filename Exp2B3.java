import java.util.Scanner;

class Exp2B4
{
    public static void main(String args[]) 
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 String str1 = scan.nextLine();
		 String str2 = scan.nextLine();
		 
		 str1 = str1+str2;
		 str2 = str1.substring(0,(str1.length() - str2.length()));
		 str1 = str1.substring(str2.length(),str1.length());

		System.out.println(str1+"   "+str2);
		 
	}
}

        

