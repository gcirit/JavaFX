package effects.lightingEffect;

import javafx.application.Application;  
import javafx.geometry.VPos;  
import javafx.scene.Group;   
import javafx.scene.Scene;  
import javafx.scene.effect.Light;  
import javafx.scene.effect.Lighting;  
import javafx.scene.paint.Color;  
import javafx.stage.Stage;   
import javafx.scene.text.Font;   
import javafx.scene.text.FontWeight;   
import javafx.scene.text.Text;   
  
public class LightingSpotExample extends Application {
	
	@Override  
	public void start(Stage stage) {    
	Text text = new Text();         
	text.setFont(Font.font(null, FontWeight.BOLD, 35));          
	text.setX(20);   
	text.setY(50);   
	text.setTextOrigin(VPos.TOP);  
	text.setText("Welcome to JavaFX");          
	text.setFill(Color.RED);     
	Light.Spot light = new Light.Spot();  
	light.setPointsAtX(0);  
	light.setPointsAtY(0);  
	light.setPointsAtZ(-50);  
	light.setSpecularExponent(5);  
	Lighting lighting = new Lighting();   
	text.setEffect(lighting);         
	Group root = new Group();  
	root.getChildren().add(text);  
	Scene scene = new Scene(root, 500, 200);    
	stage.setTitle("light.Spot example");    
	stage.setScene(scene);  
	stage.show();           
	}   
	
	public static void main(String args[]){   
	launch(args);   
	}   
}
