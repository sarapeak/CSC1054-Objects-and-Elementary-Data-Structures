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

public class PaintCanvas extends Canvas
{
   private String shape1;
   private int num1Pos1;
   private int num2Pos1;
   private int num3Pos1;
   private float num1Color1;
   private float num2Color1;
   private float num3Color1;
   private String shape2;
   private int num1Pos2;
   private int num2Pos2;
   private int num3Pos2;
   private float num1Color2;
   private float num2Color2;
   private float num3Color2;
   
   //A constructor that takes in the informatino from the client
   public PaintCanvas(String shape1, int num1Pos1, int num2Pos1, int num3Pos1, float num1Color1, float num2Color1, float num3Color1, String shape2, int num1Pos2, int num2Pos2, int num3Pos2, float num1Color2, float num2Color2, float num3Color2)
   {  
      //Makes the variables useful for the draw method
      this.shape1 = shape1;
      
      this.num1Pos1 = num1Pos1;
      this.num2Pos1 = num2Pos1;
      this.num3Pos1 = num3Pos1;
                 
      this.num1Color1 = num1Color1;
      this.num2Color1 = num2Color1;
      this.num3Color1 = num3Color1;
                  
      this.shape2 = shape2;
                  
      this.num1Pos2 = num1Pos2;
      this.num2Pos2 = num2Pos2;
      this.num3Pos2 = num3Pos2;
                 
      this.num1Color2 = num1Color2;
      this.num2Color2 = num2Color2;
      this.num3Color2 = num3Color2;
      
      //Sets the width and height of the window
      setWidth(600);
      setHeight(600);
      GraphicsContext gc = getGraphicsContext2D();
      draw(gc);   //Goes to the draw method
   }
   
   //Makes the shapes
   public void draw(GraphicsContext gc)
   {        
      //The circle shape
      Color newColor1 = new Color(num1Color1, num2Color1, num3Color1, 1);
      gc.setFill(newColor1);
      gc.fillOval(num1Pos1, num2Pos1, num3Pos1, num3Pos1);
      
      //The square shape
      Color newColor2 = new Color(num1Color2, num2Color2, num3Color2, 1);
      gc.setFill(newColor2);
      gc.fillRect(num1Pos2, num2Pos2, num3Pos2, num3Pos2);
   }
}