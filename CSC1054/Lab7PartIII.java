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

public class Lab7PartIII extends Application
{
   FlowPane fp = new FlowPane();
   
   public void start(Stage stage)
   {
      fp.setAlignment(Pos.CENTER);
      Canvas c = new Lab7Canvas("00.txt");   //Starts on the first textfile
      fp.getChildren().add(c);   //Adds it to the flowpane
      
      Scene scene = new Scene(fp, 450, 450);
      stage.setScene(scene);
      stage.setTitle("Lab 7 Part 3");
      stage.show();
      
      c.requestFocus();   //For the keyboard
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }  
}