import java.util.*;
import java.text.*;
import java.io.*;

public class Entry
{
   private int x;
   private int y;
   private String name;
   
   public Entry(int x, int y, String name)   //An Entry constructor that takes in two integers and a String
   {
      this.x = x;
      this.y = y;
      this.name = name;
   }
   
   public String toString()   //To avoid printing out a hashcode, this toString prints ou the information stored in the Entry ArrayList
   {
      String toReturn = x+" "+y+" "+name;
      return toReturn;
   }
}