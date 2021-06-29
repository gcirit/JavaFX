package effects.shadowEffect;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.BlurType;  
import javafx.scene.effect.Shadow;  
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.paint.Color;  
import javafx.stage.Stage;  
public class ShadowExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Image img = new Image("https://www.javatpoint.com/images/logo/jtp_logo.png");  
        ImageView imgview = new ImageView(img);  
        imgview.setFitHeight(100);  
        imgview.setFitWidth(350);  
        imgview.setX(100);  
        imgview.setY(100);  
        Shadow shadow = new Shadow();  
        shadow.setBlurType(BlurType.GAUSSIAN);  
        shadow.setColor(Color.BLACK);  
        shadow.setHeight(30);  
        shadow.setRadius(12);  
        shadow.setWidth(20);  
        imgview.setEffect(shadow);  
        Group root = new Group();  
        root.getChildren().add(imgview);  
        Scene scene = new Scene(root,600,350);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Shadow Effect Example");  
        primaryStage.show();      
    }  
    
	public static void main(String[] args) {  
	    launch(args);  
	}  
  
}
