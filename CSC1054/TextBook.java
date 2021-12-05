import java.util.*;
import java.text.*;
import java.io.*;

public class TextBook extends Book
{
   private String subjectType;
   
   public TextBook(int numberOfPages, String title, String subjectType)
   {
      super(numberOfPages, title);
      this.subjectType = subjectType;
   }
   
   public String toString()
   {
      String toReturn = subjectType+": "+title+" with "+numberOfPages;
      return toReturn;
   }
}