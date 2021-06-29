package eventHandling.setOnAction;

import javafx.animation.RotateTransition;  
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
  
public class SetOnActionExample extends Application {
	
  public static void main(String[] args) {  
    Application.launch(args);  
  }  
  
  @Override  
  public void start(Stage primaryStage) {  
      
    // Creating Rectangle   
    Rectangle rect = new Rectangle(100,100,120,120);  
      
    // Setting Stroke and color for the rectangle   
    rect.setFill(Color.RED);  
    rect.setStroke(Color.BLACK);  
      
    // Instantiating RotateTransition class   
    RotateTransition rotate = new RotateTransition();  
      
    //Setting properties for the Rotate Transition class   
    rotate.setAutoReverse(false);  
    rotate.setByAngle(360);  
    rotate.setCycleCount(500);  
    rotate.setDuration(Duration.millis(500));  
    rotate.setNode(rect);  
      
    //Creating the play button   
    Button btn = new Button();  
      
    //Setting properties for the play button   
    btn.setText("Play");  
    btn.setTranslateX(100);  
    btn.setTranslateY(250);  
      
    //defining the convenience method to register the event handler to handle the Action event.      
    btn.setOnAction(new EventHandler<ActionEvent>() {  
      public void handle(ActionEvent event) {  
            
          rotate.play();  
      }  
    });  
      
    //Creating the pause button   
    Button btn1 = new Button("Pause");  
      
    //Setting propertied for the pause button   
    btn1.setTranslateX(160);  
    btn1.setTranslateY(250);  
      
    //Handling event for the pause button click event   
    btn1.setOnAction(new EventHandler<ActionEvent>() {  
  
        @Override  
        public void handle(ActionEvent arg0) {  
            // TODO Auto-generated method stub  
            rotate.pause();  
        }  
          
    });  
      
    //Configuring group and scene   
    Group root = new Group();  
    Scene scene = new Scene(root, 400, 350);  
    root.getChildren().addAll(btn,rect,btn1);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("Handling Events");  
    primaryStage.show();  
  }  
}
