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

public class BorderTry extends Application
{
   public void start(Stage stage)
   {
      BorderPane bp = new BorderPane();
      bp.setPrefSize(600,500);
      
      FlowPane top = new FlowPane();
      top.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
      
      FlowPane bottom = new FlowPane();
      bottom.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
      
      FlowPane left = new FlowPane();
      left.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
      
      FlowPane right = new FlowPane();
      right.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
      
      FlowPane center = new FlowPane();
      center.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
      
      bp.setRight(right);
      bp.setLeft(left);
      bp.setCenter(center);
      bp.setTop(top);
      bp.setBottom(bottom);
      
      Scene scene = new Scene(bp, 600, 500);
      stage.setScene(scene);
      stage.setTitle("BorderPanelTry");
      stage.show();
   }
   public static void main(String[] args)
   {
      launch(args);
   }
}