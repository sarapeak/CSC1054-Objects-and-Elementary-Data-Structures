import java.util.*;
import java.text.*;
import java.io.*;

public class FordTruck extends Car   //FordTruck is a subclass of Car
{
   private int haulingCapacity;
   private int carHaulingCapacity;
   
   public FordTruck(float carSpeed, String carName, int haulingCapacity)   //A constructor that takes in a float, string, and int
   {
      super(carSpeed, carName);   //carSpeed and carName are from the superclass Car, so I need to call on the superclass to use the member variables
      carHaulingCapacity = haulingCapacity;   //haulingCapacity is now carHaulingCapacity
   }
   
   public double drive()   //The drive() method is from the superclass Car, here it is called on to increase the speed each time
   {
      speed++;   //Increases the speed by 1
      return speed;
   }
   
   public String toString()   //A toString() that prints out the name, speed, and carHaulingCapacity of the car
   {
      String toReturn = "Name: "+name+"\n";
      toReturn += "Speed: "+speed+"\n";
      toReturn += "Hauling Capacity: "+carHaulingCapacity+"\n";
      return toReturn;
   }
}