import java.util.*;

public class LuckyNumber{
    public static void main(String args[]){
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a five digit number");
		
		int num=sc.nextInt();

		int A=0,B=0,C=0,D=0,E=0;
		int count=0;
       
       
       if(num>9999 && num<100000)
        {
           while (num> 0) {

            count ++;
			
				switch(count)
				{
					case 1:
					E = num % 10;
					break;
				
					case 2:
					D = num % 10;
					break;

					case 3:
					C = num % 10;
					break;

					case 4:
					B = num % 10;
					break;

					case 5:
					A = num % 10;
					break;

				}

            

            num = num / 10;
            
        } 
            
        
        	if ((A+B+C) == (D+E))
            {
                System.out.println("Lucky Number!!");
            }
          else
            {
                System.out.println("Unlucky Number!!");
            }
        }
        
        else
          {
            System.out.println("Enter a five digit number!!");
          }
}
    
}