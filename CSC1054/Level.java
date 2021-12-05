import java.util.*;
import java.text.*;
import java.io.*;

public class Level
{
   private String fileName;
   private String name;
   private int xSize = 0;
   private int ySize = 0;
   private int numberOfEntries = 0;
   
   private int [][] mapData;   //A 2D array
   ArrayList<Entry> entryArrayList;   //An ArrayList that looks at Entry
   
   public Level(String filename)   //A constructor that takes in a string for the file
   {
      try
      {
         Scanner fileScan = new Scanner(new File("ExampleFile.txt"));   //Creates a Scanner for the file
         
         ySize = fileScan.nextInt();   //Scans for the y
         xSize = fileScan.nextInt();   //Scans for the x
         
         mapData = new int [xSize][ySize];   //Creates a 2D array
         
         for(int row = 0; row<ySize; row++)   //A double for loop that looks at each individual thing in the file and inputs the information in the 2D array
         {
            for(int col = 0; col<xSize; col++)
            {
               mapData[col][row] = fileScan.nextInt();   //Saves the information in mapData
            }
         }
         numberOfEntries = fileScan.nextInt();   //Scans for numberOfEntries
         
         entryArrayList = new ArrayList<Entry>(numberOfEntries);   //Creates an entryArrayList
         
         for(int i = 0; i<numberOfEntries; i++)   //A for loop that reads the information indicated by the numberOfEntries
         {
            int num1 = fileScan.nextInt();   //Scans for the first int
            int num2 = fileScan.nextInt();   //Scans for the second int
            String string1 = fileScan.next();   //Scans for the string
            Entry entryList = new Entry(num1, num2, string1);   //An Entry constructor that helps put the information found above in an entry object that can then be added to the entryArrayList
            entryArrayList.add(entryList);   //Adds the entryList to the array list
         }
      }
      catch(FileNotFoundException fnfe)   //Catches the file error
      {
         System.out.println("File does not exist!");
      }
   }
   
   public String toString()   //A toString that prints put the information that was found in the constructor
   {
      String toReturn = ySize+" "+xSize+"\n";   //Prints out the ySize and xSize
      for(int row = 0; row<ySize; row++)
      {
         for(int col = 0; col<xSize; col++)
         {
            toReturn += mapData[col][row]+" ";   //Prints out the mapData 2D array informaiton
         }
         toReturn += "\n";
      }
      toReturn += numberOfEntries+"\n";   //Prints out the numberOfEntries
      for(int l = 0; l<numberOfEntries; l++)
      {
         toReturn += entryArrayList.get(l)+"\n";   //Prints out the entryArrayList information
      }
      return toReturn;
   }
}