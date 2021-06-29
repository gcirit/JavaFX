package animations.fadeTransition;

import javafx.animation.FadeTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Fade_Transition extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        //Creating the circle   
        Circle cir = new Circle(250,120,80);  
          
        //setting color and stroke of the circle   
        cir.setFill(Color.RED);  
        cir.setStroke(Color.BLACK);  
          
        //Instantiating FadeTransition class   
        FadeTransition fade = new FadeTransition();  
          
          
        //setting the duration for the Fade transition   
        fade.setDuration(Duration.millis(5000));  
          
        //setting the initial and the target opacity value for the transition   
        fade.setFromValue(10);  
        fade.setToValue(0.1);  
          
        //setting cycle count for the Fade transition   
        fade.setCycleCount(1000);  
          
        //the transition will set to be auto reversed by setting this to true   
        fade.setAutoReverse(true);  
          
        //setting Circle as the node onto which the transition will be applied  
        fade.setNode(cir);  
          
          
        //playing the transition   
        fade.play();  
          
        //Configuring Group and Scene   
        Group root = new Group();  
        root.getChildren().addAll(cir);  
        Scene scene = new Scene(root,500,250,Color.WHEAT);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Translate Transition example");  
        primaryStage.show();  
          
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
}
