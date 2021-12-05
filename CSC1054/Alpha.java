import java.util.*;
import java.text.*;
import java.io.*;

public class Alpha
{
   private String pattern;
   private static int numberOfExacts = 0;
   
   //An Alpha constructor that takes in a string pattern
   public Alpha(String pattern)
   {
      this.pattern = pattern;
   }
   
   public String match(String name)
   {  
      if(name.equals(pattern))   //If name and pattern objects are equal, then it returns 1
      {
         numberOfExacts++;   //It also adds 1 to the numberOfExacts
         return "1";
      }
      else if(!(name.length() == pattern.length()))   //Else if the lengths of name nad pattern do not match, then it returns -1
      {
         return "-1";
      }
      else   //For all other cases, it returns 0
      {
         return "0";
      }
   }
   
   public static int getExact()   //Returns the number of exacts or matching strings
   {
      return numberOfExacts;
   }
}
