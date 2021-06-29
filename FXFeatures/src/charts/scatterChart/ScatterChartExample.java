package charts.scatterChart;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.ScatterChart;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;  

public class ScatterChartExample extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        //Configuring Xaxis and Yaxis  
        NumberAxis xaxis = new NumberAxis(35,105,5);  
        NumberAxis yaxis = new NumberAxis(1,2.2,0.1);  
        xaxis.setLabel("Weight");  
        yaxis.setLabel("Height");  
          
        //Configuring ScatterChart    
        ScatterChart s = new ScatterChart(xaxis,yaxis);  
        s.setTitle("Perfect height according to your weight");  
          
        //Configuring Series and adding data to the series    
        XYChart.Series series = new XYChart.Series();  
        series.setName("Height value");  
        series.getData().add(new XYChart.Data(40,1.27));  
        series.getData().add(new XYChart.Data(45,1.35));  
        series.getData().add(new XYChart.Data(50,1.42));  
        series.getData().add(new XYChart.Data(55,1.49));  
        series.getData().add(new XYChart.Data(60,1.55));  
        series.getData().add(new XYChart.Data(65,1.62));  
        series.getData().add(new XYChart.Data(70,1.68));  
        series.getData().add(new XYChart.Data(75,1.74));  
        series.getData().add(new XYChart.Data(80,1.79));  
        series.getData().add(new XYChart.Data(85,1.85));  
        series.getData().add(new XYChart.Data(90,1.90));  
        series.getData().add(new XYChart.Data(95,1.95));  
        series.getData().add(new XYChart.Data(100,2.1));  
          
        //Adding series to the ScatterChart  
        s.getData().add(series);  
          
        //Configuring group and Scene   
        Group root = new Group();  
        root.getChildren().add(s);  
        Scene scene = new Scene(root,600,400);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("ScatterChart Example");  
        primaryStage.show();      
          
          
    }  
    
    public static void main(String[] args) {  
        launch(args);  
    }  
  
}
