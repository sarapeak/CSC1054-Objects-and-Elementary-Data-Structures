import java.util.*;
import java.text.*;
import java.io.*;

public class LinkedList
{
   private LinkedListNode head;   //Creating a LinkedListNode which is called head
   private int numberOfItems;   //This will keep track with counting the number of nodes is created and deleted
   
   public LinkedList()   //A constructor that initializes head and numberOfItems
   {
      head = null;   //Sets equal to null
      numberOfItems = 0;   //Sets numberOfItems to 0
   }
   
   public int getNumberOfItems()   //A method that returns the number of items
   {
      return numberOfItems;
   }
   
   public void insert(int theData)   //A method that inserts a number at the front of the list
   {
      System.out.println("Inserting "+theData);
      
      LinkedListNode lln = new LinkedListNode(theData);   //Creates a new node
      lln.setNext(head);   //Sets the new node in front of head
      head = lln;   //Head the new node
      
      numberOfItems++;   //Adds 1 to numberOfItems
   }
   
   public void insertAtIndex(int value, int index)   //A method that inserts a value in a particular index
   {
      System.out.println("Inserting "+value+" at place "+index);
      
      if(index <= 0)
      {         
         LinkedListNode lln = new LinkedListNode(value);   //Creating a new node
         lln.setNext(head);   //Sets the node in front of head
         head = lln;   //Head is now the new node
         
         numberOfItems++;   //Adds 1
      }
      else
      {
         if(index > numberOfItems)
         {
            if(head == null)   //If head is null then it makes the value head
            {
               LinkedListNode lln = new LinkedListNode(value);   //Creates a new node
               lln.setNext(head);   //Sets node in front of head
               head = lln;   //Makes head the new node
               
               numberOfItems++;   //Adds 1
            }
            else
            {
               LinkedListNode current = head;   //Current is now equal to head
               
               while(current.getNext() != null)   //Loops through the list until current is null
               {
                  current = current.getNext();
               }
               
               LinkedListNode newLLN1 = new LinkedListNode(value);   //Makes a new node
               newLLN1.setNext(current.getNext());   //Sets the node before current
               current.setNext(newLLN1);   //Current is now the new node
               
               numberOfItems++;   //Adds 1
            }
         }
         else
         {
            LinkedListNode current = head;   //Current is equal to head
            
            for(int i = 0; i<index-1; i++)   //Loops through until it lands on the index that is to be changed
            {            
               current = current.getNext();
            }
            
            LinkedListNode newLLN = new LinkedListNode(value);   //Creates a new node
            newLLN.setNext(current.getNext());   //Sets the new node before current
            current.setNext(newLLN);   //Current is now the new node
            
            numberOfItems++;   //Adds 1
         }
      }
   }
   
   public boolean delete(int value)   //A method that deletes the indicated value
   {
      System.out.println("Deleting "+value);
      
      if(head == null)   //If head is null, it returns false
      {
         return false;
      }
      
      if(head.getData() == value)
      {
         head = head.getNext();   //Makes head the next one in the list
         
         numberOfItems--;   //Subtracts 1
         return true;
      }
      
      LinkedListNode current = head.getNext();   //Creates a new node equal to the node after head
      LinkedListNode prev = head;   //Creates a new node
      
      while(current != null && current.getData()!= value)   //Loops through while current is not equal to null and current is not equal to value
      {
         prev = prev.getNext();   //prev equals the next in the list
         current = current.getNext();   //current equals the next in the list
      }
      
      if(current!= null)
      {
         prev.setNext(current.getNext());   //Sets current after prev
         
         numberOfItems--;   //Subtracts 1
         return true;
      }
      return false;
   }
   
   public boolean deleteAtIndex(int index)   //A method that deletes the value at a particular index
   {
      System.out.println("Deleting at place "+index);

      if(index >= numberOfItems || index < 0)   //If the index is greater than the number of items, it does nothing
      {
         return false;
      }
      else
      {         
         if(index == 0)
         {
            head = head.getNext();   //Head is equal to the next node
            head.setNext(head.getNext());   //Head sets its next
            
            numberOfItems--;   //Subtracts 1
            return true;
         }
         else
         {
            LinkedListNode prev = head;   //Prev is equal to head
            
            for(int i=0; i<index-1; i++)   //Loops through until it hits the index's position-1
            {            
               prev = prev.getNext();   //prev is now equal to its next
            }         
            prev.setNext(prev.getNext().getNext());   //prev sets its next to its next next position
            
            numberOfItems--;   //Subtracts 1
            return true;
         }
      }
   }
   
   public void deleteAll(int value)   //Deletes all of a particular value from the list
   {
      System.out.println("Deleting all "+value+"s");
      
      while(head != null && head.getData() == value)   //Loops through
      {
         head = head.getNext();   //Head is changed to its next
         numberOfItems--;   //Subtracts 1
      }

      if(head == null)   //Does nothing if head is null
      {
         return;
      }

      LinkedListNode current = head;
      
      while(current.getNext() != null)   //Loops through
      {
         if(current.getNext().getData() == value)   //If currents next value is equal to the value given, this block of code is executed
         {
            current.setNext(current.getNext().getNext());   //current sets its next to its next next in the list
            numberOfItems--;   //Subtracts 1
         }
         else
         {
            current = current.getNext();   //current become sthe next one in the list
         }
      }
   }
   
   public void findLastIndex(int value)   //A method that finds the last index of a particular value
   {
      int index = -1;
      int numberOfIndexes = 0;
      LinkedListNode current = head;
      
      if(current == null)   //If head is null, it returns -1
      {
         index = -1;
      }
      
      for(int i = 0; i<numberOfItems; i++)   //Loops through the list
      {
         if(current.getData() == value)   //If the value of current equals the value, this block is executed
         {
            index = numberOfIndexes;   //index becomes equal to the numberOfIndexes
         }
         numberOfIndexes++;   //Adds 1
         current = current.getNext();   //current equals the next one in the list
      }

      System.out.println("Finding the last index of "+value+": "+index);
   }
   
   public String toString()   //Structures the list that is printed out
   {
      String toReturn = "Printing the list:";
      LinkedListNode current = head;
      
      while(current!= null)   //Loops through the list and prints it out
      {
         toReturn = toReturn+" " +current.getData();
         current = current.getNext();
      }
      return toReturn;
   }
   
   public static void main(String[] args)
   {
      //Creating a list
      LinkedList linklist = new LinkedList();
      
      //Printing out the length
      System.out.println("Length of list: "+linklist.getNumberOfItems());
      
      //inserting a value
      linklist.insert(5);
      System.out.println(linklist);
      linklist.insert(4);
      System.out.println(linklist);
      linklist.insert(3);
      System.out.println(linklist);
      linklist.insert(2);
      System.out.println(linklist);
      linklist.insert(1);
      System.out.println(linklist);
      linklist.insert(5);
      System.out.println(linklist);
      linklist.insert(4);
      System.out.println(linklist);
      linklist.insert(3);
      System.out.println(linklist);
      linklist.insert(2);
      System.out.println(linklist);
      linklist.insert(1);
      System.out.println(linklist);
      
      //Deleting a value
      linklist.delete(1);
      System.out.println(linklist);
      linklist.delete(1);
      System.out.println(linklist);
      linklist.delete(1);
      System.out.println(linklist);
      
      //Inserting a certain index
      linklist.insertAtIndex(10, 3);
      System.out.println(linklist);
      linklist.insertAtIndex(10, -1);
      System.out.println(linklist);
      
      //Deleting at a certain index
      linklist.deleteAtIndex(3);
      System.out.println(linklist);
      linklist.deleteAtIndex(0);
      System.out.println(linklist);
      linklist.deleteAtIndex(7);
      System.out.println(linklist);
      
      //Inserting at a certain index
      linklist.insertAtIndex(10, 0);
      System.out.println(linklist);
      linklist.insertAtIndex(10, 10);
      System.out.println(linklist);
      
      //Deleting at a certain index
      linklist.deleteAtIndex(8);
      System.out.println(linklist);
      linklist.deleteAtIndex(8);
      System.out.println(linklist);
      
      //Printing out the length
      System.out.println("Length of list: "+linklist.getNumberOfItems());
      System.out.println();
      
      //Inserting a value
      linklist.insert(2);
      System.out.println(linklist);
      
      //Deleting all of a certain value
      linklist.deleteAll(2);
      System.out.println(linklist);
      
      //Finding the last index of a value
      linklist.findLastIndex(4);
      
      //Deleting all of a certain value
      linklist.deleteAll(4);
      System.out.println(linklist);
      
      //Inserting a value
      linklist.insert(5);
      System.out.println(linklist);
      
      //Deleting all of a certain value
      linklist.deleteAll(5);
      System.out.println(linklist);
      
      //Finding the last index of a value
      linklist.findLastIndex(3);
      linklist.findLastIndex(1);
      
      //Inserting a value
      linklist.insert(6);
      System.out.println(linklist);
      
      //Finding the last index of a value
      linklist.findLastIndex(6);
      
      System.out.println();
      
      LinkedList cool = new LinkedList();
      
      cool.deleteAtIndex(0);
      System.out.println(cool);
      
      cool.insertAtIndex(-1, -1);
      System.out.println(cool);
      
      cool.insert(2);
      cool.insert(2);
      cool.findLastIndex(2);
      cool.deleteAll(2);
      
      System.out.println(cool);
   }
}