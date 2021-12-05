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

public class Lab7PartII extends Application
{
   public void start(Stage stage)
   {
      FlowPane fp = new FlowPane();
      fp.setAlignment(Pos.CENTER);
      Canvas c = new Lab7Canvas("00.txt");
      fp.getChildren().add(c);

      
      Scene scene = new Scene(fp, 450, 450);
      stage.setScene(scene);
      stage.setTitle("Lab 7");
      stage.show();
      c.requestFocus();
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }  
}