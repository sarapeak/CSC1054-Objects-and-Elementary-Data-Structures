import java.util.*;
import java.text.*;
import java.io.*;

public class Train
{
   private int position;
   private int trainPosition;
   private static int trainCount = 0;
   
   public static int getTrainCount()    //Returns the amount of times the trains moved
   {
      return trainCount-2;
   }
   
   public Train(int position)    //Takes in an int parameter for position
   {
      trainPosition = position;   //position is now trainPosition
   }
   
   public int setTrainPosition()
   {
      if(trainPosition > 14)    //If the train has a position greater than 14, it sets the trainPosition to 0
      {
         trainPosition = 0;
      }
      else if(trainPosition < 0)  //If the train has a position greater than 0, it sets the trainPosition to 14
      {
         trainPosition = 14;
      }
      
      trainCount++;    //Each time the trains are moved, it counts the move
      
      return trainPosition;   //If train position is fine, it returns the value inputted
   }
}