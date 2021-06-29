package shapes2D.polygon;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.shape.Polygon;  
import javafx.stage.Stage;  
public class DrawPolygon extends Application {  
  
  @Override  
  public void start(Stage primarystage) {  
    Group root = new Group();  
    primarystage.setTitle("Pollygon Example");  
      
    Polygon polygon = new Polygon();  
    polygon.getPoints().addAll(new Double[]{  
        0.0, 0.0,  
        100.0, 200.0,  
        200.0, 100.0 });  
      
    root.getChildren().add(polygon);  
    Scene scene = new Scene(root,300,400);  
    primarystage.setScene(scene);  
    primarystage.show();  
  }  
  
  public static void main(String[] args) {  
    launch(args);  
  }  
}
