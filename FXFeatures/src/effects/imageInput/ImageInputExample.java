package effects.imageInput;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.ImageInput;  
import javafx.scene.image.Image;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;  
public class ImageInputExample extends Application {  
@Override  
public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
    Image img = new Image("https://www.javatpoint.com/jogl/images/jogl-3d-triangle.gif");  
    ImageInput imginput = new ImageInput();  
    Rectangle rect = new Rectangle();  
    imginput.setSource(img);  
    imginput.setX(20);  
    imginput.setY(100);  
    Group root = new Group();  
    rect.setEffect(imginput);  
    root.getChildren().add(rect);  
    Scene scene = new Scene(root,530,500,Color.BLACK);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("ImageInput Example");  
    primaryStage.show();  
      
}   
public static void main(String[] args) {  
    launch(args);  
}   
}
