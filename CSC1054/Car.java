import java.util.*;
import java.text.*;
import java.io.*;

public abstract class Car
{
   protected float speed;   //Protected so it can be used in its subclasses
   protected String name;   //Protected so it can be used in its subclasses
   
   public Car(float carSpeed, String carName)   //The constructor that takes in a float and String
   {
      speed = carSpeed;   //Is able to be called from the subclass
      name = carName;   //Is able to be called from the subclass
   }
   
   public abstract double drive();   //The abstract method that can be used in the subclass
}