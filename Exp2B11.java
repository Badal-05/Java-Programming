import java.util.Scanner;
class Exp2B11
{
    public static void main(String args[]) 
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 String str = scan.nextLine();
		 String str1 = str.toUpperCase();
		 int x = str.length();
		 int countc=0,countv = 0; 
		 char[] arr = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};	 
	
		 for(int i = 0 ; i < x ; i++)
		 {
				if (str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U' )
		 		{
					countv++;
				}
		 }
		 
		 for(int i = 0 ; i < x ; i++)
		 {
		 	for (int j = 0 ; j < 21 ;j ++)
			{
				if (str1.charAt(i) == arr[j])
				{
					countc++;
				}	
			}
		 }

		 System.out.println("The number of vowels is: "+countv);
		 System.out.println("The number of consonants is: "+countc);
	}
}
