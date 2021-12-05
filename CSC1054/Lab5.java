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

public class Lab5 extends Application
{
  //Part 1: Create a yellow and green checker board
  public void start(Stage stage)
  {
      FlowPane root = new FlowPane();   //Makes a flowpane
      
      //A for loop that adds 42 colored squares to the window
      for(int i=0;i<42;i++)
      {
         if(i%2 == 0)   //If i leaves a remainder of 0, then it makes the color of the square green
         {
            root.getChildren().add(new CheckerBoardSlot(Color.GREEN));
         }
         else   //If i does not leave a remainder of 0, then it makes the color of the square yellow
         {
            root.getChildren().add(new CheckerBoardSlot(Color.YELLOW));
         }
      }
         
      Scene scene = new Scene(root, 700, 600);   //The window is 700x600
      stage.setScene(scene);
      stage.setTitle("Lab5");
      stage.show();
   }
      
   public static void main(String[] args)
   {
      launch(args);
   }
}