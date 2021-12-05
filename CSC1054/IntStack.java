import java.util.*;
import java.text.*;
import java.io.*;

public class IntStack
{
   LinkedListNode head;
   private int counter;
   
   public IntStack()   //A constructor that makes head = null
   {
      head = null;
   }
   
   public void push(int data)   //A method that pushes a new integer on top of the list
   {
      LinkedListNode lln = new LinkedListNode(data);
      
      lln.setNext(head);   //Makes head the next
      head = lln;   //Sets the new integer as head
      
      counter++;   //Adds 1 to the counter
   }
   
   public void pop()   //A method that removes the top integer from the stack
   {
      if(head != null)   //If head is not equal to null, then it makes the head next
      {
         head = head.getNext();
         counter--;   //Deletes one from the counter
      }
      else   //Else is returns head as null
      {
         head = null;
      }
   }
   
   public boolean isEmpty()   //A method that returns head as null if the list is empty
   {
      return head == null;
   }
   
   public int top()   //A method that returns the top number of the stack
   {
      return head.getData();
   }
   
   public int peek()   //A method that returns the int at the front of the stack
   {
      if(head != null)   //Returns the int if head is not null
      {
         return head.getData();
      }
      return -1;   //Returns -1 if null
   }
   
   public String toString()   //A toString method that formats it when printed out
   {  
      LinkedListNode current = head;   //Makes current equal to head
      String toReturn = "";
      toReturn += "Stack:\n<top>\n";
      
      for(int c = 0; c<counter; c++)   //A for loop that loops through the stack
      {
         Card cardClass = new Card(current.getData());
         toReturn += cardClass+"\n";
         
         current = current.getNext();   //Makes current the nest one in the stack
      }
      
      toReturn += "<bottom>";
      
      return toReturn;
   }
}