import java.util.*;

public class Exp2A4
{
	public static void main(String arg[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number: ");			   
		int n = s1.nextInt();

		for (int i=0; i<n; i++)
        {

				
				for (int j=n-i; j>1; j--)
            		{
                
                		System.out.print(" ");
            		}
   
            
            	for (int j=0; j<=i; j++ )
            		{
                
                		System.out.print("* ");
            		}
   
            
            	System.out.println();
			}
	}
}