import java.util.*;
import java.text.*;
import java.io.*;

//This is the Vehicle class copied from the MidTerm(not allowed to be changed or modified)
public class Vehicle
{
   private int speed;
   
   public Vehicle(int speed)
   {
      this.speed = speed;
   }
   
   int getSpeed()
   {
      return speed;
   }
   
   public String toString()
   {
      return "Vehicle: Speed is "+speed;
   }
}