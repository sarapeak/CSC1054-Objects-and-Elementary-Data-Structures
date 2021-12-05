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

public class Lab5PartII extends Application
{  
   //Part 2: Creating a GUI based on picture
   public void start(Stage stage)
   {
      BorderPane bp = new BorderPane();
      bp.setPrefSize(600,600);
      
      //For the Cyan color and the Yellow color on the top
      FlowPane cyan = new FlowPane();    //A flow pane
      cyan.setAlignment(Pos.TOP_LEFT);   //Positioned in the Top Left
      
      //Creates the text to label the cyan color
      Label cyanText = new Label("Cyan");
      cyanText.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));   //The background color is cyan
      cyan.getChildren().add(cyanText);
      
      //Makes the line of cyan color in the window
      for(int c = 0; c<102; c++)
      {
         Label cyanText1 = new Label(".");
         cyanText1.setTextFill(Color.CYAN);
         cyanText1.setBackground(new Background(new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));   //The background color is cyan
         cyan.getChildren().add(cyanText1);
      }

      //Creates the text to label the yellow color
      Label yellowText = new Label("Yellow");
      yellowText.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));   //The background color is yellow
      cyan.getChildren().add(yellowText);
      
      //Makes the line of yellow color in the window
      for(int c = 0; c<100; c++)
      {
         Label yellowText1 = new Label(".");
         yellowText1.setTextFill(Color.YELLOW);
         yellowText1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));   //The background color is yellow
         cyan.getChildren().add(yellowText1);
      }
      
      //For the White color on the Right Side
      VBox white = new VBox();   //A vertical box
      white.setAlignment(Pos.TOP_RIGHT);   //Postitioned in the Top Right
      
      for(int w = 0; w<16; w++)
      {
         if(w%2 == 0)   //If w leaves a remainder of 0, then it also puts the white text on the pane(creates 8 of them)
         {
            Label whiteText = new Label("White\t");
            whiteText.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
            white.getChildren().add(whiteText);
         }
         //Creates the white boxes wth no text in them
         Label whiteText1 = new Label("White\t");
         whiteText1.setTextFill(Color.WHITE);
         whiteText1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
         white.getChildren().add(whiteText1);
      }
      
      //For the gray and yellow strips
      FlowPane gray = new FlowPane();   //a flow pane
      gray.setAlignment(Pos.TOP_LEFT);  //Positioned in the Top Left
      
      //Creates the double gray line
      for(int g = 0; g<391; g++)
      {
         Label grayColor1 = new Label(".");
         grayColor1.setTextFill(Color.GRAY);
         grayColor1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
         gray.getChildren().add(grayColor1);
      }
      
      //At the end of the double gray line, it prints out the word Gray
      Label grayText1 = new Label("\tGray");
      grayText1.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
      gray.getChildren().add(grayText1);   //Adds the label to the pane
      
      //Creates the label Yellow
      Label yellowText2 = new Label("Yellow");
      yellowText2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
      gray.getChildren().add(yellowText2);   //Adds the label to the pane
      
      //Creates the yellow line
      for(int g = 0; g<192; g++)
      {
         Label yellowColor1 = new Label(".");
         yellowColor1.setTextFill(Color.YELLOW);
         yellowColor1.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
         gray.getChildren().add(yellowColor1);
      }
      
      //Creates the double gray lines
      for(int g = 0; g<391; g++)
      {
         Label grayColor2 = new Label(".");
         grayColor2.setTextFill(Color.GRAY);
         grayColor2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
         gray.getChildren().add(grayColor2);
      }
      
      //At the end of the double gray line, it prints out the word Gray
      Label grayText2 = new Label("\tGray");
      grayText2.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
      gray.getChildren().add(grayText2);
      
      //Creates another yellow label for the new yellow line
      Label yellowText3 = new Label("Yellow");
      yellowText3.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
      gray.getChildren().add(yellowText3);
      
      //Creates a new yellow line
      for(int g = 0; g<192; g++)
      {
         Label yellowColor2 = new Label(".");
         yellowColor2.setTextFill(Color.YELLOW);
         yellowColor2.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
         gray.getChildren().add(yellowColor2);
      }
      
      //The third gray double line
      for(int g = 0; g<391; g++)
      {
         Label grayColor3 = new Label(".");
         grayColor3.setTextFill(Color.GRAY);
         grayColor3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
         gray.getChildren().add(grayColor3);
      }
      
      //The label for the text for the gray line
      Label grayText3 = new Label("\tGray");
      grayText3.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
      gray.getChildren().add(grayText3);
      
      //The third label for the yellow line
      Label yellowText4 = new Label("Yellow");
      yellowText4.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
      gray.getChildren().add(yellowText4);
      
      //Creates the third yellow line
      for(int g = 0; g<192; g++)
      {
         Label yellowColor3 = new Label(".");
         yellowColor3.setTextFill(Color.YELLOW);
         yellowColor3.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
         gray.getChildren().add(yellowColor3);
      }
      
      //Setting where the panes and boxes go on the borderpane
      bp.setTop(cyan);
      bp.setRight(white);
      bp.setCenter(gray);
      
      //Filling in the backgorund of the window to the color blue
      BackgroundFill background_fill = new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY); 
      Background background = new Background(background_fill); 
      bp.setBackground(background);
      
      //Setting up the stage and showing the window
      Scene scene = new Scene(bp, 600, 600);
      stage.setScene(scene);
      stage.setTitle("Lab5");
      stage.show();
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }
}