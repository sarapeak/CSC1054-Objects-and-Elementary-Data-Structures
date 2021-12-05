import java.util.*;
import java.text.*;
import java.io.*;

public class LinkedListNode
{
   private int data;
   private LinkedListNode next;
   
   public LinkedListNode()   //A constructor
   {
      setData(0);    //Calls on the method setData
      next = null;   //Sets next as null
   }
   
   public LinkedListNode(int data)   //Another constructor
   {
      setData(data);   //Calls on setData
      next = null;
   }
   
   public int getData()   //A method that returns an int data
   {
      return data;
   }
   
   public LinkedListNode getNext()   //A method that gets the next node in the linked list
   {
      return next;
   }
   
   public void setData(int data)   //A method that sets an int data
   {
      this.data = data;
   }
   
   public void setNext(LinkedListNode next)   //A method that sets the next in the linked list
   {
      this.next = next;
   }
}