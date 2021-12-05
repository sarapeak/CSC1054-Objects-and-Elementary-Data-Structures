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

public class Lab7PartI extends Application
{
   //Part 1: Creating an animation
   FlowPane root = new FlowPane();
   
   public void start(Stage stage)
   {
      root.setAlignment(Pos.CENTER);
      
      //Makes the background color black
      BackgroundFill background_fill = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY); 
      Background background = new Background(background_fill);
      root.setBackground(background);
      
      //Creates a canvas from Lab7PartICanvas
      Canvas c = new Lab7PartICanvas();
      root.getChildren().add(c);   //Adds c to the flowpane
      
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Lab7: Part 1");
      stage.show();
      
      c.requestFocus();   //RequestFocus of c for the keyboard
   }
   
   public static void main(String[] args)
   {
      launch(args);   //Launches the program
   }
}

