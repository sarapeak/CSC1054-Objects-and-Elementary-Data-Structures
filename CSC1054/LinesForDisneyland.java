import java.util.LinkedList;
import java.util.Queue;
import java.text.*;
import java.io.*;

public class LinesForDisneyland
{
   LinkedListNode head = null;
   LinkedListNode tail = null;
   
   //Counters
   private int counterOne = 0;
   private int counterTwo = 0;
   
   public LinesForDisneyland()   //A empty constructor
   {
      
   }
   
   public void enqueueNormal(PersonInLine person)   //A Queue for the normal line
   {
      normal.add(person);   //Adds person to normal
   }  
   
   public void enqueueFastTrack(PersonInLine person)   //A Queue for the fasttrack line
   {
      fastTrack.add(person);   //Adds person to fasttrack
   }
   
   public void dequeue()   //A method that deletes something from a queue
   {
      if(counterOne%2 == 0)   //If counterOne when %2 and it returns 0, then it executes this code block
      {
         if(normal.peek() != null)
         {
            normal.remove();   //Removes a normal
            counterOne++;   //Adds one to counterOne
         }
         else if(fastTrack.peek() != null)
         {
            fastTrack.remove();   //Removes a fasttrack
            counterOne++;   //Adds one to counterOne
         }
         else
         {
            System.out.println("No one is in this line!");   //Prints this out if there is no one in a line
         }
      }
      else
      {
         if(fastTrack.peek() != null)
         {
            fastTrack.remove();   //Removes a fasttrack
            counterOne++;   //Adds one to counterOne
         }
         else if(normal.peek() != null)
         {
            normal.remove();   //Removes a normal
            counterOne++;   //Adds one to counterOne
         }
         else
         {
            System.out.println("No one is in this line!");
         }
      }
   }   

   public void peek()   //A method that returns something from the front of a stack
   {
      if(normal.peek() == null && fastTrack.peek() == null)   //If both normal and fasttrack are null, then it prints this out
      {
         System.out.println("Both the Normal line and the FastTrack line are empty!");
      }
      else if(normal.peek() != null && fastTrack.peek() != null)   //If both normal and fasttrack are not null, then this is executed
      {
         if(counterTwo%2 == 0)   //If the counterTwo becomes equal to 0, this becomes executed
         {
            System.out.println(normal.peek());   //Prints out the normal.peek()
            counterTwo++;   //Adds one to counterTwo
         }
         else if(counterTwo%2 != 0)   //If not equal to 0
         {
            System.out.println(fastTrack.peek());   //Prints out fastTrack.prrk()
            counterTwo++;   //Adds one to counterTwo
         }
      }
      else if(normal.peek() != null && fastTrack.peek() == null)   //If only fasttrack is null and normal is not
      {
         System.out.println(normal.peek());   //Prints out normal.peek()
         counterTwo++;   //Adds one to counterTwo
      }
      else if(normal.peek() == null && fastTrack.peek() != null)   //If only normal is null and fasttrack is not
      {
         System.out.println(fastTrack.peek());   //Prints out fastTrack.peek()
         counterTwo++;   //Adds one to counterTwo
      }
   }
   
   public boolean isEmpty()   //A method that checks if the stack is empty
   {
      if(normal.peek() == null && fastTrack.peek() == null)   //If both normal and fastTrack are null it returns true
      {
         return true;
      }
      else
      {
         return false;   //Returns false
      }
   }
   
   //Creates a Queue in a linked list
   Queue<PersonInLine> normal = new LinkedList<>();
   Queue<PersonInLine> fastTrack = new LinkedList<>();
   
   public static void main(String[] args)
   {
      LinesForDisneyland line = new LinesForDisneyland();   //Makes a line
      
      PersonInLine normalPerson1 = new PersonInLine("Normal1", 1);   //Creates a type of person in PersonInLine
      line.enqueueNormal(normalPerson1);   //Enqueues normal to the queue
      
      PersonInLine normalPerson2 = new PersonInLine("Normal2", 2);   //Creates a type of person in PersonInLine
      line.enqueueNormal(normalPerson2);   //Enqueues normal to the queue
      
      line.peek();   //Peeks the queue
      line.dequeue();   //Dequeues the queue
      
      PersonInLine fastPerson1 = new PersonInLine("Fast1", 1);   //Creates a type of person in PersonInLine
      line.enqueueFastTrack(fastPerson1);   //Adds normal to the queue
      
      line.peek();   //Peeks the queue
      line.dequeue();   //Dequeues the queue
      
      //Creates a person and adds it to a specific line
      PersonInLine normalPerson3 = new PersonInLine("Normal3", 3);
      line.enqueueNormal(normalPerson3);
      
      PersonInLine normalPerson4 = new PersonInLine("Normal4", 4);
      line.enqueueNormal(normalPerson4);
      
      PersonInLine normalPerson5 = new PersonInLine("Normal5", 5);
      line.enqueueNormal(normalPerson5);
      
      PersonInLine normalPerson6 = new PersonInLine("Normal6", 6);
      line.enqueueNormal(normalPerson6);
      
      PersonInLine normalPerson7 = new PersonInLine("Normal7", 7);
      line.enqueueNormal(normalPerson7);
      
      PersonInLine normalPerson8 = new PersonInLine("Normal8", 8);
      line.enqueueNormal(normalPerson8);
      
      PersonInLine normalPerson9 = new PersonInLine("Normal9", 9);
      line.enqueueNormal(normalPerson9);
      
      PersonInLine normalPerson10 = new PersonInLine("Normal10", 10);
      line.enqueueNormal(normalPerson10);
      
      PersonInLine normalPerson11 = new PersonInLine("Normal11", 11);
      line.enqueueNormal(normalPerson11);
      
      PersonInLine normalPerson12 = new PersonInLine("Normal12", 12);
      line.enqueueNormal(normalPerson12);
      
      PersonInLine normalPerson13 = new PersonInLine("Normal13", 13);
      line.enqueueNormal(normalPerson13);
      
      PersonInLine normalPerson14 = new PersonInLine("Normal14", 14);
      line.enqueueNormal(normalPerson14);
      
      PersonInLine normalPerson15 = new PersonInLine("Normal15", 15);
      line.enqueueNormal(normalPerson15);
      
      PersonInLine normalPerson16 = new PersonInLine("Normal16", 16);
      line.enqueueNormal(normalPerson16);
      
      PersonInLine normalPerson17 = new PersonInLine("Normal17", 17);
      line.enqueueNormal(normalPerson17);
      
      PersonInLine normalPerson18 = new PersonInLine("Normal18", 18);
      line.enqueueNormal(normalPerson18);
      
      PersonInLine normalPerson19 = new PersonInLine("Normal19", 19);
      line.enqueueNormal(normalPerson19);
      
      PersonInLine normalPerson20 = new PersonInLine("Normal20", 20);
      line.enqueueNormal(normalPerson20);
      
      PersonInLine normalPerson21 = new PersonInLine("Normal21", 21);
      line.enqueueNormal(normalPerson21);
      
      PersonInLine normalPerson22 = new PersonInLine("Normal22", 22);
      line.enqueueNormal(normalPerson22);
      
      PersonInLine fastPerson2 = new PersonInLine("Fast2", 2);
      line.enqueueFastTrack(fastPerson2);
      
      PersonInLine fastPerson3 = new PersonInLine("Fast3", 3);
      line.enqueueFastTrack(fastPerson3);
      
      PersonInLine fastPerson4 = new PersonInLine("Fast4", 4);
      line.enqueueFastTrack(fastPerson4);
      
      PersonInLine fastPerson5 = new PersonInLine("Fast5", 5);
      line.enqueueFastTrack(fastPerson5);
      
      PersonInLine fastPerson6 = new PersonInLine("Fast6", 6);
      line.enqueueFastTrack(fastPerson6);
      
      //Goes though the entire queue until it is true that the Queue is empty
      while(!line.isEmpty())
      {
         line.peek();   //Peeks the queue
         line.dequeue();   //Dequeues the queue
      }
      line.dequeue();   //Dequeues the queue
      
      System.out.println();   //Creates a space between the cases

      LinesForDisneyland line2 = new LinesForDisneyland();   //Creates a new line

      line2.dequeue();   //dequeues the queue
      line2.peek();   //peeks the queue
      
      //Creates a person and adds it to a specific line
      PersonInLine fastPerson7 = new PersonInLine("Fast1",1);
      line2.enqueueFastTrack(fastPerson7);
      
      PersonInLine fastPerson8 = new PersonInLine("Fast2",2);
      line2.enqueueFastTrack(fastPerson8);
      
      PersonInLine fastPerson9 = new PersonInLine("Fast3",3);
      line2.enqueueFastTrack(fastPerson9);
      
      line2.peek();
      line2.dequeue();

      PersonInLine normalPerson23 = new PersonInLine("Normal1",1);
      line2.enqueueNormal(normalPerson23);
      
      PersonInLine normalPerson24 = new PersonInLine("Normal2",2);
      line2.enqueueNormal(normalPerson24);
      
      PersonInLine normalPerson25 = new PersonInLine("Normal3",3);
      line2.enqueueNormal(normalPerson25);
      
      PersonInLine normalPerson26 = new PersonInLine("Normal4",4);
      line2.enqueueNormal(normalPerson26);
      
      PersonInLine normalPerson27 = new PersonInLine("Normal5",5);
      line2.enqueueNormal(normalPerson27);

      PersonInLine fastPerson10 = new PersonInLine("Fast4",4);
      line2.enqueueFastTrack(fastPerson10);

      PersonInLine fastPerson11 = new PersonInLine("Fast5",5);
      line2.enqueueFastTrack(fastPerson11);

      //Goes though the entire queue until it is true that the Queue is empty
      while(!line2.isEmpty())
      {
         line2.peek();   //Peeks the queue
         line2.dequeue();   //Dequeues the queue
      }
      line2.dequeue();   //Dequeues the queue again
   }
}