package effects.blendEffect;

import javafx.application.Application;   
import javafx.scene.Group;   
import javafx.scene.Scene;   
import javafx.stage.Stage;  
import javafx.scene.shape.Circle;   
import javafx.scene.effect.Blend;   
import javafx.scene.effect.BlendMode;   
import javafx.scene.effect.ColorInput;   
import javafx.scene.paint.Color;   
  
public class BlendExample extends Application {  
	
	@Override  
	public void start(Stage primaryStage) {   
	Circle circle = new Circle(150,200,120);         
	circle.setFill(Color.RED);   
	Blend blend = new Blend();    
	ColorInput color = new ColorInput(70, 20, 160, 150, Color.LIMEGREEN);  
	blend.setTopInput(color);  
	blend.setMode(BlendMode.ADD);     
	circle.setEffect(blend);         
	Group root = new Group(circle);   
	Scene scene = new Scene(root, 300,350);    
	primaryStage.setTitle("Blend Example");   
	primaryStage.setScene(scene);   
	primaryStage.show();   
	}   
	
	public static void main(String args[]){   
	launch(args);   
	}   
}
