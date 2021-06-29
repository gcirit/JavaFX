package shapes2D.rectangle;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;  
public class DrawRectangle extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
    primaryStage.setTitle("Rectangle Example");  
    Group group = new Group(); //creating Group   
    Rectangle rect=new Rectangle(); //instantiating Rectangle   
    rect.setX(20); //setting the X coordinate of upper left //corner of rectangle   
    rect.setY(20); //setting the Y coordinate of upper left //corner of rectangle   
    rect.setWidth(100); //setting the width of rectangle   
    rect.setHeight(100); // setting the height of rectangle   
    group.getChildren().addAll(rect); //adding rectangle to the //group   
    Scene scene = new Scene(group,200,300,Color.GRAY);  
    primaryStage.setScene(scene);  
    primaryStage.show();  
}  
public static void main(String[] args) {  
    launch(args);  
}  
  
}  
