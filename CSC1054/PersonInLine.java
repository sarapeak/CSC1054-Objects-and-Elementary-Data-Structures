import java.util.*;
import java.text.*;
import java.io.*;

public class PersonInLine
{
   private int age;   //An age that is an integer
   private String name;   //A name that is a string
   
   public PersonInLine(String name, int age)   //A constructor that takes in a string and an int
   {
      this.name = name;
      this.age = age;
   }
   
   public String toString()   //Formats the string when printed out
   {
      String toReturn = "Name: "+name+"\t Age: "+age;
      return toReturn;
   }
}