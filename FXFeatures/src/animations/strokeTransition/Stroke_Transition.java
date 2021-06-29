package animations.strokeTransition;

import javafx.animation.StrokeTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Stroke_Transition extends Application{  
	
	public static void main(String[] args) {  
	    launch(args);  
	}  
	
	@Override  
    public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    //Creating Circle   
    Circle cir = new Circle(200,150,100);     
    //Setting stroke and color for the circle  
    cir.setStroke(Color.BLUE);  
    cir.setFill(Color.RED);  
    cir.setStrokeWidth(10);  
      
    //Instantiating StrokeTransition class   
    StrokeTransition stroke = new StrokeTransition();  
      
    //The transition will set to be auto reserved by setting this to true  
    stroke.setAutoReverse(true);  
      
    //setting cycle count for the Stroke transition   
    stroke.setCycleCount(500);  
      
    //setting duration for the Stroke Transition   
    stroke.setDuration(Duration.millis(500));  
      
    //setting the Initial from value of the Stroke color  
    stroke.setFromValue(Color.BLACK);  
      
    //setting the target value of the Stroke color   
    stroke.setToValue(Color.PURPLE);  
      
    //setting polygon as the shape onto which the Stroke transition will be applied   
    stroke.setShape(cir);  
      
    //playing the Stroke transition   
    stroke.play();  
      
    //Configuring Group and Scene   
    Group root = new Group();  
    root.getChildren().addAll(cir);  
    Scene scene = new Scene(root,420,300,Color.WHEAT);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Stroke Transition example");  
    primaryStage.show();  
      
    }  
}
