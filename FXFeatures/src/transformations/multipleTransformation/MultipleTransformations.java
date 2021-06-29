package transformations.multipleTransformation;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Circle;  
import javafx.scene.shape.Rectangle;  
import javafx.scene.transform.Rotate;  
import javafx.scene.transform.Scale;  
import javafx.scene.transform.Shear;  
import javafx.scene.transform.Translate;  
import javafx.stage.Stage;  
public class MultipleTransformations extends Application{ 
	
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	    //creating Rectangle and circle   
	    Rectangle rect = new Rectangle(50,10,200,250);  
	    Circle c = new Circle(300,260,100);  
	  
	    //setting properties for the rectangle and circle   
	    c.setFill(Color.LIGHTBLUE);  
	    c.setStroke(Color.BLACK);  
	    rect.setStroke(Color.BLACK);  
	    rect.setFill(Color.LIMEGREEN);  
	    rect.setStrokeWidth(2);  
	  
	    //creating the translate transform   
	    Translate trans=new Translate();  
	    trans.setX(100);  
	    trans.setY(10);  
	  
	    //creating Rotate transform   
	    Rotate rotate = new Rotate();  
	    rotate.setAngle(30);  
	    rotate.setPivotX(50);  
	    rotate.setPivotY(100);  
	  
	    //Creating Scale Transform   
	    Scale scale = new Scale();  
	    scale.setX(1.5);  
	    scale.setY(1.2);  
	    scale.setPivotX(50);  
	    scale.setPivotY(50);  
	  
	    //creating Shear Transform   
	    Shear shear = new Shear();  
	    shear.setX(0.3);  
	  
	    //applying all the transforms to the rectangle   
	    rect.getTransforms().addAll(trans,rotate,scale,shear);  
	  
	    Group root = new Group();  
	    root.getChildren().addAll(rect,c);  
	    Scene scene = new Scene(root,550,500);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Multiple Transformation Example");  
	    primaryStage.show();          
	      
	}  
	
	public static void main(String[] args) {  
	    launch(args);  
	}  
}
