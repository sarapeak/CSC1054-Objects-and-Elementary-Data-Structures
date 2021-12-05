import java.util.*;
import java.text.*;
import java.io.*;

public class HummingBird extends Bird   //HummingBird is a subclass of Bird
{
   private String name;
   private String hummingbirdName;
   private boolean canFlyH;
   private boolean canChirp;
   private boolean canSwim = false;
   
   public HummingBird(String birdCallsign, int birdMealsEaten, String hummingbirdName)   //A constructor that takes in the Bird mealsEaten, callsign, and its own hummingBirdName
   {
      super(birdCallsign, birdMealsEaten);
      name = hummingbirdName;
   }
   
   public HummingBird()   //An empty constructor to satisfy what is in the bird class
   {
   }
   
   public String getHCallsign()   //Method that returns the HummingBird's callsign
   {
      return callsign;
   }
   
   public void fly()   //Method that makes it true that the HummingBird can fly
   {
      canFlyH = true;
      System.out.println(name+" is flying high!!!");   //Prints out the name and that it is flying
   }
   
   public void chirp()   //Method that makes it true that the HummingBird can chirp
   {
      canChirp = true;
      System.out.println(name+" chirps!");   //Prints out the name and that it is chirping
   }
   
   public void swim()   //Method that makes it false that the HummingBird cannot swim
   {
      System.out.println("HummingBirds cannot swim");   //Prints out that it cannot swim
   }
   
   public int eat()   //Method that returns that number of mealsEaten
   {
      mealsEaten++;   //Adds one meal to mealsEaten each time it is called
      return mealsEaten;   //Returns mealsEaten
   }
   
   public String toString()   //toString that prints out the name, meals, swim, and callsign of the HummingBird
   {
      String toReturn = "Name: "+name+"\n";
      toReturn += "Meals Eaten: "+mealsEaten+"\n";
      toReturn += "Can Swim: "+canSwim+"\n";
      toReturn += "Callsign: "+callsign+"\n";
      return toReturn;
   }
}