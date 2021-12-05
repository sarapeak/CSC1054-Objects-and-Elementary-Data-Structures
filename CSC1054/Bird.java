import java.util.*;
import java.text.*;
import java.io.*;

public abstract class Bird
{
   //Protected so these can be used in the subclasses
   protected String callsign;
   protected boolean canSwim;
   protected int mealsEaten;
   
   public Bird(String birdCallsign, int birdMealsEaten)   //A constructor created to take in a callsign and mealsEaten
   {
      callsign = birdCallsign;
      mealsEaten = birdMealsEaten;
   }
   
   public Bird()   //An empty constructor
   {
   }
   
   //Methods that are to be used in the subclasses
   public abstract void fly();
   public abstract void chirp();
   public abstract void swim();
   public abstract int eat();
}