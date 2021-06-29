package animations.fillTransition;

import javafx.animation.FillTransition;  
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Polygon;  
import javafx.stage.Stage;  
import javafx.util.Duration;  
public class Fill_Transition extends Application{ 
	
	public static void main(String[] args) {  
	    launch(args);  
	}  
	
	@Override  
	    public void start(Stage primaryStage) throws Exception {  
	        // TODO Auto-generated method stub  
	    //Creating Polygon   
	    Polygon poly = new Polygon();  
	      
	    //Setting points for the polygon  
	    poly.getPoints().addAll(new Double[] {220.0,270.0,170.0,220.0,170.0,120.0,220.0,70.0,270.0,120.0,270.0,220.0});  
	      
	    //Setting Color and Stroke properties for the polygon    
	    poly.setStroke(Color.BLACK);  
	      
	    //Instantiating Fill Transition class   
	    FillTransition fill = new FillTransition();  
	      
	    //The transition will set to be auto reserved by setting this to true  
	    fill.setAutoReverse(true);  
	      
	    //setting cycle count for the fill transition   
	    fill.setCycleCount(50);  
	      
	    //setting duration for the Fill Transition   
	    fill.setDuration(Duration.millis(1000));  
	      
	    //setting the Intital from value of the color  
	    fill.setFromValue(Color.BLACK);  
	      
	    //setting the target value of the color  
	    fill.setToValue(Color.WHITE);  
	      
	    //setting polygon as the shape onto which the fill transition will be applied   
	    fill.setShape(poly);  
	      
	    //playing the fill transition   
	    fill.play();  
	      
	    //Configuring Group and Scene   
	    Group root = new Group();  
	    root.getChildren().addAll(poly);  
	    Scene scene = new Scene(root,420,400,Color.WHEAT);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Fill Transition example");  
	    primaryStage.show();  
	      
	    }  
}
