import java.util.*;
import java.text.*;
import java.io.*;

public class Lab4
{
   public static void main(String[] args)
   {
      //Part 1: Calculating an equation
      Scanner scan = new Scanner(System.in);   //A scanner
      int result = 0;   //result that is to be used when the operation is complete, needs to be initialized first
      int loopResult = 0;   //loopResult that is used to continue the loop if there is an error
      
      do
      {
         loopResult = 0;   //Resets the loopResult to 0 for each loop
         
         String num1 = scan.next();   //Takes in the first int that the user enters
         String num2 = scan.next();   //Takes in the second int that the user enters
         String operator = scan.next();   //Takes in the operator that the user enters
         
         try   //Tries to calculate the equation the user entered
         {
            int number1 = Integer.parseInt(num1);   //parseInt num1 from String to integer
            int number2 = Integer.parseInt(num2);   //parseInt num2 from String to integer
            
            if(operator.equals("*"))   //If the operator is this * then this code block is executed
            {
               result = number1*number2;
               System.out.println("Result: "+result);
            }
            else if(operator.equals("/"))   //If the operator is this / then this code block is executed
            {
               result = number1/number2;
               System.out.println("Result: "+result);
            }
            else   //If the operator is anything else then this code block is executed
            {
               loopResult = -1;   //Makes LoopResult equals -1 in order to continue the loop
               System.out.println("Error: Operator is unacceptable");
            }
         }
         catch(NumberFormatException nfe)   //Catches the number format error and prints out why the code did not execute properly
         {
            loopResult = -1;   //Makes LoopResult equals -1 in order to continue the loop
            System.out.println("Error: Cannot convert input to integer");
         }
         catch(ArithmeticException ae)   //Catches the arithmetic error in which the user tries to divide by 0 and prints out that it cannot divide by 0
         {
            loopResult = -1;   //Makes LoopResult equals -1 in order to continue the loop
            System.out.println("Error: Cannot divide by 0");
         }
         System.out.println();
      }while(loopResult == -1);   //Continues the loop when there is an error
      
      //Part 2: Reading data from files
      Level fileReading = new Level("ExampleFile.txt");   //Calls on the Level class constructor
      System.out.println(fileReading);   //Prints out the information from the file inputted
      
      try
      {
         FileOutputStream fos = new FileOutputStream("output.txt", false);   //Sees if there is a file named output; if false, it creates a file; if true, it does nothing 
         PrintWriter pw = new PrintWriter(fos);
         pw.print(fileReading);   //Prints the information from the file the user is looking at into this new file
         pw.close();   //Closes the file
      }
      catch(FileNotFoundException fnfe)
      {
         System.out.println("File does not exist!");   //If the file does not exist, it catches the error and tells the user that the file does not exist
      }
   }
}