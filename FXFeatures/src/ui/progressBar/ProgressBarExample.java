package ui.progressBar;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.ProgressBar;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  

public class ProgressBarExample extends Application {  
	
	public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
	    StackPane root = new StackPane();  
	    ProgressBar progress = new ProgressBar();  
	    root.getChildren().add(progress);  
	    
	    // Using setProgress() Method
	    // ProgressBar p2 = new ProgressBar();  
	    // p2.setProgress(0.25f);  
	    
	    Scene scene = new Scene(root,300,200);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Progress Bar Example");  
	    primaryStage.show();  
	      
	}  
	public static void main(String[] args) {  
	        launch(args);     
	    }  
}
