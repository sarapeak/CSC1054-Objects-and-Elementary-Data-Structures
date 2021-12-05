import java.util.*;
import java.text.*;
import java.io.*;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import java.net.*;

public class Lab5PartIII extends Application
{ 
   //Part 3: Reading and executing paint commands from a file
   Scanner userScan = new Scanner(System.in);
   int result = 0;   //Will be used to continue or break the loop
   
   public void start(Stage stage)
   {
      System.out.println("Please enter the file you want shown");
      do
      {
         String userFileInput = userScan.next();   //Stores what the user entered as userFIleInput
         result = 0;   //Makes result 0 again so the loop is fresh
         //Tries to go through several functions, including making sure what the user entered is a file and the information in that file is correct
         try
         {
            Scanner fileScan = new Scanner(new File(userFileInput));   //Makes a scanner to scan the file
            
            //Scans for the first String and makes sure it is a circle
            String shape1 = fileScan.next();
            if(!(shape1.equals("circle")))
            {
               System.out.println("Error: Incorrect shape in text file. (See the first shape, change to circle)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an int and makes sure it is in the parameters
            int num1Pos1 = fileScan.nextInt();
            if(!(num1Pos1<=600 && num1Pos1>=0))
            {
               System.out.println("Error: Out of range int in text file. (See the first number after circle)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an int and makes sure it is in the parameters
            int num2Pos1 = fileScan.nextInt();
            if(!(num2Pos1<=600 && num2Pos1>=0))
            {
               System.out.println("Error: Out of range int in text file. (See the second number after circle)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an int and makes sure it is in the parameters
            int num3Pos1 = fileScan.nextInt();
            if(!(num3Pos1<=600 && num3Pos1>=0))
            {
               System.out.println("Error: Out of range int in text file. (See the third number after circle)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an float and makes sure it is in the parameters      
            float num1Color1 = fileScan.nextFloat();
            if(!(num1Color1<=1 && num1Color1>=0))
            {
               System.out.println("Error: Out of range float in text file. (See the fourth number after circle)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an float and makes sure it is in the parameters
            float num2Color1 = fileScan.nextFloat();
            if(!(num2Color1<=1 && num2Color1>=0))
            {
               System.out.println("Error: Out of range float in text file. (See the fifth number after circle)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an float and makes sure it is in the parameters
            float num3Color1 = fileScan.nextFloat();
            if(!(num3Color1<=1 && num3Color1>=0))
            {
               System.out.println("Error: Out of range float in text file. (See the sixth number after circle)");
               System.exit(0);   //Exits if true for user to fix
            }
                  
            //Scans for the first String and makes sure it is a square
            String shape2 = fileScan.next();
            if(!(shape2.equals("square")))
            {
               System.out.println("Error: Incorrect shape in text file. (See the second shape, change to square)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an int and makes sure it is in the parameters      
            int num1Pos2 = fileScan.nextInt();
            if(!(num1Pos2<=600 && num1Pos2>=0))
            {
               System.out.println("Error: Out of range int in text file. (See the first number after square)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an int and makes sure it is in the parameters
            int num2Pos2 = fileScan.nextInt();
            if(!(num2Pos2<=600 && num2Pos2>=0))
            {
               System.out.println("Error: Out of range int in text file. (See the second number after square)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an int and makes sure it is in the parameters
            int num3Pos2 = fileScan.nextInt();
            if(!(num3Pos2<=600 && num3Pos2>=0))
            {
               System.out.println("Error: Out of range int in text file. (See the third number after square)");
               System.exit(0);   //Exits if true for user to fix
            }
             
            //Scans for an float and makes sure it is in the parameters     
            float num1Color2 = fileScan.nextFloat();
            if(!(num1Color2<=1 && num1Color2>=0))
            {
               System.out.println("Error: Out of range float in text file. (See the fourth number after square)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an float and makes sure it is in the parameters
            float num2Color2 = fileScan.nextFloat();
            if(!(num2Color2<=1 && num2Color2>=0))
            {
               System.out.println("Error: Out of range float in text file. (See the fifth number after square)");
               System.exit(0);   //Exits if true for user to fix
            }
            
            //Scans for an float and makes sure it is in the parameters
            float num3Color2 = fileScan.nextFloat();
            if(!(num3Color2<=1 && num3Color2>=0))
            {
               System.out.println("Error: Out of range float in text file. (See the sixth number after square)");
               System.exit(0);   //Exits if true for user to fix
            }
             
            //Creates a PaintCanvas object
            PaintCanvas canvasCreated = new PaintCanvas(shape1, num1Pos1, num2Pos1, num3Pos1, num1Color1, num2Color1, num3Color1, shape2, num1Pos2, num2Pos2, num3Pos2, num1Color2, num2Color2, num3Color2);

            FlowPane root = new FlowPane();   //Creates a flowpane
            root.getChildren().add(canvasCreated);
            
            Scene scene = new Scene(root, 600, 600);   //The window is 600x600
            stage.setScene(scene);
            stage.setTitle("Lab5");
            stage.show();        
         }
         catch(FileNotFoundException fnfe)   //Catches if the file is not found or does not exist
         {
            System.out.println("Error: File not found. Please try again...");
            System.out.println();
            System.out.println("Please enter the file you want shown");
            result = 1;   //Makes result equal to 1
         }
      }while(result == 1);   //Continues the loop if result is 1
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }
}