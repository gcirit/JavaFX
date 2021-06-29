package ui.label;

import java.io.FileInputStream;  
  
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Label;  
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  
  
public class LabelExample extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
          
        StackPane root = new StackPane();   
        FileInputStream input= new FileInputStream("/home/javatpoint/Desktop/JavaFX/Images/colored_label.png");  
        Image image = new Image(input);  
        ImageView imageview=new ImageView(image);  
        Label my_label=new Label("Home",imageview);  
        Scene scene=new Scene(root,300,300);  
        root.getChildren().add(my_label);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Label Class Example");  
        primaryStage.show();  
          
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
}
