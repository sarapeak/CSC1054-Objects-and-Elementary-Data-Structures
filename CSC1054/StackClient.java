import java.util.*;
import java.text.*;
import java.io.*;

public class StackClient
{
   public static void main(String[] args)
   {
      IntStack theStack = new IntStack();   //Creates an IntStack
      
      //Pushes the indicated number to the front of the stack
      theStack.push(1);
      theStack.push(2);
      theStack.push(3);
      theStack.push(4);
      theStack.push(5);
      theStack.push(6);
      theStack.push(7);
      theStack.push(8);
      theStack.push(9);
      theStack.push(10);
      
      System.out.println(theStack);   //Prints out the stack
      
      System.out.println();   //Makes a space between the cases
      
      //Pops the stack
      theStack.pop();
      theStack.pop();
      theStack.pop();
      theStack.pop();
      theStack.pop();
      
      System.out.println(theStack);   //Prints out the stack
      
      System.out.println();   //Makes a space between the cases
      
      IntStack anotherStack = new IntStack();   //Creates another IntStack
      
      System.out.println(anotherStack);   //Prints out the stack
      System.out.println();
      
      anotherStack.peek();   //Peeks the stack
      anotherStack.pop();   //Pops the stack
      
      //Pushes the indicated number to the front of the stack 
      anotherStack.push(3);
      anotherStack.push(6);
      anotherStack.push(9);
      anotherStack.push(12);
      anotherStack.push(15);
      anotherStack.push(18);
      anotherStack.push(21);
      anotherStack.push(24);
      anotherStack.push(27);
      anotherStack.push(30);
      
      System.out.println(anotherStack);   //Prints out the stack
      System.out.println();
      
      //Pops the stack
      anotherStack.pop();
      anotherStack.pop();
      anotherStack.pop();
      
      System.out.println(anotherStack);   //Prints out the stack
      System.out.println();
      
      //Pops the stack
      anotherStack.pop();
      anotherStack.pop();
      anotherStack.pop();
      anotherStack.pop();
      anotherStack.pop();
      anotherStack.pop();
      
      System.out.println(anotherStack);   //Prints out the stack
   }
}