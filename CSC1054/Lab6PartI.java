import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.geometry.*;
import javafx.animation.*;
import javafx.scene.paint.*;
import javafx.scene.input.*;
import javafx.application.*;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Lab6PartI extends Application
{
   //Part 1: Creating Lines with a Combo Box
   FlowPane root = new FlowPane();
   
   ComboBox boxNumbers = new ComboBox();
   
   Canvas canvasLine = new Canvas(400, 300);
   GraphicsContext gc = canvasLine.getGraphicsContext2D();
   
   //Creating the stage area
   public void start(Stage stage)
   {
      root.setAlignment(Pos.TOP_LEFT);   //Aligning the flowpane to the top left
      
      //Adding diifferent numbers to the combobox boxNumbers
      boxNumbers.getItems().add("10");
      boxNumbers.getItems().add("50");
      boxNumbers.getItems().add("100");
      
      boxNumbers.setOnAction(new ComboBoxListener());   //Setting the combobox on and directing it to the combobox listener
      root.getChildren().add(boxNumbers);   //Adding the combobox to the flowpane
      
      //Adding spaces between the components
      Label space1 = new Label("\n\n");
      root.getChildren().add(space1);
      
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Lab6");
      stage.show();
      
      boxNumbers.getSelectionModel().selectFirst();   //by default showing the first option "10"
   }
   
   //The combobox event handler
   public class ComboBoxListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
         //A switch statement for the different options
         switch((String)boxNumbers.getValue())
         {
            case"10":
               int space = 0;
               
               //Makes sure that anything drawn is cleared
               root.getChildren().remove(canvasLine);
               gc.clearRect(0, 0, 400, 300);
               
               //Creates 10 lines
               for(int i = 0; i<10; i++)
               {
                  gc.strokeLine(0, 10+space, 80, 10+space);
                  space = space+11;
               }
               
               root.getChildren().add(canvasLine);   //Adds what is drawn to the window
               break;
               
            case"50":
               space = 0;
               
               //Makes sure that anything drawns is cleared
               root.getChildren().remove(canvasLine);
               gc.clearRect(0, 0, 400, 300);
               
               //Creates 50 lines
               for(int i = 0; i<50; i++)
               {
                  gc.strokeLine(0, 10+space, 80, 10+space);
                  space = space+3;
               }
               
               root.getChildren().add(canvasLine);   //Adds what is drawn to the window
               break;
               
            case"100":
               space = 0;
               
               //Adds what is drawn to the window
               root.getChildren().remove(canvasLine);
               gc.clearRect(0, 0, 400, 300);
               
               //Creates 100 lines
               for(int i = 0; i<100; i++)
               {
                  gc.strokeLine(0, 10+space, 80, 10+space);
                  space = space+2;
               }
               
               root.getChildren().add(canvasLine);   //Adds what is drawn to the window
               break;
         }
      }
   }
      
   public static void main(String[] args)
   {
      launch(args);   //Launches the program
   }
}