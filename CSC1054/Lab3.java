import java.util.*;
import java.text.*;
import java.io.*;

public class Lab3
{
   public static void main(String[] args)
   {
      //Part 1: Car
      FordTruck car = new FordTruck(0, "Explorer", 100);   //Created car that calls onto the FordTruck class
      FordTruck truck = new FordTruck(5, "Jeep", 5);
      car.drive();   //Drives the car
      System.out.println(car);   //Prints out the car's speed, name, and hauling capacity
      car.drive();   //Drives the car again
      System.out.println(car);   //Prints out the car's speed, name, and hauling capacity
      car.drive();   //Drives the truck again
      System.out.println(truck);   //Prints out the truck's speed, name, and hauling capacity
      
      //Part 2: Zoo
      Scanner scan = new Scanner(System.in);   //A scanner
      ArrayList<Bird> birdArrayList = new ArrayList<Bird>();   //An arraylist that ooks at Bird
      
      //The menu for the user to see what options they can choose
      System.out.println("Which option do you wish to select?");
      System.out.println("0 - eat\n1 - chirp\n2 - tap dance penguins\n3 - add new bird\n4 - fly\n5 - swim\n6 - remove based on callsign\n7 - print\n8 - quit.");
      
      String userInput = scan.next();   //Stores the user information nad uses it below in for the cases
      System.out.println();
      
      do
      {
         if(userInput.equals("8"))   //If the user inputs 8 in the beginning, it breaks the loop entirely ending the program
         {
            break;
         }
         
         switch(userInput)   //Based on the user's input it will go to any of the cases
         {
            case "0":   //When the user calls on this case, each bird in the arraylist gets fed
               for(int i = 0; i<birdArrayList.size(); i++)
               {
                  birdArrayList.get(i).eat();   //For each bird in the arraylist it calls onto the eat method in Penguin or HummingBird
               }
               break;
               
            case "1":   //Prints out that the penguins and hummingbirds are chirping depending on the arraylist
               for(int c = 0; c<birdArrayList.size(); c++)
               {
                  birdArrayList.get(c).chirp();   //For each bird in the arraylist it calls on the chirp method in Penguin or HummingBird
               }
               break;
               
            case "2":   //Prints out how many tap dancing penguins there are in the arraylist
               for(int t = 0; t<birdArrayList.size(); t++)
               {
                  if(birdArrayList.get(t) instanceof Penguin)   //If t in the arraylist is an instanceof Penguin then it will print out that the penguin is tap dancing
                  {
                     Penguin p = new Penguin();
                     p.tapDance();
                  }
               }
               break;
               
            case "3":   //Asks for the user input as to what bird they want to add, the descriptions, and the number of meals eaten
               System.out.println("Which would you like to add? (P = Penguin and H = HummingBird)");   //Asks the user if they would like to add a P for penguin or H for hummingbird
               String birdChoice = scan.next();   //Stores the user's input in birdChoice and is used below
               
               if(birdChoice.equals("P"))   //If user asks for P
               {
                  System.out.println("Enter in a callsign and the number of meals previously eaten.");   //Asks for a callsign and meals eaten
                  String penguinCallsign = scan.next();   //Stores the callsign
                  int penguinMeals = scan.nextInt();   //Stores the meals
                  
                  Penguin penguin = new Penguin(penguinCallsign, penguinMeals);   //Puts the information in the Penguin constructor
                  birdArrayList.add(penguin);   //Adds the penguin to the birdArrayList
               }
               else if(birdChoice.equals("H"))   //If user asks for H
               {
                  System.out.println("Enter in a name, callsign, and the number of meals previously eaten.");
                  String humName = scan.next();   //Stores the name
                  String humCallsign = scan.next();   //Stores the callsign
                  int humMeals = scan.nextInt();   //Stores the meals
                  
                  HummingBird hummingBird = new HummingBird(humCallsign, humMeals, humName);   //Puts the information in the HummingBird constuctor
                  birdArrayList.add(hummingBird);   //Adds the hummingbird to the birdArrayList
               }
               else   //Is the user enters anything else, it tells them it was an invalid input
               {
                  System.out.println("Invalid choice. Can only be P or H.");
               }
               break;
            
            case "4":   //Returns which birds are flying and which are not
               for(int f = 0; f<birdArrayList.size(); f++)
               {
                  birdArrayList.get(f).fly();   //For each bird in the arraylist it calls onto the fly method in Penguin or HummingBird
               }
               break;
               
            case "5":   //Returns which birds are swimming and which are not
               for(int s = 0; s<birdArrayList.size(); s++)
               {
                  birdArrayList.get(s).swim();   //For each bird in the arraylist it calls onto the swim method in Penguin or HummingBird
               }
               break;
            
            case "6":   //Remove a bird based on its personal callsign
               System.out.println("Which callsign would you like to remove?");   //Asks the user which callsign they would like to remove
               String callsignRemove = scan.next();   //Stores the user's input in callsignRemove
               for(int r = 0; r<birdArrayList.size(); r++)   //A for loop to go through the birdArrayList
               {
                  if(birdArrayList.get(r) instanceof Penguin)   //If r is an instanceof Penguin then it executes this code
                  {
                     Penguin penguinCall = (Penguin) birdArrayList.get(r);   //Creates a penguin construtor to point to the information in penguin
                     String PC = penguinCall.getPCallsign();   //Calls onto the getPCallsign method to get the callsign in that memory block
                     if(PC.equals(callsignRemove))   //If the callsigns are equal, then the arraylist removes it
                     {
                        birdArrayList.remove(r);
                     }
                  }
                  else if(birdArrayList.get(r) instanceof HummingBird)   //If r is an instanceof HummingBird then it executes this code
                  {
                     HummingBird hummingCall = (HummingBird) birdArrayList.get(r);   //Creates a hummingbird construtor to point to the information in hummingbird
                     String HC = hummingCall.getHCallsign();   //Calls onto the getHCallsign method to get the callsign in that memory block
                     if(HC.equals(callsignRemove))   //If the callsigns are equal, then the arraylist removes it
                     {
                        birdArrayList.remove(r);
                     }
                  }
               }
               break;
            
            case "7":   //Prints out the birds and their information
               for(int b = 0; b<birdArrayList.size(); b++)
               {
                  System.out.println(birdArrayList.get(b));   //Prints out the birds information
                  System.out.println(" ");   //A space so they are not really close together
               }
               break;
            
            default:   //If anything else is entered, it returns that the input is invalid and returns to the loop
               System.out.println("Invalid input.");

         }
         System.out.println();
         //The menu again inside the loop this time
         System.out.println("Which option do you wish to select?");
         System.out.println("0 - eat\n1 - chirp\n2 - tap dance penguins\n3 - add new bird\n4 - fly\n5 - swim\n6 - remove based on callsign\n7 - print\n8 - quit.");
         
         userInput = scan.next();   //Stores the user's input and continues the loop
         System.out.println();
      }while(!(userInput.equals("8")));   //If user inputs 8, the loop ends
   }
}