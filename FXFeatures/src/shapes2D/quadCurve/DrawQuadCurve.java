package shapes2D.quadCurve;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.DropShadow;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.QuadCurve;  
import javafx.stage.Stage;  
public class DrawQuadCurve extends Application {  
  
  @Override  
  public void start(Stage primarystage) {  
    Group root = new Group();  
    primarystage.setTitle("QuadCurve Example");  
    QuadCurve c = new QuadCurve();  
    c.setStartX(70);  
    c.setStartY(30);  
    c.setControlX(250);  
    c.setControlY(50);  
    c.setFill(Color.RED);  
    c.setEffect(new DropShadow());  
    c.setEndX(250);  
    c.setEndY(300);  
    root.getChildren().add(c);  
    Scene scene = new Scene(root,300,400);  
    primarystage.setScene(scene);  
    primarystage.show();  
  }  
  
  public static void main(String[] args) {  
    launch(args);  
  }  
}
