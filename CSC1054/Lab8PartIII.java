import java.io.*;
import java.util.*;
import java.text.*;

public class Lab8PartIII
{  
   static int count;
   static int [] myArray = {4, 8, 23, 70, 0, 34, 0, 0, 0};
   
   public static void main(String[] args)
   {     
      getZero(0, myArray, 0);
      System.out.println("There are "+getZero(0, myArray, 0)+" 0's in the array.");
   }
   
   public static int getZero(int start, int [] myArray, int count)   //The resursion method to find the 0's
   {
      if(start!=myArray.length)
      {
         System.out.println(myArray[start]);
         
         if(myArray[start]!=0)
         {
            return getZero(start+1, myArray, count);
         }
         else
         {
            if(myArray[start] == 0)
            {
               return getZero(start+1, myArray, count+1);
            }
         }
      }
   return count;
   }
}