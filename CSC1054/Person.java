import java.util.*;
import java.text.*;
import java.io.*;

public class Person
{
   private String name;
   private String personName;
   private int age;
   private int personAge;
   private int ID;
   private int personID;
   private static int count = 0;
   
   public static int getCount()   //Returns the count of how many people are in the system
   {
      return count;
   }
   
   public Person(String name, int age, int ID)   //Takes in a string, int, and int
   {
      personName = name;     //Instance variables renamed so I don't have to us this.
      personAge = age;
      personID = ID;
      count++;               //Counts how many objects of Person there are
   }
   
   public boolean equals(Object o)   //A boolean method that goes through and identifies if a person is equal to another person based on the information given in the client constructors
   {
      if(! (o instanceof Person))    //o is an object of Person
      {
         return false;    //If o is not an object, it returns false
      }
      else
      {
         Person person = (Person) o;   //If an object is given, it passes through to give o a new variable name (person)
         
         if(person.personName == personName && person.personAge == personAge && person.personID == personID)  //Checks through each information individually to see if they are equal
         {
            return true;    //If true it returns true
         }
      }
      return false;   //If information is not valid, it returns false
   }
   
   public String toString()   //A toString that prints out the information given in neat rows
   {
      String toReturn = "Age: "+personAge+"\n";
      toReturn += "Name: "+personName+"\n";
      toReturn += "ID: "+personID+"\n";
      return toReturn;
   }
}