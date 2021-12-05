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

public class Lab6PartIII extends Application
{
   Button [][] buttons = new Button[4][4];
   BorderPane bp = new BorderPane();
   FlowPane cyan = new FlowPane();
   int counter = 0;
   
   //Part 3: Creating a Minigame
   public void start(Stage stage)
   {
      cyan.setAlignment(Pos.TOP_LEFT);   //Setting the alignment to the top left position
      
      //Creating a label for the opening text and cyan background
      Label cyanText = new Label("Welcome to the Game!");
      cyanText.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
      cyan.getChildren().add(cyanText);
                  
      //Creates the rest of the cyan color on the top
      for(int c = 0; c<113; c++)
      {
         Label cyanColor = new Label(" ");
         cyanColor.setTextFill(Color.CYAN);
         cyanColor.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
         cyan.getChildren().add(cyanColor);
      }
      
      FlowPane button = new FlowPane();   //A new FlowPane for the buttons
      button.setAlignment(Pos.CENTER);   //Sets the buttons in the center position
      
      //Sets the size and preference of the buttons and makes them visible
      for(int row = 0; row<4; row++)
      {
         for(int col = 0; col<4; col++)
         {
            buttons[row][col] = new Button();
            buttons[row][col].setPrefSize(100,100);
            buttons[row][col].setVisible(true);
         }
      }
      
      //Adds the buttons to the flowpane
      for(int row = 0; row<4; row++)
      {
         for(int col = 0; col<4; col++)
         {
            button.getChildren().add(buttons[row][col]);
         }
      }
      
      //Creates a vbox in the top left position
      VBox v = new VBox();
      v.setAlignment(Pos.TOP_LEFT);
      
      //Creates a space starting from the left side to center the buttons
      for(int i = 0; i<20; i++)
      {
         Label space = new Label(" ");
         v.getChildren().add(space);
      }
      
      //Adds the components to the borderpane
      bp.setTop(cyan);
      bp.setCenter(button);
      bp.setLeft(v);
      
      Scene scene = new Scene(bp, 500, 500);
      stage.setScene(scene);
      stage.setTitle("Lab6");
      stage.show();
      
      //Setting the buttons on and directing it to the ButtonListener
      for(int row = 0; row<4; row++)
      {
         for(int col = 0; col<4; col++)
         {
            buttons[row][col].setOnAction(new ButtonListener());
         }
      }
   }
   
   //The ButtonListener event handler
   public class ButtonListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {         
         //This section of code goes through each button to determine if it's visibility is false
         for(int row = 0; row<4; row++)
         {
            for(int col = 0; col<4; col++)
            {
               if(buttons[row][col].isVisible() == false)
               {
                  counter++;   //Each time a button's visibility is false, one is added to the counter
                  //If the counter reaches 16, then this line of code is executed
                  if(counter == 16)
                  {
                     bp.getChildren().remove(cyan);   //Removes the cyan flowpane
                     
                     //Creates a new flowpane
                     FlowPane win = new FlowPane();
                     Label winText = new Label("You win!");
                     winText.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
                     win.getChildren().add(winText);
                                 
                     //Creates the extra cyan spaces after the text
                     for(int c = 0; c<136; c++)
                     {
                        Label cyanSpace = new Label(" ");
                        cyanSpace.setTextFill(Color.CYAN);
                        cyanSpace.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
                        win.getChildren().add(cyanSpace);
                     }
                     
                     bp.setTop(win);   //Adds win to the borderpane
                  }
               }
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[0][0])
         {
            if(buttons[0][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][0].setVisible(true);
            }
           
            if(buttons[0][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][1].setVisible(true);
            }
           
            if(buttons[1][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][0].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[0][1])
         {
            if(buttons[0][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][1].setVisible(true);
            }
            
            if(buttons[1][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][1].setVisible(true);
            }
            if(buttons[0][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][0].setVisible(true);
            }
            
            if(buttons[0][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][2].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[0][2])
         {
            if(buttons[0][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][2].setVisible(true);
            }
            
            if(buttons[0][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][1].setVisible(true);
            }
            
            if(buttons[0][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][3].setVisible(true);
            }
            
            if(buttons[1][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][2].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[0][3])
         {
            if(buttons[0][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][3].setVisible(true);
            }
            
            if(buttons[0][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][2].setVisible(true);
            }
            
            if(buttons[1][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][3].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[1][0])
         {
            if(buttons[1][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][0].setVisible(true);
            }

            if(buttons[0][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][0].setVisible(true);
            }
            
            if(buttons[1][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][1].setVisible(true);
            }
            
            if(buttons[2][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][0].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[1][1])
         {
            if(buttons[1][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][1].setVisible(true);
            }
            
            if(buttons[0][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][1].setVisible(true);
            }
            
            if(buttons[1][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][0].setVisible(true);
            }
            
            if(buttons[1][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][2].setVisible(true);
            }
            
            if(buttons[2][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][1].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[1][2])
         {
            if(buttons[1][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][2].setVisible(true);
            }
            
            if(buttons[0][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][2].setVisible(true);
            }
            
            if(buttons[1][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][1].setVisible(true);
            }
            
            if(buttons[1][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][3].setVisible(true);
            }
            
            if(buttons[2][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][2].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[1][3])
         {
            if(buttons[1][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][3].setVisible(true);
            }
            
            if(buttons[1][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][2].setVisible(true);
            }
            
            if(buttons[0][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[0][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[0][3].setVisible(true);
            }
            
            if(buttons[2][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][3].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[2][0])
         {
            if(buttons[2][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][0].setVisible(true);
            }
            
            if(buttons[1][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][0].setVisible(true);
            }
            
            if(buttons[2][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][1].setVisible(true);
            }
            
            if(buttons[3][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][0].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[2][1])
         {
            if(buttons[2][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][1].setVisible(true);
            }
            
            if(buttons[2][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][0].setVisible(true);
            }
            
            if(buttons[2][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][2].setVisible(true);
            }
            
            if(buttons[1][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][1].setVisible(true);
            }
            
            if(buttons[3][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][1].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[2][2])
         {
            if(buttons[2][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][2].setVisible(true);
            }
            
            if(buttons[2][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][3].setVisible(true);
            }
            
            if(buttons[2][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][1].setVisible(true);
            }
            
            if(buttons[1][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][2].setVisible(true);
            }
            
            if(buttons[3][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][2].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[2][3])
         {
            if(buttons[2][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][3].setVisible(true);
            }
            
            if(buttons[2][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][2].setVisible(true);
            }
            
            if(buttons[1][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[1][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[1][3].setVisible(true);
            }
            
            if(buttons[3][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][3].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[3][0])
         {
            if(buttons[3][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][0].setVisible(true);
            }
            
            if(buttons[2][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][0].setVisible(true);
            }
            
            if(buttons[3][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][1].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[3][1])
         {
            if(buttons[3][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][1].setVisible(true);
            }
            
            if(buttons[3][0].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][0].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][0].setVisible(true);
            }
            
            if(buttons[3][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][2].setVisible(true);
            }
            
            if(buttons[2][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][1].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[3][2])
         {
            if(buttons[3][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][2].setVisible(true);
            }
            
            if(buttons[3][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][3].setVisible(true);
            }
            
            if(buttons[3][1].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][1].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][1].setVisible(true);
            }
            
            if(buttons[2][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][2].setVisible(true);
            }
         }
         
         //Checks each button to see if it has been clicked and the visibility
         if(e.getSource() == buttons[3][3])
         {
            if(buttons[3][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][3].setVisible(true);
            }
            
            if(buttons[3][2].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[3][2].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[3][2].setVisible(true);
            }
            
            if(buttons[2][3].isVisible() == true)   //If the button is visible, it makes it invisible
            {
               buttons[2][3].setVisible(false);
            }
            else   //If the button is already invisible, then it makes it visible
            {
               buttons[2][3].setVisible(true);
            }
         }
      }
   }
      
   public static void main(String[] args)
   {
      launch(args);   //Launches the program
   }
}