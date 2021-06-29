package ui.progressIndicator;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.ProgressIndicator;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  

public class ProgressIndicatorExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        ProgressIndicator PI=new ProgressIndicator(); 
        
        // Using setProgress() Method
        // Add the following lines to the code shown above in order to set the 75 % progress value.
        // ProgressIndicator PI=new ProgressIndicator();  
        // PI.setProgress(0.75f);  
          
        StackPane root = new StackPane();  
        root.getChildren().add(PI);  
        Scene scene = new Scene(root,300,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Progress Indicator Example");  
        primaryStage.show();  
          
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}
