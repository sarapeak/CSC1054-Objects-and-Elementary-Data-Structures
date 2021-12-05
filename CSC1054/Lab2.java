import java.util.*;
import java.text.*;
import java.io.*;

public class Lab2
{
   public static void main(String[] args)
   {
      //Part 1
      //Constructors that assigns the objects given
      Person person1 = new Person("Lauren", 19, 1001);
      Person person2 = new Person("Matthew", 18, 1002);
      Person person3 = new Person("Matthew", 18, 1002);
      Person person5 = new Person("Sara", 100, 17);
      
      Person person4 = person3;  //person4 is being equaled to person3, stores person3's information in its own memory
      
      System.out.println(Person.getCount());  //Gets the count of how many constructers were created
      System.out.println();
      
      System.out.println(person1);    //Prints out person1 information
      System.out.println(person2);    //Prints out person2 information
      System.out.println(person3);    //Prints out person3 information
      
      if(person2.equals(person3))     //Calls onto the .equals method to see if the two people are equal
      {
         System.out.println("person2 and person3 are .equals");  //If equals, prints out
      }
      
      if(person1.equals(person2))     //Calls onto the .equals method to see if the two people are equal
      {
         System.out.println("person1 and person2 are .equals");  //If equals, prints out
      }
      
      if(person1 == person2)     //Compares person1 and person2 to see if they have the same references
      {
         System.out.println("person1 and person2 are ==");   //If ==, prints out
      }
      
      if(person2 == person3)     //Compares person2 and person3 to see if they have the same references
      {
         System.out.println("person2 and person3 are ==");   //If ==, prints out
      }
      
      if(person3 == person4)     //Compares person3 and person4 to see if they have the same references
      {
         System.out.println("person3 and person4 are ==");   //If ==, prints out
      }
      
      System.out.println();
      
      //Part 2
      Scanner scan = new Scanner(System.in);    //Created a scanner
      
      Train xTrain = new Train(0);   //A Train constructor that defines the xTrain with the indicated position
      Train yTrain = new Train(1);   //A Train constructor that defines the yTrain with the indicated position
         
      TrainSystem trains = new TrainSystem(xTrain, yTrain);  //A TrainSystem constructor that defines trains with the xTrain and yTrain
      trains.trackUpdate();   //trains calls upon the TrackUpdate method
      
      while(!(trains.getCrashedTrains()))   //A while loop that loops through until the getCrashedTrains method becomes true
      {
         System.out.println(trains);   //Prints out the toString in the TrainSystem class
         
         if(trains.getCrashedTrains())   //If the getCrashedTrains is true it exits the loop
         {
            break;
         }
         
         System.out.print("Move the X train left (enter L) or right (enter R)?: ");   //Asks the user for input that is L or R
         String userInput = scan.next();   //userInput stores the user's input
         
         while(!userInput.equals("L") || !userInput.equals("R"))  //A loop that loops through if the input is neither L or R
         {
            if(userInput.equals("L") || userInput.equals("R"))
            {
               break;   //Exits this loop if the user inputs L or R
            }
            System.out.println("Invalid user entry. Please only use L or R. Try Again...");
            userInput = scan.next();
         }
         
         if(userInput.equals("L"))   //If user input's L, then the X train moves to the left
         {
            trains.moveTrainXLeft();  //moveTrainXLeft moves the train to the left
            trains.trackUpdate();  //trackUpdate updates the track
            xTrain.setTrainPosition();   //xTrain gets a new position
         }
         else if(userInput.equals("R"))  //If user input's R, then the X train moves to the right
         {
            trains.moveTrainXRight();  //moveTrainXRight moves the train to the right
            trains.trackUpdate();   //trackUpdate updates the track
            xTrain.setTrainPosition();   //xTrain gets a new position
         }
         
         System.out.println();
         System.out.println(trains);   //Prints out the toString with the updated track
         
         if(trains.getCrashedTrains())   //If getCrashedTrains method is true, it exits the loop
         {
            break;
         }
         
         System.out.print("Move the Y train left (enter L) or right (enter R)?: ");   //Asks the user to move the Y train L or R
         userInput = scan.next();
         
         while(!userInput.equals("L") || !userInput.equals("R"))   //A loop that loops through if the input is neither L or R
         {
            if(userInput.equals("L") || userInput.equals("R"))
            {
               break;   //Exits this loop if the user inputs L or R
            }
            System.out.println("Invalid user entry. Please only use L or R. Try Again...");
            userInput = scan.next();
         }
         
         if(userInput.equals("L"))   //If user input's L, then the Y train moves to the left
         {
            trains.moveTrainYLeft();   //moveTrainYLeft moves the train to the left
            trains.trackUpdate();   //trackUpdate updates the track
            yTrain.setTrainPosition();   //xTrain gets a new position
         }
         else if(userInput.equals("R"))   //If user input's R, then the Y train moves to the right
         {
            trains.moveTrainYRight();   //moveTrainYRight moves the train to the right
            trains.trackUpdate();   //trackUpdate updates the track
            yTrain.setTrainPosition();   //xTrain gets a new position
         }
         
         if(trains.getCrashedTrains())   //If getCrashedTrains method is true, it exits the loop
         {
            break;
         }
         
         System.out.println();
      }
      
      System.out.println("CRASH!!!");   //Once the loop exits, this line prints out CRASH to indicate that the trains crashed into each other
      System.out.println("Moves before crash: "+Train.getTrainCount());   //Prints out the number of moves that took place before the crash
   }
}