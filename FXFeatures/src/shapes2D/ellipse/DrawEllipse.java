package shapes2D.ellipse;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Ellipse;  
import javafx.stage.Stage;  
public class DrawEllipse extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
    primaryStage.setTitle("Ellipse Example");
    Group group = new Group();  
    Ellipse elipse = new Ellipse();  
    elipse.setCenterX(100);  
    elipse.setCenterY(100);  
    elipse.setRadiusX(50);  
    elipse.setRadiusY(80);  
    group.getChildren().addAll(elipse);  
    Scene scene = new Scene(group,200,300,Color.GRAY);  
    primaryStage.setScene(scene);  
    primaryStage.show();  
}  
public static void main(String[] args) {  
    launch(args);  
}  
  
}  
