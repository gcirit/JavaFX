package shapes3D.objectProperties;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.shape.CullFace;  
import javafx.scene.shape.Sphere;  
import javafx.stage.Stage;

public class CullFaceExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
    // TODO Auto-generated method stub  
      
    //Creating the first sphere   
    Sphere sphere = new Sphere();  
    sphere.setRadius(50);  
    sphere.setTranslateX(100);  
    sphere.setTranslateY(200);  
      
    //Setting cullface for the sphere 1   
    sphere.setCullFace(CullFace.BACK);  
      
    //creating second sphere   
    Sphere sphere1 = new Sphere();  
    sphere1.setRadius(50);  
    sphere1.setTranslateX(250);  
    sphere1.setTranslateY(200);  
      
    //setting CullFace for the sphere 2  
    sphere1.setCullFace(CullFace.FRONT);  
      
    //creating third sphere   
    Sphere sphere2 = new Sphere();  
    sphere2.setRadius(50);  
    sphere2.setTranslateX(400);  
    sphere2.setTranslateY(200);  
      
    //setting CullFace for the sphere 3  
    sphere2.setCullFace(CullFace.NONE);  
      
    //Configuring Group and Scene   
    Group root = new Group();  
    root.getChildren().addAll(sphere,sphere1,sphere2);  
    Scene scene = new Scene(root,500,400);  
    primaryStage.setScene(scene);  
    primaryStage.setTitle("CullFaces");  
    primaryStage.show();  
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}
