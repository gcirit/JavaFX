package effects.boxBlurEffect;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.BoxBlur;  
import javafx.scene.paint.Color;  
import javafx.scene.text.Font;  
import javafx.scene.text.FontPosture;  
import javafx.scene.text.FontWeight;  
import javafx.scene.text.Text;  
import javafx.stage.Stage;  
public class BoxBlurExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Text text = new Text();  
        text.setText("Welcome to JavaFX");  
        text.setX(100);  
        text.setY(100);  
        text.setFont(Font.font("Calibri",FontWeight.BLACK,FontPosture.ITALIC,20));  
        text.setFill(Color.RED);  
        text.setStroke(Color.BLACK);  
        text.setUnderline(true);  
        BoxBlur b = new BoxBlur();  
        b.setHeight(5);  
        b.setWidth(2);  
        b.setIterations(1);  
        text.setEffect(b);  
        Group root = new Group();  
        root.getChildren().add(text);  
        Scene scene = new Scene(root,450,200);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("BoxBlur Example");  
        primaryStage.show();  
    }  
    
	public static void main(String[] args) {  
	    launch(args);  
	}  
}
