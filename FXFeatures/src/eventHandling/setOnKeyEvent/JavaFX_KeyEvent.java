package eventHandling.setOnKeyEvent;

import javafx.application.Application;  
import javafx.event.EventHandler;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.control.TextField;  
import javafx.scene.input.KeyEvent;  
import javafx.scene.paint.Color;  
import javafx.stage.Stage;  
public class JavaFX_KeyEvent extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
          
        // TODO Auto-generated method stub  
          
        //Creating TextFields and setting position for them   
        TextField tf1 = new TextField();  
        TextField tf2 = new TextField();  
        tf1.setTranslateX(100);  
        tf1.setTranslateY(100);  
        tf2.setTranslateX(300);  
        tf2.setTranslateY(100);  
          
        //Handling KeyEvent for textfield 1   
        tf1.setOnKeyPressed(new EventHandler<KeyEvent>() {  
  
            @Override  
            public void handle(KeyEvent key) {  
                // TODO Auto-generated method stub  
                tf2.setText("Key Pressed :"+" "+key.getText());  
            }  
              
        });  
          
        //setting group and scene   
        Group root = new Group();  
        root.getChildren().addAll(tf2,tf1);  
        Scene scene = new Scene(root,500,200,Color.WHEAT);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Handling KeyEvent");  
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}
