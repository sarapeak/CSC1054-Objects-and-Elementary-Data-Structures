import java.util.*;
import java.text.*;
import java.io.*;

public class Book
{
   protected int numberOfPages;
   protected String title;
   
   public Book(int numberOfPages, String title)
   {
      this.numberOfPages = numberOfPages;
      this.title = title;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public int morePages(int numberPages)
   {
      int pages = numberOfPages + numberPages;
      pages = 1000 - pages;
      return pages;
   }
   
   public String toString()
   {
      String toReturn = title+" with "+numberOfPages;
      return toReturn;
   }
}