import java.util.*;
import java.text.*;
import java.io.*;

public class MidTermPractice
{
   public static void main(String[] args) throws IOException
   {
      //Part 1
      Book myBook = new Book(100,"Best of both Worlds");
      Book myOtherBook = new Book(999,"Time's Arrow");
      
      System.out.println("First Book: ");
      System.out.println(myBook);
      
      System.out.println("Second Book: ");
      System.out.println(myOtherBook);
      
      System.out.println("On book \""+myBook.getTitle()+ "\", how many more pages to 1000 if I added 256?: "+myBook.morePages(256));
      
      TextBook csBook = new TextBook(880, "CLRS", "Algorithms");
      System.out.println(csBook);
      System.out.println("On book \""+csBook.getTitle()+ "\", how many more pages to 1000 if I added 256?: "+csBook.morePages(256));
      
      //Part 2
      System.out.println();
      DecimalFormat formatAnswers = new DecimalFormat("0.##");
      Scanner scan = new Scanner(new File("NumberFileMidterm.txt"));
      
      double num1 = scan.nextDouble();
      num1 = num1*num1;
      
      double num2 = scan.nextDouble();
      num2 = num2*num2;
      
      double num3 = scan.nextDouble();
      num3 = num3*num3;
      
      double num4 = scan.nextDouble();
      num4 = num4*num4;
      
      double num5 = scan.nextDouble();
      num5 = num5*num5;
      
      System.out.println(formatAnswers.format(num1)+"\n"+formatAnswers.format(num2)+"\n"+formatAnswers.format(num3)+"\n"+formatAnswers.format(num4)+"\n"+formatAnswers.format(num5));
   }
}