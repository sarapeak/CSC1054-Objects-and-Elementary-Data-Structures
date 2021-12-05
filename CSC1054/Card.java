import java.util.*;
import java.text.*;
import java.io.*;

public class Card
{
   LinkedListNode head;
   private int data;
   
   public Card(int data)   //A constructor that takes in an int
   {
      this.data = data;
   }
   
   public String toString()   //A toString that formats the Card
   {
      return "Card: "+data;
   }
}