/*Code created by Sara Peak for ArrayLists, TemperatureGauge, and Cryptocurrency*/

import java.util.*;
import java.text.*;
import java.io.*;

public class ArrayListsandClasses
{
   public static void main(String[] args)
   {
      //Part 1: Create an ArrayList
      System.out.println("Enter a list of strings followed by EXIT");
      
      Scanner scan = new Scanner(System.in);  //Scans the user's input
      String input = scan.next();
      int i = 0;
      
      ArrayList<String> myFirstArrayList = new ArrayList<String>();    //An array list
      
      while(!(input.equals("EXIT")))    //Loops through until input equals EXIT
      {
         myFirstArrayList.add(input);   //Stores the inputted information from the user
         i++;
         input = scan.next();
      }
      
      i--;   //Takes away one from i to ensure that it is the proper size for the arrayList
      
      System.out.println("What index would you like to remove?");
      
      String useless;   //Only loops if the user enters in a string
      while(!scan.hasNextInt())
      {   
         useless = scan.next();
         System.out.println("Please enter an integer...");
      }
      
      int userIndex = scan.nextInt();   //Loops through until the user enters in a proper index
      while(userIndex>i || userIndex<0)
      {
         System.out.println("Please enter a valid index...");
         userIndex = scan.nextInt();
      }
      
      myFirstArrayList.remove(userIndex);  //Removes the index indicated by the user, pushes everything below it up
      
      for (int j = 0; j<i; j++)
      {
         System.out.println(myFirstArrayList.get(j));
      }
      System.out.println();
      
      //Part 2: Temperature Gauge
      TemperatureGauge gauge1 = new TemperatureGauge();       //Calls on the constructor that has nothing in it
      TemperatureGauge gauge2 = new TemperatureGauge(-50);    //Calls on the constructor that has parameters
      
      System.out.println(gauge1.getTempInF());     //Gets the temperature for gauge1 in F
      System.out.println(gauge1.getTempInC());     //Gets the temperature for gauge1 in C
      
      System.out.println(gauge2.getTempInF());     //Gets the temperature for gauge2 in F
      System.out.println(gauge2.getTempInC());     //Gets the temperature for gauge1 in C
      
      gauge1.setTempInF(-80);     //Sets the temperature for gauge1
      System.out.println(gauge1.getTempInF());     //Gets the temperature for gauge1 in F
      
      gauge1.setTempInF(180);     //Sets the temperature for gauge1
      System.out.println(gauge1.getTempInF());     //Gets the temperature for gauge1 in F
      
      gauge1.setTempInF(59.5);    //Sets the temperature for gauge1
      System.out.println(gauge1.getTempInC());     //Gets the temperature for gauge1 in C
      
      gauge2 = gauge1;    //Makes gauge2 the same number as gauge1
      
      gauge2.setTempInF(33);      //Sets the temperature for gauge2
      System.out.println(gauge1.getTempInC());     //Gets the temperature for gauge2 in C
      
      System.out.println();
      
      //Part 3: Cryptocurrency (getting information from a live source)
      //The menu that the user can look at and decide what to do
      System.out.println("1.\tEnter a new currency.");
      System.out.println("2.\tPrint out all previously added currencies.");
      System.out.println("3.\tUpdate a currency object to a different currency.");
      System.out.println("4.\tExit.");
      
      ArrayList<Currency> currencyArrayList = new ArrayList<Currency>();    //A new arrayList
       
      String userInput = scan.next();   //Scans for the user's input
      do    //A do while loop to loop through until the user specifies 4 to exit
      {
         switch(userInput)
         {
            //If 1, this is where the user can input a new currency
            case "1":
               System.out.println("Enter a new Currency:");
               String currencyUser = scan.next();
               
               Currency money = new Currency(currencyUser);
               currencyArrayList.add(money);    //The new currency is added to the arrayList
               System.out.println();
               break;
               
            //If 2, where the information from the arrayList is printed out
            case "2":      
               for(int k = 0; k<currencyArrayList.size(); k++)
               {
                  System.out.println(currencyArrayList.get(k));
                  System.out.println(" ");
               }
               
               break;
               
            //If 3, where the user can enter a new currency at a certain index that is true from the created arrayList
            case "3":
               System.out.println("Enter a new currency and which index is supposed to be set to that currency:");
               
               currencyUser = scan.next();   //Takes in the new currency
               int currencyIndexByUser = scan.nextInt();    //Takes in the index at which the new currency is to be
               Currency extraMoney = new Currency(currencyUser);   //A new constructor that takes the extraMoney variale and implements it into the currencyUser string
               Currency anotherOne;
               
               if (currencyIndexByUser>currencyArrayList.size()-1 || currencyIndexByUser<0)   //An if/else statement to make sure that the index is valid
               {
                  System.out.println("Invalid index...");
               }
               else
               {
                  anotherOne = currencyArrayList.set(currencyIndexByUser, extraMoney);  //If valid, the new currency replaces to old currency in the specified index
               }
               
               System.out.println();
               break;
               
            default:    //If anything else is inputted, it will tell the user to try again
               System.out.println("Unable to compute... Try Again");
               System.out.println();
               
         }
         //After any of the cases are finished, it returns to the menu for the cycle to start again
         System.out.println("1.\tEnter a new currency.");
         System.out.println("2.\tPrint out all previously added currencies.");
         System.out.println("3.\tUpdate a currency object to a different currency.");
         System.out.println("4.\tExit.");
         
         userInput = scan.next();
      }while(!(userInput.equals("4")));
   }
}