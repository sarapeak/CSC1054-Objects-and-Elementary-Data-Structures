import java.util.*;
import java.text.*;
import java.io.*;

public class TrainSystem
{
   private int positionX;
   private int positionY;
   private ArrayList<String> trainTrack = new ArrayList<String>(15);   //An arrayList that will store the - of the train tracks
   
   public TrainSystem(Train x, Train y)   //A constructor that takes in Train x and Train y
   {
      positionX = x.setTrainPosition();   //Train x now becomes positionX while also calling on the setTrainPosition from the Train Class
      positionY = y.setTrainPosition();   //Train y now becomes positionY while also calling on the setTrainPosition from the Train Class
   }
   
   public void moveTrainXLeft()   //The moveTrainXLeft() method moves train x one to the left
   {
      positionX--;   //Takes positionX and subtracts 1 from it
   }
   
   public void moveTrainYLeft()   //The moveTrainYLeft method moves train y one to the left
   {
      positionY--;   //Takes positionY and subtracts 1 from it
   }
   
   public void moveTrainXRight()   //The moveTrainXRight method moves train x one to the right
   {
      positionX++;   //Takes positionX and adds 1 to it
   }
   
   public void moveTrainYRight()   //The moveTrainYRight method moves train y one to the right
   {
      positionY++;   //Takes positionY and adds 1 to it
   }
   
   public boolean getCrashedTrains()   //A boolean method that returns if train x and train y have crashed into one another
   {
      if(positionX == positionY)
      {
         return true;   //If positionX and positionY have the same number, then the method returns true
      }
      else
      {
         return false;   //If positionX and positionY are not equal, then the method returns false
      }
   }
   
   public void trackUpdate()   //This method updates the track by inputting where the x and y train are on the tracks
   {
      for(int i=0; i<15; i++)   //A for loop that creates 14 hyphens which are added to the ArrayList
      {
         trainTrack.add(i, "-");
      }
      if(positionX<0)   //If positionX position is less than 0, the position is set to 14
      {
         positionX = 14;
         trainTrack.set(positionX, "X");   //Sets the X train in the positionX index in the ArrayList
         trainTrack.set(positionY, "Y");   //Sets the Y train in the positionY index in the ArrayList
      }
      else if(positionY<0)   //If positionY position is less than 0, the position is set to 14
      {
         positionY = 14;
         trainTrack.set(positionY, "Y");   //Sets the Y train in the positionY index in the ArrayList
         trainTrack.set(positionX, "X");   //Sets the X train in the positionX index in the ArrayList
      }
      else if(positionX>=15)   //If positionX position is greater than or equal to 15, the position is set to 0
      {
         positionX = 0;
         trainTrack.set(positionX, "X");   //Sets the X train in the positionX index in the ArrayList
         trainTrack.set(positionY, "Y");   //Sets the Y train in the positionY index in the ArrayList
      }
      else if(positionY>=15)   //If positionY position is greater than or equal to 15, the position is set to 0
      {
         positionY = 0;
         trainTrack.set(positionY, "Y");   //Sets the Y train in the positionY index in the ArrayList
         trainTrack.set(positionX, "X");   //Sets the X train in the positionX index in the ArrayList
      }
      else   //If the positions for positionX and positionY does not go out of bounds for the arrayList, then the positions are set to their respective positions
      {
         trainTrack.set(positionX, "X");   //Sets the X train in the positionX index in the ArrayList
         trainTrack.set(positionY, "Y");   //Sets the Y train in the positionY index in the ArrayList
      }
   }
   
   public String toString()   //This toString prints out the tracks in which the X and Y trains reside
   {
      String toReturn = "===============\n";   //Creates the border on the top
      for(int j=0; j<15; j++)
      {
         toReturn += trainTrack.get(j);   //Creates the hyphens and where X and Y are on the tracks
      }
      toReturn += "\n===============";   //Creates the border on the bottom
      return toReturn;
   }
}