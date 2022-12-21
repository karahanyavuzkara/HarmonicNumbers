package patika;
import java.util.Scanner;
public class HarmonicNumbers {

	public static void main(String[] args) {
		int number ;
             System.out.println("Enter the number : ");
             Scanner input = new Scanner(System.in);
           
              number = input.nextInt();
              double result = 0.0 ;             
        
          for (int i = 1 ; i <= number ; i++ ) {
        	 result+= 1/i ;
        	
         
         }
         System.out.print(result);
         
	} 
}
