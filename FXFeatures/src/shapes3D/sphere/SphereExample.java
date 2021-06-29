package shapes3D.sphere;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.PerspectiveCamera;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.CullFace;  
import javafx.scene.shape.Sphere;  
import javafx.stage.Stage;  

public class SphereExample extends Application{  
	
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	    //creating the sphere   
	    Sphere s = new Sphere();  
	  
	    //setting the properties for the sphere object  
	    s.setRadius(100);  
	    s.setTranslateX(200);  
	    s.setTranslateY(150);  
	    s.setCullFace(CullFace.BACK);  
	      
	    //setting camera   
	    PerspectiveCamera camera = new PerspectiveCamera();  
	    camera.setTranslateX(-50);  
	    camera.setTranslateY(0);  
	    camera.setTranslateZ(0);  
	              
	    //setting group and stage   
	    Group root = new Group();  
	    root.getChildren().addAll(s);  
	    Scene scene = new Scene(root,500,300,Color.LIMEGREEN);  
	    scene.setCamera(camera);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Sphere Example");  
	    primaryStage.show();  
	}  
	public static void main(String[] args) {  
	    launch(args);  
	}  
}
