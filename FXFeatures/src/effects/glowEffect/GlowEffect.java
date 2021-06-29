package effects.glowEffect;

import javafx.application.Application;  
import javafx.stage.Stage;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.effect.Glow;  
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.paint.Color;  
import javafx.scene.text.Font;  
import javafx.scene.text.FontPosture;  
import javafx.scene.text.FontWeight;  
import javafx.scene.text.Text;  
public class GlowEffect extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Image img1 = new Image("https://www.javatpoint.com/linux/images/linux-first.png");  
        Image img2 = new Image("https://www.javatpoint.com/linux/images/linux-first.png");  
          
        ImageView imgview1 = new ImageView(img1);  
        ImageView imgview2 = new ImageView(img2);  
        Text text1 = new Text();  
        Text text2 = new Text();  
        text1.setText("Glowing with level 10");  
        text2.setText("Not Glowing");  
        text1.setX(60);  
        text1.setY(300);  
        text2.setX(325);  
        text2.setY(300);  
        text1.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));  
        text2.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));  
        text1.setFill(Color.RED);  
        text2.setFill(Color.RED);  
        text1.setStroke(Color.BLACK);  
        text2.setStroke(Color.BLACK);  
        imgview1.setX(70);  
        imgview1.setY(90);  
        imgview2.setX(300);  
        imgview2.setY(90);  
        Glow glow = new Glow();   
        glow.setLevel(10);  
        imgview1.setEffect(glow);  
        Group root = new Group();  
        root.getChildren().addAll(imgview1,imgview2,text1,text2);  
        Scene scene = new Scene(root,500,350);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Glow Effect Example");  
        primaryStage.show();      
          
    }  
    public static void main(String[] args) {  
        launch(args);  
          
    }  
}
