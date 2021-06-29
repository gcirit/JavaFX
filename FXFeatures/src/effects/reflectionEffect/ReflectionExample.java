package effects.reflectionEffect;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.Reflection;  
import javafx.scene.text.Font;  
import javafx.scene.text.FontPosture;  
import javafx.scene.text.FontWeight;  
import javafx.scene.text.Text;  
import javafx.stage.Stage;  
public class ReflectionExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Text text = new Text();  
        text.setFont(Font.font("calibri",FontWeight.BLACK,FontPosture.REGULAR,20));  
        text.setText("Welcome to JavaFX");  
        text.setX(90);  
        text.setY(90);  
        Reflection ref = new Reflection();  
        ref.setBottomOpacity(0.2);  
        ref.setFraction(12);  
        ref.setTopOffset(10);  
        ref.setTopOpacity(0.2);  
        text.setEffect(ref);  
        Group root = new Group();  
        Scene scene = new Scene(root,400,300);  
        root.getChildren().add(text);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Reflection Example");  
        primaryStage.show();  
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
}
