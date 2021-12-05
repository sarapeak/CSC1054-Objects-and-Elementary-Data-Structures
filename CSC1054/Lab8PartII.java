import java.io.*;
import java.util.*;
import java.text.*;

public class Lab8PartII
{  
   public static void main(String[] args)
   {
      //Calls onto the iterative method
      System.out.println(iterative(7));
      System.out.println(iterative(14));
      System.out.println(iterative(35));
      System.out.println(iterative(40));
      System.out.println(iterative(42));
      System.out.println(iterative(46));
      
      System.out.println();   //Makes a space between the two method answers
      
      //Calls onto the recursive method
      System.out.println(mystery(7));
      System.out.println(mystery(14));
      System.out.println(mystery(35));
      System.out.println(mystery(40));
      System.out.println(mystery(42));
      System.out.println(mystery(46));
   }
   
   //The recursive method
   public static int mystery (int num)
   {
      if(num<=2)   //The base case
      {
         return 1;
      }
      else   //The general case
      {
        return mystery(num-1)+mystery(num-2);
      }
   }
   
   //The iterative method
   public static int iterative(int num)
   {
      int [] itArray = new int [num];   //An array for num
      
      itArray[0] = 1;   //Index 0 is 1 which is 1
      itArray[1] = 1;   //Index 1 is 2 which is 1
      
      //A for loop to calculate a solution from the bottom up
      for(int i = 0; i<itArray.length-2; i++)
      {
         itArray[2+i] = itArray[0+i] + itArray[1+i];
      }
      
      return itArray[num-1];   //Returns the total based on the calculations above
   }
}