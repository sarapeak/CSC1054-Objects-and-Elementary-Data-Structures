import java.util.*;
import java.text.*;
import java.io.*;

public class Penguin extends Bird   //Penguin is a subclass of Bird
{
   private boolean canFlyP;
   private boolean canChirp;
   private boolean canSwim = true;
   
   public Penguin(String birdCallsign, int birdMealsEaten)   //A constructor that takes in the Bird callsign and mealsEaten
   {
      super(birdCallsign, birdMealsEaten);
   }
   
   public Penguin()   //An empty constructor to satisfy what is in the super class
   {
   }
   
   public String getPCallsign()   //Method that returns the Penguin's callsign
   {
      return callsign;
   }
   
   public void tapDance()   //Method that returns Tap Dancing Penguins
   {
      System.out.println("Tap Dancing Penguins!");
   }
   
   public void fly()   //Method that makes it false that the Penguin can fly
   {
      canFlyP = false;
      System.out.println("Penguins cannot fly");   //Prints out that pengunis cannot fly
   }
   
   public void chirp()   //Method that makes it true that the Penguin can chirp
   {
      canChirp = true;
      System.out.println("Penguin Chirping!");   //Prints out that the penguin is chirping
   }
   
   public void swim()   //Method that makes it true that Penguins can swim
   {
      System.out.println("Swimming Penguin!");   //Prints out that the penguin is swimming
   }
   
   public int eat()   //Method that returns the number of mealsEaten
   {
      mealsEaten = mealsEaten+3;   //Adds 3 meals to mealsEaten each time it is called
      return mealsEaten;   //Returns mealsEaten
   }
   
   public String toString()   //toString that prints out the meals, swim, and callsign of the Penguin
   {
      String toReturn = "Penguin: \n";
      toReturn += "Meals Eaten: "+mealsEaten+"\n";
      toReturn += "Can Swim: "+canSwim+"\n";
      toReturn += "Callsign: "+callsign+"\n";
      return toReturn;
   }
}