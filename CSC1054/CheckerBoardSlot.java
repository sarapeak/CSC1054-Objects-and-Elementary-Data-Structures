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

public class CheckerBoardSlot extends FlowPane
{
   private Paint color;
   //A constructor that takes in a color
   public CheckerBoardSlot(Paint color)
   {
      this.color = color;
      
      setAlignment(Pos.TOP_LEFT);   //Aligns the squares to the Top Left
      setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));   //Sets the background color put in from the client
      setPrefSize(100,100);   //Sets the size of the squares to 100x100
    }
}