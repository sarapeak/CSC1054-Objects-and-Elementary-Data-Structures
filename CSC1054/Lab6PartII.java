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

public class Lab6PartII extends Application
{
   //Part 2: Additions to Part I
   FlowPane root = new FlowPane();
   
   ComboBox boxNumbers = new ComboBox();
   CheckBox thick = new CheckBox("Thick");
   RadioButton spaceZero = new RadioButton("No Spaces");
   RadioButton spaceOne = new RadioButton("1 Space");
   TextField modes = new TextField("Enter an A or an I");
   
   Canvas canvasLine = new Canvas(400, 300);
   GraphicsContext gc = canvasLine.getGraphicsContext2D();
   
   //Creating the stage area
   public void start(Stage stage)
   {
      root.setAlignment(Pos.TOP_LEFT);   //Setting the alignment in the top left position
      
      //Adding options to the combobox
      boxNumbers.getItems().add("10");
      boxNumbers.getItems().add("50");
      boxNumbers.getItems().add("100");
      
      //Setting the combobox on and directing it to the ComponentListener and adding it to the flowpane 
      boxNumbers.setOnAction(new ComponentListener());
      root.getChildren().add(boxNumbers);
      
      //Creating a label to provide space between components adding it to the flowpane
      Label tab1 = new Label("   ");
      root.getChildren().add(tab1);
      
      //Setting the checkbox on and directing it to the ComponentListener and adding it to the flowpane
      thick.setOnAction(new ComponentListener());
      root.getChildren().add(thick);
      
      //Creating a label to provide space between components and adding it to the flowpane
      Label tab2 = new Label("   ");
      root.getChildren().add(tab2);
      
      ToggleGroup group = new ToggleGroup();   //Creating a group for the radiobuttons
      
      //Setting the radiobutton on, directing it to the ComponentListener, putting it in a group, and adding it to the flowpane
      spaceZero.setToggleGroup(group);
      spaceZero.setOnAction(new ComponentListener());
      spaceZero.setSelected(true);
      root.getChildren().add(spaceZero);
      
      //Creating a label to provide space between components and adding it to the flowpane
      Label tab3 = new Label("   ");
      root.getChildren().add(tab3);
      
      //Setting the radiobutton on, directing it to the ComponentListener, putting it in a group, and adding it to the flowpane
      spaceOne.setToggleGroup(group);
      spaceOne.setOnAction(new ComponentListener());
      root.getChildren().add(spaceOne);
      
      //Creating a label to provide space between components and adding it to the flowpane
      Label newLine = new Label("\n");
      root.getChildren().add(newLine);
      
      //Setting the textfield on and directing it to the TextFieldListener and adding it to the flowpane
      modes.setOnAction(new TextFieldListener());
      root.getChildren().add(modes);
      
      //Creating a label to provide space between components and adding it to the flowpane
      Label spaces = new Label("\n\n");
      root.getChildren().add(spaces);
      
      Scene scene = new Scene(root, 400, 300);
      stage.setScene(scene);
      stage.setTitle("Lab6");
      stage.show();
      
      boxNumbers.getSelectionModel().selectFirst();   //By default, showing the first option, "10"
   }
   
   //An event handler that controls multiple components
   public class ComponentListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {           
         //A switch statement for the different options
         switch((String)boxNumbers.getValue())
         {
            case"10":
               int space1 = 0;
               int space2 = 0;
               
               //Makes sure that anything drawn is cleared
               root.getChildren().remove(canvasLine);
               gc.clearRect(0, 0, 400, 300);
               
               //Creates 10 lines
               for(int i = 0; i<10; i++)
               {
                  gc.strokeLine(0, 10+space1, 100, 10+space1);
                  space1 = space1+11;
               }
               
               //If thick is selected, it creates another set of lines next to the original lines above
               if(thick.isSelected())
               {
                  space1 = 0;
                  
                  for(int i = 0; i<10; i++)
                  {
                     gc.strokeLine(0, 11+space1, 100, 11+space1);
                     space1 = space1+11;
                  }
               }
               
               //If spaceOne is selected, it makes a gap in the lines drawn
               if(spaceOne.isSelected())
               {  
                  space1 = 0;
                  space2 = 0;
                  
                  //Makes sure that anything drawn is cleared
                  root.getChildren().remove(canvasLine);
                  gc.clearRect(0, 0, 400, 300);
                  
                  //Creates ten lines with a gap in the middle
                  for(int i = 0; i<10; i++)
                  {
                     gc.strokeLine(0, 10+space1, 40, 10+space1);
                     space1 = space1+11;
   
                     gc.strokeLine(60, 10+space2, 100, 10+space2);
                     space2 = space2+11;
                  }
               }
               
               //If both thick and spaceOne is selected, then this section of code is executed
               if(thick.isSelected() && spaceOne.isSelected())
               {
                  space1 = 0;
                  space2 = 0;
                  
                  //Makes sure that anything drawn is cleared
                  root.getChildren().remove(canvasLine);
                  gc.clearRect(0, 0, 400, 300);
                  
                  //Makes ten thick lines with a gap in the middle
                  for(int i = 0; i<10; i++)
                  {
                     gc.strokeLine(0, 11+space1, 40, 11+space1);
                     gc.strokeLine(0, 10+space1, 40, 10+space1);
                     space1 = space1+11;
                     
                     gc.strokeLine(60, 11+space2, 100, 11+space2);
                     gc.strokeLine(60, 10+space2, 100, 10+space2);
                     space2 = space2+11;
                  }     
               }
               root.getChildren().add(canvasLine);   //Adds what is drawn to the window
               break;
               
            case"50":
               space1 = 0;
               space2 = 0;
               
               //Makes sure that anything drawn is cleared
               root.getChildren().remove(canvasLine);
               gc.clearRect(0, 0, 400, 300);
               
               //Creates fifty lines
               for(int i = 0; i<50; i++)
               {
                  gc.strokeLine(0, 10+space1, 100, 10+space1);
                  space1 = space1+3;
               }
               
               //If thick is selected, it creates 50 thick lines
               if(thick.isSelected())
               {
                  space1 = 0;
                  space2 = 0;
                  
                  //Creates fifty thick lines
                  for(int i = 0; i<50; i++)
                  {
                     gc.strokeLine(0, 11+space1, 100, 11+space1);
                     space1 = space1+3;
                  }
               }
               
               //If spaceOne is selected, it makes a gap in the lines drawn
               if(spaceOne.isSelected())
               {
                  space1 = 0;
                  space2 = 0;
                  
                  //Makes sure that anything drawn is cleared
                  root.getChildren().remove(canvasLine);
                  gc.clearRect(0, 0, 400, 300);
                  
                  //Makes fifty lines with a gap in the middle
                  for(int i = 0; i<50; i++)
                  {
                     gc.strokeLine(0, 10+space1, 40, 10+space1);
                     space1 = space1+3;
   
                     gc.strokeLine(60, 10+space2, 100, 10+space2);
                     space2 = space2+3;
                  }
               }
               
               //If both thick and spaceOne is selected, then this line of code is executed
               if(thick.isSelected() && spaceOne.isSelected())
               {
                  space1 = 0;
                  space2 = 0;
                  
                  //Makes sure that anything drawn is cleared
                  root.getChildren().remove(canvasLine);
                  gc.clearRect(0, 0, 400, 300);
                  
                  //Creates fifty lines that are thick and with a gap in the middle of the lines
                  for(int i = 0; i<50; i++)
                  {
                     gc.strokeLine(0, 11+space1, 40, 11+space1);
                     gc.strokeLine(0, 10+space1, 40, 10+space1);
                     space1 = space1+3;
                     
                     gc.strokeLine(60, 11+space2, 100, 11+space2);
                     gc.strokeLine(60, 10+space2, 100, 10+space2);
                     space2 = space2+3;
                  }     
               }
               root.getChildren().add(canvasLine);   //Adds what is drawn to the window
               break;
               
            case"100":
               space1 = 0;
               space2 = 0;
               
               //Makes sure that anything drawn is cleared
               root.getChildren().remove(canvasLine);
               gc.clearRect(0, 0, 400, 300);
               
               //Creates a hundred lines
               for(int i = 0; i<100; i++)
               {
                  gc.strokeLine(0, 10+space1, 100, 10+space1);
                  space1 = space1+2;
               }
               
               //If thick is selected, it makes a hundred thick lines
               if(thick.isSelected())
               {
                  space1 = 0;
                  
                  //Makes a hundred thick lines
                  for(int i = 0; i<100; i++)
                  {
                     gc.strokeLine(0, 11+space1, 100, 11+space1);
                     space1 = space1+2;
                  }
               }
               
               //If spaceOne is selected, it creates a gap in the middle of the lines
               if(spaceOne.isSelected())
               {
                  space1 = 0;
                  space2 = 0;
                  
                  //Makes sure that anything drawn is cleared
                  root.getChildren().remove(canvasLine);
                  gc.clearRect(0, 0, 400, 300);
                  
                  //Creates a hundred lines with a gap in the middle
                  for(int i = 0; i<100; i++)
                  {
                     gc.strokeLine(0, 10+space1, 40, 10+space1);
                     space1 = space1+2;
   
                     gc.strokeLine(60, 10+space2, 100, 10+space2);
                     space2 = space2+2;
                  }
               }
               
               //If both thick and spaceOne is selected, this line of code is executed
               if(thick.isSelected() && spaceOne.isSelected())
               {
                  space1 = 0;
                  space2 = 0;
                  
                  //Makes sure that anything drawn is cleared
                  root.getChildren().remove(canvasLine);
                  gc.clearRect(0, 0, 400, 300);
                  
                  //Creates a hundred thick lines with a gap in the middle
                  for(int i = 0; i<100; i++)
                  {
                     gc.strokeLine(0, 11+space1, 40, 11+space1);
                     gc.strokeLine(0, 10+space1, 40, 10+space1);
                     space1 = space1+2;
                     
                     gc.strokeLine(60, 11+space2, 100, 11+space2);
                     gc.strokeLine(60, 10+space2, 100, 10+space2);
                     space2 = space2+2;
                  }     
               }
               root.getChildren().add(canvasLine);   //Adds what is drawn to the window
               break;
         }
      }
   }
   
   //An event handler for the textfield
   public class TextFieldListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
         String letter = modes.getText();
         
         //If the letter entered in the textfield equals A, it executes this section of code
         if(letter.equals("A"))
         {
            int space1 = 0;
            int space2 = 0;
                  
            boxNumbers.getSelectionModel().select(2);   //Goes to case "100"
            
            //Makes sure that anything drawn is cleared
            root.getChildren().remove(canvasLine);
            gc.clearRect(0, 0, 400, 300);
            
            spaceOne.setSelected(true);   //Makes spaceOne selected
            thick.setSelected(true);   //Makes thick selected
            
            //Makes 100 thick lines with a space in the middle of the lines
            for(int i = 0; i<100; i++)
            {
               gc.strokeLine(0, 11+space1, 40, 11+space1);
               gc.strokeLine(0, 10+space1, 40, 10+space1);
               space1 = space1+2;
                        
               gc.strokeLine(60, 11+space2, 100, 11+space2);
               gc.strokeLine(60, 10+space2, 100, 10+space2);
               space2 = space2+2;
            }
            root.getChildren().add(canvasLine);   //Adds what is drawn to the window
         }
         //If the letter entered in the textfield equals I, it executes this section of code
         else if(letter.equals("I"))
         {
            int space1 = 0;
            int space2 = 0;
                  
            boxNumbers.getSelectionModel().select(0);   //Goes to case"10"
            
            //Makes sure that anything drawn is cleared
            root.getChildren().remove(canvasLine);
            gc.clearRect(0, 0, 400, 300);
            
            spaceZero.setSelected(true);   //Makes spaceZero selected
            thick.setSelected(false);   //Makes thick unselected
            
            //Creates 10 lines
            for(int i = 0; i<10; i++)
            {
               gc.strokeLine(0, 10+space1, 100, 10+space1);
               space1 = space1+11;
            }
            root.getChildren().add(canvasLine);   //Adds what is drawn to the window
         }
      }
   }
      
   public static void main(String[] args)
   {
      launch(args);   //Launches the program
   }
}