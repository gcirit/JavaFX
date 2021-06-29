package effects.lightingEffect;

import javafx.application.Application;   
import javafx.scene.Group;   
import javafx.scene.Scene;  
import javafx.scene.effect.Light;  
import javafx.scene.effect.Lighting;  
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.paint.Color;   
import javafx.stage.Stage;   
import javafx.scene.text.Font;   
import javafx.scene.text.FontWeight;   
import javafx.scene.text.Text;   
  
public class LightingDistantExample extends Application {
	
	@Override  
	public void start(Stage stage) {    
	Text text = new Text();         
	text.setFont(Font.font(null, FontWeight.BOLD, 35));          
	text.setX(60);   
	text.setY(100);   
	text.setText("Welcome to JavaFX");          
	text.setFill(Color.GREEN);     
	Image img = new Image("https://www.javatpoint.com/operating-system/images/operating-system-tutorial.png");  
	ImageView imgview = new ImageView(img);  
	imgview.setX(150);  
	imgview.setY(200);  
	Light.Distant light = new Light.Distant();  
	light.setAzimuth(0.2);  
	light.setColor(Color.YELLOW);  
	Lighting lighting = new Lighting();   
	lighting.setLight(light);  
	text.setEffect(lighting);         
	imgview.setEffect(lighting);   
	Group root = new Group(text,imgview);     
	Scene scene = new Scene(root, 580, 420);    
	stage.setTitle("light.Distant example");    
	stage.setScene(scene);  
	stage.show();           
	}   
	
	public static void main(String args[]){   
	launch(args);   
	}   
}   
