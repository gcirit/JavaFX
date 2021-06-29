package animations.parallelTransition;

import javafx.animation.FadeTransition;  
import javafx.animation.RotateTransition;  
import javafx.animation.TranslateTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;  
import javafx.scene.shape.Line;  
import javafx.scene.transform.Rotate;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Parallel_Transition2 extends Application{  
	
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	  
	    Circle cir1 = new Circle(50,100,50);  
	    Circle cir2 = new Circle(550,100,50);  
	      
	    //setting colors and strokes for circle  
	    cir1.setFill(Color.BLUE);  
	    cir2.setFill(Color.LIMEGREEN);  
	    cir1.setStroke(Color.BLACK);  
	    cir2.setStroke(Color.BLACK);  
	      
	      
	    Line line1 = new Line(100,100,500, 100);  
	      
	    Circle cir3 = new Circle(50,400,50);  
	    Circle cir4 = new Circle(550,400,50);  
	    cir3.setFill(Color.RED);  
	    cir4.setFill(Color.PURPLE);  
	    cir3.setStroke(Color.BLACK);  
	    cir4.setStroke(Color.BLACK);  
	      
	    Line line2 = new Line(100,400,500, 400);  
	    Line line3 = new Line(50,150,50,350);  
	      
	    RotateTransition rotateline3 = new RotateTransition();  
	    rotateline3.setAxis(Rotate.X_AXIS);  
	    rotateline3.setByAngle(180);  
	    rotateline3.setAutoReverse(true);  
	    rotateline3.setDuration(Duration.millis(500));  
	    rotateline3.setCycleCount(50);  
	    rotateline3.setNode(line3);  
	    rotateline3.play();  
	      
	    Line line4 = new Line(550,150,550,350);  
	    RotateTransition rotateline4 = new RotateTransition();  
	    rotateline4.setAxis(Rotate.X_AXIS);  
	    rotateline4.setByAngle(180);  
	    rotateline4.setAutoReverse(true);  
	    rotateline4.setDuration(Duration.millis(500));  
	    rotateline4.setCycleCount(50);  
	    rotateline4.setNode(line4);  
	    rotateline4.play();  
	  
	    FadeTransition fadeCir1 = new FadeTransition();  
	    fadeCir1.setAutoReverse(true);  
	    fadeCir1.setFromValue(10);  
	    fadeCir1.setToValue(0.1);  
	    fadeCir1.setCycleCount(50);  
	    fadeCir1.setDuration(Duration.millis(500));  
	    fadeCir1.setNode(cir1);  
	    fadeCir1.play();  
	      
	    FadeTransition fadeCir2 = new FadeTransition();  
	    fadeCir2.setAutoReverse(true);  
	    fadeCir2.setFromValue(10);  
	    fadeCir2.setToValue(0.1);  
	    fadeCir2.setCycleCount(50);  
	    fadeCir2.setDuration(Duration.millis(500));  
	    fadeCir2.setNode(cir2);  
	    fadeCir2.play();  
	      
	    FadeTransition fadeCir3 = new FadeTransition();  
	    fadeCir3.setAutoReverse(true);  
	    fadeCir3.setFromValue(10);  
	    fadeCir3.setToValue(0.1);  
	    fadeCir3.setCycleCount(50);  
	    fadeCir3.setDuration(Duration.millis(500));  
	    fadeCir3.setNode(cir3);  
	    fadeCir3.play();  
	      
	    FadeTransition fadeCir4 = new FadeTransition();  
	    fadeCir4.setAutoReverse(true);  
	    fadeCir4.setFromValue(10);  
	    fadeCir4.setToValue(0.1);  
	    fadeCir4.setCycleCount(50);  
	    fadeCir4.setDuration(Duration.millis(500));  
	    fadeCir4.setNode(cir4);  
	    fadeCir4.play();  
	      
	      
	      
	    TranslateTransition trans1 = new TranslateTransition();  
	    trans1.setByY(300);  
	    trans1.setCycleCount(50);  
	    trans1.setDuration(Duration.millis(500));  
	    trans1.setAutoReverse(true);  
	    trans1.setNode(cir1);  
	    trans1.play();  
	      
	    TranslateTransition trans2 = new TranslateTransition();  
	    trans2.setCycleCount(50);  
	    trans2.setByY(300);  
	    trans2.setCycleCount(50);  
	    trans2.setDuration(Duration.millis(500));  
	    trans2.setAutoReverse(true);  
	    trans2.setNode(cir2);  
	    trans2.play();  
	      
	    TranslateTransition trans3 = new TranslateTransition();  
	    trans3.setByY(-300);  
	    trans3.setCycleCount(50);  
	    trans3.setDuration(Duration.millis(500));  
	    trans3.setAutoReverse(true);  
	    trans3.setNode(cir3);  
	    trans3.play();  
	      
	    TranslateTransition trans4 = new TranslateTransition();  
	      
	    trans4.setByY(-300);  
	    trans4.setAutoReverse(true);  
	    trans4.setCycleCount(50);  
	    trans4.setDuration(Duration.millis(500));  
	    trans4.setNode(cir4);  
	    trans4.play();  
	      
	    TranslateTransition linetrans1 = new TranslateTransition();  
	    linetrans1.setByY(300);  
	    linetrans1.setCycleCount(50);  
	    linetrans1.setDuration(Duration.millis(500));  
	    linetrans1.setAutoReverse(true);  
	    linetrans1.setNode(line1);  
	    linetrans1.play();  
	      
	    TranslateTransition linetrans2 = new TranslateTransition();  
	    linetrans2.setCycleCount(50);  
	    linetrans2.setByY(-300);  
	    linetrans2.setCycleCount(50);  
	    linetrans2.setDuration(Duration.millis(500));  
	    linetrans2.setAutoReverse(true);  
	    linetrans2.setNode(line2);  
	    linetrans2.play();  
	      
	    Group root = new Group();  
	    root.getChildren().addAll(cir1,cir2,line1,cir3,cir4,line2,line3,line4);  
	    Scene scene = new Scene(root,600,550,Color.WHEAT);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Animation example");  
	    primaryStage.show();  
	      
	  
	}  
	
	public static void main(String[] args) {  
	    launch(args);  
	}  
}
