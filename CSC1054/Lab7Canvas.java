import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.animation.*;
import java.util.*;
import java.net.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.stage.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import java.util.*;


public class Lab7Canvas extends Canvas
{
   Lab7Level level;
   
   //Starting position for the player
   private int x = 75;
   private int y = 75;
   
   GraphicsContext gc = getGraphicsContext2D();

   public Lab7Canvas(String firstLevel)
   {
      setOnKeyPressed(new KeyListener());   //detects if a key is pressed
      
      setWidth(9*50);
      setHeight(9*50);
      
      level = new Lab7Level(firstLevel);
      
      draw(gc);

   }
   
   public void draw(GraphicsContext gc)
   {
      gc.clearRect(0,0,450,450);   //clears the area
      
      gc.setFill(Color.BLACK);
      gc.fillRect(0,0,450,450);
      
      for(int i=0;i<9;i++)
      {
         for(int j=0;j<9;j++)
         {
            int k = level.getData(j,i);
            if(k == 1)
            {
               gc.setFill(Color.BLACK);   //Creates the black border
               gc.fillRect(j*50,i*50,50,50);
            }
            else if(k == 0)
            {
               gc.setFill(Color.CYAN);   //Creates the cyan insides
               gc.fillRect(j*50,i*50,50,50);
            }
         }
      }
      
      //Creates the player's green box
      gc.setFill(Color.GREEN);
      gc.fillRect(x, y, 50, 50);
   }
   
   public class KeyListener implements EventHandler<KeyEvent>
   {
      public void handle(KeyEvent event)
      {
         if(event.getCode() == KeyCode.UP)   //Keyboard for the up key
         {
            if(level.getNextFileName(0).equals("NONE") && y<25)   //Checks for the value of direction 0 and y<25
            {
               y = 25;   //sets y to 25
            }
            else if(!level.getNextFileName(0).equals("NONE") && y<25)   //Same as above, but instead looks for anything except NONE
            {
               level = new Lab7Level(level.getNextFileName(0));   //gets the filename
               y = 425;   //sets y to 425
               y = y-1;
            }
            else   //if no conditions are met, y is decreased by 1
            {
               y = y-1;
            }
            
            draw(gc);   //calls on the draw method
         }
         
         if(event.getCode() == KeyCode.DOWN)   //Keyboard for the down key
         {
            if(level.getNextFileName(2).equals("NONE") && y>425)   //Checks for the value of direction 2 and y>425
            {
               y = 425;   //sets y to 425
            }
            else if(!level.getNextFileName(2).equals("NONE") && y>425)   //Same as above, but instead looks for anything except NONE
            {
               level = new Lab7Level(level.getNextFileName(2));   //gets the filename
               y = 25;   //sets y to 25
               y = y+1;
            }
            else   //if no conditions are met, y is increased by 1
            {
               y = y+1;
            }
            
            draw(gc);   //calls on the draw method
         }
         
         if(event.getCode() == KeyCode.LEFT)   //Keyboard for the left key
         {
            if(level.getNextFileName(1).equals("NONE") && x<25)   //checks for the value of direction 1 and x<25
            {
               x = 25;   //sets x to 25
            }
            else if(!level.getNextFileName(1).equals("NONE") && x<25)   //same as above, but instead looks for anything except NONE
            {
               level = new Lab7Level(level.getNextFileName(1));   //gets the filename
               x = 425;   //sets x to 425
               x = x-1;
            }
            else   //if no conditions are met, x is decreased by 1
            {
               x = x-1;
            }
            
            draw(gc);   //calls on the draw method
         }
         
         if(event.getCode() == KeyCode.RIGHT)   //Keyboard for the right key
         {
            if(level.getNextFileName(3).equals("NONE") && x>425)   //checks for the value of direction 3 and x>425
            {
               x = 425;   //sets x to 425
            }
            else if(!level.getNextFileName(3).equals("NONE") && x>425)   //same as above, but instead looks for anything except NONE
            {
               level = new Lab7Level(level.getNextFileName(3));   //gets the filename
               x = 25;   //sets x to 25
               x = x+1;
            }
            else   //if no conditions are met, x is increased by 1
            {
               x = x+1;
            }
            
            draw(gc);   //calls on the draw method
         }
      }
   }
}