import java.util.*;
import java.text.*;
import java.io.*;

public class Submarine extends Vehicle
{
   private String destination;
   private int distance;
   
   //A Submarine constructor that takes in speed from the Vehicle class, destination, and distance
   public Submarine(int speed, String destination, int distance)
   {
      super(speed);
      this.destination = destination;
      this.distance = distance;
   }
   
   //A method that changes the distance set in the client
   public int setDistance(int length)
   {
      distance = length;
      return distance;
   }
   
   //A method that calculates the time of travel by dividing distance/speed
   public int getTimeOfTravel()
   {
      int result = distance/getSpeed();
      return result;
   }
   
   //Structures the string when printed out
   public String toString()
   {
      return "Submarine: "+getSpeed()+" "+destination+" "+distance;
   }
}