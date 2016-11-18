
/**
 * Write a description of class Factors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Factors
{
   public static void main (String [] args)
   {Scanner reader = new Scanner(System.in);
       int number;
       System.out.println("Please enter a number (0 quits)");
       number = reader.nextInt();
       while (number != 0)
       {
           for (int i = 1; i <= number/2; i++)
           { if (number % i ==0)
               { 
                   System.out.println(i);
                }
            }
             System.out.println(number);
             System.out.println("Give me another number (0 quits)");
             number = reader.nextInt();
   
   
   
   
   
   
    }
}
}

