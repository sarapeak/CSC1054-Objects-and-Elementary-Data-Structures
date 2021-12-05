import java.io.*;
import java.util.*;
import java.text.*;

public class Lab8PartI
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();   //Scans for what the user inputs and remembers it
      System.out.println(mystery(number));   //Prints out the recursion of what the user entered
   }
   
   public static int mystery (int num)   //The resursion method
   {
      if(num<=2)   //Returns 1 if the num is less than or equal to 2
      {
         return 1;
      }
      else   //The general case for every other number
      {
        return mystery(num-1)+mystery(num-2);
      }
   }
}