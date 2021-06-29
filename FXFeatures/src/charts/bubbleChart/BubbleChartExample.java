package charts.bubbleChart;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.BubbleChart;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;  

public class BubbleChartExample extends Application  
{  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        NumberAxis xaxis = new NumberAxis(0,70,5);  
        NumberAxis yaxis = new NumberAxis(0,24,4);  
        xaxis.setLabel("Age");  
        yaxis.setLabel("Hours spent");  
        BubbleChart bubble = new BubbleChart(xaxis, yaxis);  
        bubble.setTitle("Hours spent online by different age groups");  
        XYChart.Series male = new XYChart.Series<>();  
        male.setName("Male");  
        male.getData().add(new XYChart.Data(10,2));  
        male.getData().add(new XYChart.Data(15,7));  
        male.getData().add(new XYChart.Data(25,4));  
        male.getData().add(new XYChart.Data(35,6));  
        male.getData().add(new XYChart.Data(45,10));  
        male.getData().add(new XYChart.Data(55,13));  
        male.getData().add(new XYChart.Data(65,15));  
          
        XYChart.Series female = new XYChart.Series<>();  
        female.setName("Female");  
        female.getData().add(new XYChart.Data(10,1));  
        female.getData().add(new XYChart.Data(15,2));  
        female.getData().add(new XYChart.Data(25,9));  
        female.getData().add(new XYChart.Data(35,12));  
        female.getData().add(new XYChart.Data(45,15));  
        female.getData().add(new XYChart.Data(55,4));  
        female.getData().add(new XYChart.Data(65,2));  
        bubble.getData().add(male);  
        bubble.getData().add(female);  
        Group root = new Group();  
        root.getChildren().add(bubble);  
        Scene scene = new Scene(root,600,400);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("BubbleChart Example");  
        primaryStage.show();      
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
}
