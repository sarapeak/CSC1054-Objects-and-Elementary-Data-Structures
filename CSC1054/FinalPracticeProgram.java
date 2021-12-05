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

public class FinalPracticeProgram extends Application
{
   FlowPane root = new FlowPane();
   BorderPane bp = new BorderPane();
   HBox buttons = new HBox();
   
   Button save = new Button("Save");
   Button results = new Button("Results");
   
   ArrayList<Integer> numberArrayList = new ArrayList<Integer>();
   int counter = 0;
   
   int number0;
   int number1;
   int number2;
   int number3;
   int number4;
     
   RadioButton q0Bad = new RadioButton("Bad");
   RadioButton q0SemiBad = new RadioButton("Semi-Bad");
   RadioButton q0Average = new RadioButton("Average");
   RadioButton q0Good = new RadioButton("Good");
   RadioButton q0Excellent = new RadioButton("Excellent");
   
   RadioButton q1Bad = new RadioButton("Bad");
   RadioButton q1SemiBad = new RadioButton("Semi-Bad");
   RadioButton q1Average = new RadioButton("Average");
   RadioButton q1Good = new RadioButton("Good");
   RadioButton q1Excellent = new RadioButton("Excellent");
   
   RadioButton q2Bad = new RadioButton("Bad");
   RadioButton q2SemiBad = new RadioButton("Semi-Bad");
   RadioButton q2Average = new RadioButton("Average");
   RadioButton q2Good = new RadioButton("Good");
   RadioButton q2Excellent = new RadioButton("Excellent");
   
   RadioButton q3Bad = new RadioButton("Bad");
   RadioButton q3SemiBad = new RadioButton("Semi-Bad");
   RadioButton q3Average = new RadioButton("Average");
   RadioButton q3Good = new RadioButton("Good");
   RadioButton q3Excellent = new RadioButton("Excellent");
   
   RadioButton q4Bad = new RadioButton("Bad");
   RadioButton q4SemiBad = new RadioButton("Semi-Bad");
   RadioButton q4Average = new RadioButton("Average");
   RadioButton q4Good = new RadioButton("Good");
   RadioButton q4Excellent = new RadioButton("Excellent");
   
   public void start(Stage stage)
   {
      HBox left = new HBox();
      left.setAlignment(Pos.TOP_LEFT);
      
      //Creates a space starting from the left side to center the buttons
      for(int i = 0; i<5; i++)
      {
         Label spaceLeft = new Label(" ");
         left.getChildren().add(spaceLeft);
      }
      
      HBox right = new HBox();
      right.setAlignment(Pos.TOP_RIGHT);
      
      //Creates a space starting from the left side to center the buttons
      for(int i = 0; i<5; i++)
      {
         Label spaceRight = new Label(" ");
         right.getChildren().add(spaceRight);
      }
      
      root.setAlignment(Pos.CENTER);
      
      //Question 0 radiobuttons and functions
      Label q0 = new Label("Question 0");
      root.getChildren().add(q0);
      
      Label tab1 = new Label("\t");
      root.getChildren().add(tab1);
      
      ToggleGroup group0 = new ToggleGroup();
      
      q0Bad.setToggleGroup(group0);
      q0Bad.setOnAction(new ComponentListener());
      root.getChildren().add(q0Bad);
      
      Label tab2 = new Label("   ");
      root.getChildren().add(tab2);
      
      q0SemiBad.setToggleGroup(group0);
      q0SemiBad.setOnAction(new ComponentListener());
      root.getChildren().add(q0SemiBad);
      
      Label tab3 = new Label("   ");
      root.getChildren().add(tab3);
      
      q0Average.setToggleGroup(group0);
      q0Average.setOnAction(new ComponentListener());
      root.getChildren().add(q0Average);
      
      Label tab4 = new Label("   ");
      root.getChildren().add(tab4);
      
      q0Good.setToggleGroup(group0);
      q0Good.setOnAction(new ComponentListener());
      root.getChildren().add(q0Good);
      
      Label tab5 = new Label("   ");
      root.getChildren().add(tab5);
      
      q0Excellent.setToggleGroup(group0);
      q0Excellent.setOnAction(new ComponentListener());
      root.getChildren().add(q0Excellent);
      
      Label space0 = new Label("\n\n\n");
      root.getChildren().add(space0);
      
      
      
      //Question 1 radiobuttons and functions
      Label q1 = new Label("Question 1");
      root.getChildren().add(q1);
      
      Label tab6 = new Label("\t");
      root.getChildren().add(tab6);
      
      ToggleGroup group1 = new ToggleGroup();
      
      q1Bad.setToggleGroup(group1);
      q1Bad.setOnAction(new ComponentListener());
      root.getChildren().add(q1Bad);
      
      Label tab7 = new Label("   ");
      root.getChildren().add(tab7);
      
      q1SemiBad.setToggleGroup(group1);
      q1SemiBad.setOnAction(new ComponentListener());
      root.getChildren().add(q1SemiBad);
      
      Label tab8 = new Label("   ");
      root.getChildren().add(tab8);
      
      q1Average.setToggleGroup(group1);
      q1Average.setOnAction(new ComponentListener());
      root.getChildren().add(q1Average);
      
      Label tab9 = new Label("   ");
      root.getChildren().add(tab9);
      
      q1Good.setToggleGroup(group1);
      q1Good.setOnAction(new ComponentListener());
      root.getChildren().add(q1Good);
      
      Label tab10 = new Label("   ");
      root.getChildren().add(tab10);
      
      q1Excellent.setToggleGroup(group1);
      q1Excellent.setOnAction(new ComponentListener());
      root.getChildren().add(q1Excellent);
      
      Label space1 = new Label("\n\n\n");
      root.getChildren().add(space1);
      
      
      
      //Question 2 radiobuttons and functions
      Label q2 = new Label("Question 2");
      root.getChildren().add(q2);
      
      Label tab11 = new Label("\t");
      root.getChildren().add(tab11);
      
      ToggleGroup group2 = new ToggleGroup();
      
      q2Bad.setToggleGroup(group2);
      q2Bad.setOnAction(new ComponentListener());
      root.getChildren().add(q2Bad);
      
      Label tab12 = new Label("   ");
      root.getChildren().add(tab12);
      
      q2SemiBad.setToggleGroup(group2);
      q2SemiBad.setOnAction(new ComponentListener());
      root.getChildren().add(q2SemiBad);
      
      Label tab13 = new Label("   ");
      root.getChildren().add(tab13);
      
      q2Average.setToggleGroup(group2);
      q2Average.setOnAction(new ComponentListener());
      root.getChildren().add(q2Average);
      
      Label tab14 = new Label("   ");
      root.getChildren().add(tab14);
      
      q2Good.setToggleGroup(group2);
      q2Good.setOnAction(new ComponentListener());
      root.getChildren().add(q2Good);
      
      Label tab15 = new Label("   ");
      root.getChildren().add(tab15);
      
      q2Excellent.setToggleGroup(group2);
      q2Excellent.setOnAction(new ComponentListener());
      root.getChildren().add(q2Excellent);
      
      Label space2 = new Label("\n\n\n");
      root.getChildren().add(space2);
      
      
      
      //Question 3 radiobuttons and functions
      Label q3 = new Label("Question 3");
      root.getChildren().add(q3);
      
      Label tab16 = new Label("\t");
      root.getChildren().add(tab16);
      
      ToggleGroup group3 = new ToggleGroup();
      
      q3Bad.setToggleGroup(group3);
      q3Bad.setOnAction(new ComponentListener());
      root.getChildren().add(q3Bad);
      
      Label tab17 = new Label("   ");
      root.getChildren().add(tab17);
      
      q3SemiBad.setToggleGroup(group3);
      q3SemiBad.setOnAction(new ComponentListener());
      root.getChildren().add(q3SemiBad);
      
      Label tab18 = new Label("   ");
      root.getChildren().add(tab18);
      
      q3Average.setToggleGroup(group3);
      q3Average.setOnAction(new ComponentListener());
      root.getChildren().add(q3Average);
      
      Label tab19 = new Label("   ");
      root.getChildren().add(tab19);
      
      q3Good.setToggleGroup(group3);
      q3Good.setOnAction(new ComponentListener());
      root.getChildren().add(q3Good);
      
      Label tab20 = new Label("   ");
      root.getChildren().add(tab20);
      
      q3Excellent.setToggleGroup(group3);
      q3Excellent.setOnAction(new ComponentListener());
      root.getChildren().add(q3Excellent);
      
      Label space3 = new Label("\n\n\n");
      root.getChildren().add(space3);
      
      
      
      //Question 4 radiobuttons and functions
      Label q4 = new Label("Question 4");
      root.getChildren().add(q4);
      
      Label tab21 = new Label("\t");
      root.getChildren().add(tab21);
      
      ToggleGroup group4 = new ToggleGroup();
      
      q4Bad.setToggleGroup(group4);
      q4Bad.setOnAction(new ComponentListener());
      root.getChildren().add(q4Bad);
      
      Label tab22 = new Label("   ");
      root.getChildren().add(tab22);
      
      q4SemiBad.setToggleGroup(group4);
      q4SemiBad.setOnAction(new ComponentListener());
      root.getChildren().add(q4SemiBad);
      
      Label tab23 = new Label("   ");
      root.getChildren().add(tab23);
      
      q4Average.setToggleGroup(group4);
      q4Average.setOnAction(new ComponentListener());
      root.getChildren().add(q4Average);
      
      Label tab24 = new Label("   ");
      root.getChildren().add(tab24);
      
      q4Good.setToggleGroup(group4);
      q4Good.setOnAction(new ComponentListener());
      root.getChildren().add(q4Good);
      
      Label tab25 = new Label("   ");
      root.getChildren().add(tab25);
      
      q4Excellent.setToggleGroup(group4);
      q4Excellent.setOnAction(new ComponentListener());
      root.getChildren().add(q4Excellent);
      
      Label space4 = new Label("\n\n\n");
      root.getChildren().add(space4);
      
      //The buttons
      save.setPrefSize(50,30);
      save.setVisible(true);
      root.getChildren().add(save);
      
      results.setPrefSize(60,30);
      results.setVisible(true);
      root.getChildren().add(results);
      
      Label space5 = new Label("\n\n\n\n\n\n");
      root.getChildren().add(space5);
      
      bp.setCenter(root);
      bp.setLeft(left);
      bp.setRight(right);
      
      Scene scene = new Scene(bp, 500, 500);
      stage.setScene(scene);
      stage.setTitle("Final Practice Program");
      stage.show();
      
      save.setOnAction(new ComponentListener());
      results.setOnAction(new ComponentListener());
   }
   
   public class ComponentListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {         
         try
         {
            Scanner fileScan = new Scanner(new File("numberFile.txt"));
            FileOutputStream fos = new FileOutputStream("numberFile.txt", true); 
            PrintWriter pw = new PrintWriter(fos);
            
            if(e.getSource() == save)
            {
               if(q0Bad.isSelected())
               {
                  number0 = 1;
               }
               else if(q0SemiBad.isSelected())
               {
                  number0 = 2;
               }
               else if(q0Average.isSelected())
               {
                  number0 = 3;
               }
               else if(q0Good.isSelected())
               {
                  number0 = 4;
               }
               else if(q0Excellent.isSelected())
               {
                  number0 = 5;
               }
               pw.print("\n");
               pw.print(number0);   //Prints the information from the file the user is looking at into this new file
               
               if(q1Bad.isSelected())
               {
                  number1 = 1;
               }
               else if(q1SemiBad.isSelected())
               {
                  number1 = 2;
               }
               else if(q1Average.isSelected())
               {
                  number1 = 3;
               }
               else if(q1Good.isSelected())
               {
                  number1 = 4;
               }
               else if(q1Excellent.isSelected())
               {
                  number1 = 5;
               }
               pw.print(" ");
               pw.print(number1);
               
               if(q2Bad.isSelected())
               {
                  number2 = 1;
               }
               else if(q2SemiBad.isSelected())
               {
                  number2 = 2;
               }
               else if(q2Average.isSelected())
               {
                  number2 = 3;
               }
               else if(q2Good.isSelected())
               {
                  number2 = 4;
               }
               else if(q2Excellent.isSelected())
               {
                  number2 = 5;
               }
               pw.print(" ");
               pw.print(number2);
               
               if(q3Bad.isSelected())
               {
                  number3 = 1;
               }
               else if(q3SemiBad.isSelected())
               {
                  number3 = 2;
               }
               else if(q3Average.isSelected())
               {
                  number3 = 3;
               }
               else if(q3Good.isSelected())
               {
                  number3 = 4;
               }
               else if(q3Excellent.isSelected())
               {
                  number3 = 5;
               }
               pw.print(" ");
               pw.print(number3);
               
               if(q4Bad.isSelected())
               {
                  number4 = 1;
               }
               else if(q4SemiBad.isSelected())
               {
                  number4 = 2;
               }
               else if(q4Average.isSelected())
               {
                  number4 = 3;
               }
               else if(q4Good.isSelected())
               {
                  number4 = 4;
               }
               else if(q4Excellent.isSelected())
               {
                  number4 = 5;
               }
               pw.print(" ");
               pw.print(number4);
            }
            
            if(e.getSource() == results)
            {
               int num;
               try
               {
                  while(fileScan != null)
                  {
                     num = fileScan.nextInt();
                     numberArrayList.add(num);
                     counter++;
                  }
               }
               catch(Exception h)
               {
                  
               }
               
               int count = 0;
               double numberOfRows = 1;
               int num0 = 0;
               int num1 = 0;
               int num2 = 0;
               int num3 = 0;
               int num4 = 0;
                  
               for(int i = 0; i<counter; i++)
               {
                  if(count == 5)
                  {
                     count = 0;
                     numberOfRows++;
                  }
                  
                  if(count == 0)
                  {
                     num0 += numberArrayList.get(i);
                     count++;
                  }
                  else if(count == 1)
                  {
                     num1 += numberArrayList.get(i);
                     count++;
                  }
                  else if(count == 2)
                  {
                     num2 += numberArrayList.get(i);
                     count++;
                  }
                  else if(count == 3)
                  {
                     num3 += numberArrayList.get(i);
                     count++;
                  }
                  else if(count == 4)
                  {
                     num4 += numberArrayList.get(i);
                     count++;
                  }
               }
               
               double average0 = num0/numberOfRows;
                  
               if(average0 < 1.5)
               {
                  q0Bad.setSelected(true);
               }
               else if(average0 >= 1.5 && average0 < 2.5)
               {
                  q0SemiBad.setSelected(true);
               }
               else if(average0 >= 2.5 && average0 < 3.5)
               {
                  q0Average.setSelected(true);
               }
               else if(average0 >= 3.5 && average0 < 4.5)
               {
                  q0Good.setSelected(true);
               }
               else if(average0 >= 4.5)
               {
                  q0Excellent.setSelected(true);
               }
               
               double average1 = num1/numberOfRows;
               
               if(average1 <= 1 && average1 < 1.5)
               {
                  q1Bad.setSelected(true);
               }
               else if(average1 >= 1.5 && average1 < 2.5)
               {
                  q1SemiBad.setSelected(true);
               }
               else if(average1 >= 2.5 && average1 < 3.5)
               {
                  q1Average.setSelected(true);
               }
               else if(average1 >= 3.5 && average1 < 4.5)
               {
                  q1Good.setSelected(true);
               }
               else if(average1 >= 4.5)
               {
                  q1Excellent.setSelected(true);
               }
               
               double average2 = num2/numberOfRows;
               
               if(average2 <= 1 && average2 < 1.5)
               {
                  q2Bad.setSelected(true);
               }
               else if(average2 >= 1.5 && average2 < 2.5)
               {
                  q2SemiBad.setSelected(true);
               }
               else if(average2 >= 2.5 && average2 < 3.5)
               {
                  q2Average.setSelected(true);
               }
               else if(average2 >= 3.5 && average2 < 4.5)
               {
                  q2Good.setSelected(true);
               }
               else if(average2 >= 4.5)
               {
                  q2Excellent.setSelected(true);
               }
               
               double average3 = num3/numberOfRows;
               
               if(average3 <= 1 && average3 < 1.5)
               {
                  q3Bad.setSelected(true);
               }
               else if(average3 >= 1.5 && average3 < 2.5)
               {
                  q3SemiBad.setSelected(true);
               }
               else if(average3 >= 2.5 && average3 < 3.5)
               {
                  q3Average.setSelected(true);
               }
               else if(average3 >= 3.5 && average3 < 4.5)
               {
                  q3Good.setSelected(true);
               }
               else if(average3 >= 4.5)
               {
                  q3Excellent.setSelected(true);
               }
               
               double average4 = num4/numberOfRows;
                
               if(average4 <= 1 && average4 < 1.5)
               {
                  q4Bad.setSelected(true);
               }
               else if(average4 >= 1.5 && average4 < 2.5)
               {
                  q4SemiBad.setSelected(true);
               }
               else if(average4 >= 2.5 && average4 < 3.5)
               {
                  q4Average.setSelected(true);
               }
               else if(average4 >= 3.5 && average4 < 4.5)
               {
                  q4Good.setSelected(true);
               }
               else if(average4 >= 4.5)
               {
                  q4Excellent.setSelected(true);
               }
            }
            pw.close();   //Closes the file
         }
         catch(FileNotFoundException fnfe)
         {
            System.out.println("Error: File not found");
         }
      }
   }
   
   public static void main(String[] args)
   {
      launch(args);   //Launches the program
   }
}