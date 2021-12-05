/*Code created by Sara Peak for the Programming MidTerm CSC-1054*/

import java.util.*;
import java.text.*;
import java.io.*;

public class MidTerm
{
   public static void main(String[] args)
   {
      //Part 1:
      //Defining the variables that are to be used
      String destination = "Hawaii";
      int speed = 5;
      int distance = 30;
      
      Vehicle v = new Submarine(speed, destination, distance);   //Creating a Submarine
      
      Submarine sub = ((Submarine)v);
      sub.setDistance(10000);   //Setting the distance of sub to 10000
      System.out.println(v);
      System.out.println("time to get there: "+sub.getTimeOfTravel());
      
      System.out.println();
      //Part 2:
      Alpha a = new Alpha("Omega");   //Setting Alpha a's String
      Alpha b = new Alpha("Delta");   //Setting Alpha b's String
      Alpha c = new Alpha("Epsilon");   //Setting Alpha c's String
      
      //Matching each String up to see if they are the same, of different lengths, or anything else
      System.out.println(b.match("Delta"));
      System.out.println(a.match("Omega"));
      System.out.println(a.match("Epsilon"));
      System.out.println(a.match("Gamma"));
      System.out.println(c.match("Epsilon"));
      System.out.println(b.match("Omega"));
      
      System.out.println("exacts: "+Alpha.getExact());   //Prints out the amount of matches there were
      
      System.out.println();
      //Part 3:
      Scanner scan = new Scanner(System.in);
      int numbersAdded = 0;
      
      System.out.println("How many numbers?");
      int numberLength = scan.nextInt();   //Stores the number the user wants to input
      ArrayList<Integer> numArrayList = new ArrayList<Integer>(numberLength);   //An integer ArrayList
      
      //A for loop that stores the numbers the user puts in for the length that the user specified above
      for(int i = 0; i<numberLength; i++)
      {
         System.out.println("Enter number "+i+":");
         int userNumber = scan.nextInt();
         numArrayList.add(userNumber);
         numbersAdded += userNumber;   //Adds the inputted numbers together
      }

      int result = numbersAdded/numberLength;   //Calculates the average of the numbers
      
      //A try catch that creates a new file and stores the calculations and user inputs from above in a new file
      try
      {
         FileOutputStream fos = new FileOutputStream("results.txt", false);
         PrintWriter pw = new PrintWriter(fos);
         pw.print(numberLength+"\n");
         //This for loop calls on the ArrayList to print out the numbers stored in it
         for(int k = 0; k<numberLength; k++)
         {
            int arrayNum = numArrayList.get(k);
            pw.print(arrayNum+" ");
         }
         pw.print("\n"+result);
         pw.close();
      }
      catch(FileNotFoundException fnfe)
      {
         System.out.println("File does not exist!");
      }
   }
}