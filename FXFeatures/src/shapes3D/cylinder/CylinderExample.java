package shapes3D.cylinder;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.PerspectiveCamera;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Cylinder;  
import javafx.stage.Stage;  

public class CylinderExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        //creating cylinder   
        Cylinder cyn = new Cylinder();  
          
        //setting the radius and height for the cylinder   
        cyn.setRadius(80);  
        cyn.setHeight(200);  
        cyn.setTranslateX(300);  
        cyn.setTranslateY(250);  
          
        //setting camera   
        PerspectiveCamera camera = new PerspectiveCamera();  
        camera.setTranslateX(100);  
        camera.setTranslateY(100);  
        camera.setTranslateZ(0);  
          
        //setting group and stage   
        Group root = new Group();  
        root.getChildren().addAll(cyn);  
        Scene scene = new Scene(root,450,300,Color.LIMEGREEN);  
        scene.setCamera(camera);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Cylinder Example");  
        primaryStage.show();  
    }  
    
	public static void main(String[] args) {  
	    launch(args);  
	}  
}
