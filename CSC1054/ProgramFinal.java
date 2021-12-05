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

public class ProgramFinal extends Application
{
   BorderPane bp = new BorderPane();
   FlowPane root = new FlowPane();
   HBox hboxCoins = new HBox();
   Label coins;
   
   Canvas circles = new Canvas(400, 300);
   GraphicsContext gc = circles.getGraphicsContext2D();   //Allows me to use graphics
   
   //The radio buttons
   RadioButton coin1 = new RadioButton("1 Coin");
   RadioButton coin2 = new RadioButton("2 Coin");
   RadioButton coin3 = new RadioButton("3 Coin");
   RadioButton coin4 = new RadioButton("4 Coin");
   
   Button addCoins = new Button("Add Coins");   //The button
   
   //Places for the circles
   int x = 10;
   int y = 50;
   int change = 0;
   int amountOfCoins = 15;
   
   //The counters for AI and player
   int counterMe = 0;
   int counterAI = 0;
   
   //decides who wins
   int decider = 0;
   
   public void start(Stage stage)
   {  
      hboxCoins.setAlignment(Pos.TOP_CENTER);   //Sets hbox to top center
      
      coins = new Label("My coins: "+counterMe+" Opponent coins: "+counterAI);
      hboxCoins.getChildren().add(coins);
      
      root.setAlignment(Pos.CENTER);   //sets root to the center
      
      ToggleGroup group = new ToggleGroup();   //creates a new group
      
      //Turns on toggle for radio buttons and sets them into a new group and then adds them to root
      coin1.setToggleGroup(group);
      coin1.setOnAction(new ComponentListener());
      root.getChildren().add(coin1);
      
      Label space1 = new Label(" ");
      root.getChildren().add(space1);
      
      coin2.setToggleGroup(group);
      coin2.setOnAction(new ComponentListener());
      root.getChildren().add(coin2);
      
      Label space2 = new Label(" ");
      root.getChildren().add(space2);
      
      coin3.setToggleGroup(group);
      coin3.setOnAction(new ComponentListener());
      root.getChildren().add(coin3);
      
      Label space3 = new Label(" ");
      root.getChildren().add(space3);
      
      coin4.setToggleGroup(group);
      coin4.setOnAction(new ComponentListener());
      root.getChildren().add(coin4);
      
      Label newLine2 = new Label("                        ");
      root.getChildren().add(newLine2);
      
      //Adds button to the root
      addCoins.setPrefSize(90,20);
      addCoins.setVisible(true);   //visibility is true
      root.getChildren().add(addCoins);
      
      //Creates the circles, or coins
      for(int i = 0; i<amountOfCoins; i++)
      {
         gc.strokeOval(x+change, y, 10, 10);
         gc.fillOval(x+change, y, 10, 10);
         change += 20;
      }
      
      root.getChildren().add(circles);   //adds the circles to the root
      
      bp.setCenter(root);   //sets the root to the center of the borderpane
      bp.setTop(hboxCoins);   //sets the hbox to the top
      
      //creates the window pop up
      Scene scene = new Scene(bp, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Final Program");
      stage.show();
      
      addCoins.setOnAction(new ComponentListener());   //sets the button to on action
   }
   
   public class ComponentListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
         if(e.getSource() == addCoins)   //looks for when the button is pressed
         {
            if(coin1.isSelected())   //if coin2 is selected
            {
               //removes all circles
               root.getChildren().remove(circles);
               gc.clearRect(0, 0, 400, 300);
               
               change = 0;
               amountOfCoins = amountOfCoins-1;   //takes 1 away from the amountofcoins
               
               //creates and adds the coins to the root
               for(int i = 0; i<amountOfCoins; i++)
               {
                  gc.strokeOval(x+change, y, 10, 10);
                  gc.fillOval(x+change, y, 10, 10);
                  change += 20;
               }
               root.getChildren().add(circles);
               counterMe = counterMe+1;   //adds 1 to counterMe
               
               //updates the coins label
               hboxCoins.getChildren().remove(coins);
               coins = new Label("My coins: "+counterMe+" Opponent coins: "+counterAI);
               hboxCoins.getChildren().add(coins);
               
               decider = 0;
            }
            else if(coin2.isSelected())   //if coin2 is selected
            {
               //removes the circles
               root.getChildren().remove(circles);
               gc.clearRect(0, 0, 400, 300);
               
               change = 0;
               amountOfCoins = amountOfCoins-2;   //takes 2 away from amountofcoins
               
               //creates and adds the circles
               for(int i = 0; i<amountOfCoins; i++)
               {
                  gc.strokeOval(x+change, y, 10, 10);
                  gc.fillOval(x+change, y, 10, 10);
                  change += 20;
               }
               root.getChildren().add(circles);
               counterMe = counterMe+2;   //adds 2 to counterme
               
               //updates the label
               hboxCoins.getChildren().remove(coins);
               coins = new Label("My coins: "+counterMe+" Opponent coins: "+counterAI);
               hboxCoins.getChildren().add(coins);
               
               decider = 0;
            }
            else if(coin3.isSelected())   //if coin3 is selected
            {
               //removes the circles
               root.getChildren().remove(circles);
               gc.clearRect(0, 0, 400, 300);
               
               change = 0;
               amountOfCoins = amountOfCoins-3;   //takes 3 away from amountofcoins
               
               //creates and adds the circles
               for(int i = 0; i<amountOfCoins; i++)
               {
                  gc.strokeOval(x+change, y, 10, 10);
                  gc.fillOval(x+change, y, 10, 10);
                  change += 20;
               }
               root.getChildren().add(circles);
               counterMe = counterMe+3;   //adds 3 to counterme
               
               //updates the label
               hboxCoins.getChildren().remove(coins);
               coins = new Label("My coins: "+counterMe+" Opponent coins: "+counterAI);
               hboxCoins.getChildren().add(coins);
               
               decider = 0;
            }
            else if(coin4.isSelected())   //if coin4 is selected
            {
               //removes the circles
               root.getChildren().remove(circles);
               gc.clearRect(0, 0, 400, 300);
               
               change = 0;
               amountOfCoins = amountOfCoins-4;   //takes 4 away from amount of coins
               
               //creates and adds circles
               for(int i = 0; i<amountOfCoins; i++)
               {
                  gc.strokeOval(x+change, y, 10, 10);
                  gc.fillOval(x+change, y, 10, 10);
                  change += 20;
               }
               root.getChildren().add(circles);
               counterMe = counterMe+4;   //adds 4 to counterme
               
               //updates the label
               hboxCoins.getChildren().remove(coins);
               coins = new Label("My coins: "+counterMe+" Opponent coins: "+counterAI);
               hboxCoins.getChildren().add(coins);
               
               decider = 0;
            }
            
            if(amountOfCoins > 0)
            {
               //removes the circles
               root.getChildren().remove(circles);
               gc.clearRect(0, 0, 400, 300);
                     
               change = 0;
               amountOfCoins = amountOfCoins-1;   //takes 1 away from amountofcoins
                    
               //creates and adds the circles
               for(int i = 0; i<amountOfCoins; i++)
               {
                  gc.strokeOval(x+change, y, 10, 10);
                  gc.fillOval(x+change, y, 10, 10);
                  change += 20;
               }      
               root.getChildren().add(circles);
               counterAI = counterAI+1;   //adds 1 to counterai
               
               //updates the label
               hboxCoins.getChildren().remove(coins);
               coins = new Label("My coins: "+counterMe+" Opponent coins: "+counterAI);
               hboxCoins.getChildren().add(coins);
               
               decider = -1;
            }
         }
         //decides who loses
         if(amountOfCoins == 0)
         {
            if(decider == 0)   //if decider is 0
            {
               root.getChildren().remove(addCoins);   //removes the button
               
               hboxCoins.getChildren().remove(coins);   //removes the label
               coins = new Label("You lose! You took the last coin!");   //updates label
               hboxCoins.getChildren().add(coins);   //adds the label
            }
            else if(decider == -1)   //if decider is -1
            {
               root.getChildren().remove(addCoins);   //removes the buton
               
               hboxCoins.getChildren().remove(coins);   //removes the label
               coins = new Label("AI loses! It took the last coin!");   //updates label
               hboxCoins.getChildren().add(coins);   //adds the label
            }
         }
      }
   }
   
   public static void main(String[] args)   //launches the program
   {
      launch(args);
   }
}