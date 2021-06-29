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
  
public class LightingPointExample extends Application {  
	
	@Override  
	public void start(Stage stage) {    
	Text text = new Text();         
	text.setFont(Font.font(null, FontWeight.BOLD, 40));          
	text.setX(50);   
	text.setY(40);   
	text.setTextOrigin(VPos.TOP);  
	text.setText("Welcome to JavaFX");          
	text.setFill(Color.RED);     
	Light.Point light = new Light.Point();  
	light.setX(0);  
	light.setY(0);  
	light.setZ(-100);  
	Lighting lighting = new Lighting();   
	lighting.setSurfaceScale(5);  
	text.setEffect(lighting);         
	Group root = new Group();  
	root.getChildren().add(text);  
	Scene scene = new Scene(root, 500, 200);    
	stage.setTitle("light.Point example");    
	stage.setScene(scene);  
	stage.show();           
	}   
	
	public static void main(String args[]){   
	launch(args);   
	}   
}
