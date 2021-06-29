package effects.motionBlurEffect;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.MotionBlur;  
import javafx.scene.text.Font;  
import javafx.scene.text.FontPosture;  
import javafx.scene.text.FontWeight;  
import javafx.scene.text.Text;  
import javafx.stage.Stage;  
public class MotionBlurExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Text text = new Text("Welcome to javaFX");  
        text.setX(30);  
        text.setY(100);  
        text.setFont(Font.font("calibri",FontWeight.BOLD,FontPosture.ITALIC,40));  
        MotionBlur motion = new MotionBlur();  
        motion.setAngle(20);  
        motion.setRadius(10);  
        text.setEffect(motion);  
        Group root = new Group();  
        root.getChildren().addAll(text);  
        Scene scene = new Scene(root,600,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("MotionBlur Example");  
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}
