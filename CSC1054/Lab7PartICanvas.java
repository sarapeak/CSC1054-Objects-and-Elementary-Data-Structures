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

public class Lab7PartICanvas extends Canvas
{
   private int lengthOfLoadingBar = 0;
   GraphicsContext gc = getGraphicsContext2D();
   AnimationTimer ac = new AnimationHandler();
   
   public Lab7PartICanvas()
   { 
      setOnKeyPressed(new KeyListener());   //Detects if the key is pressed
      
      //Sets the width and height of the window
      setWidth(800);
      setHeight(200);
      draw(gc);   //Goes to the draw method
      
      ac.start();   //starts the animation
   }
   
   public void draw(GraphicsContext gc)
   {
      gc.clearRect(139, 50, 511, 75);   //Clears the area
      
      //Makes the loading bar
      gc.setFill(Color.WHITE);
      gc.fillRect(142, 53, 505, 69);
      
      gc.setFill(Color.NAVY);
      gc.fillRect(149, 60, 491, 55);
      
      gc.setFill(Color.LIME);
      gc.fillRect(154, 65, lengthOfLoadingBar, 45);
   }
   
   //Where the animation happens
   public class AnimationHandler extends AnimationTimer
   {
      public void handle(long currentTimeInNanoSeconds)   //Updates in nanoseconds
      {
         if(lengthOfLoadingBar < 482)
         {
            lengthOfLoadingBar++;   //Adds one to the loading bar each time
            draw(gc);   //Goes back to the draw method
         }
         else
         {
            lengthOfLoadingBar = 0;   //Once the loading bar exceeds 482, it resets to 0
         }
      }
   }
   
   public class KeyListener implements EventHandler<KeyEvent>
   {
      public void handle(KeyEvent event)
      {  
         if(event.getCode() == KeyCode.A)   //If a is pressed, it stops the animation
         {
            ac.stop();
         }
         
         if(event.getCode() == KeyCode.S)   //If s is pressed, it starts the animation
         {
            ac.start();
         }
      }
   }
}