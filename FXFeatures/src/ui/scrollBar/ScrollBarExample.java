package ui.scrollBar;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.ScrollBar;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  

public class ScrollBarExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        ScrollBar s = new ScrollBar();  
        StackPane root = new StackPane();  
        root.getChildren().add(s);  
        Scene scene = new Scene(root,300,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("ScrollBar Example");  
        primaryStage.show();  
          
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}
