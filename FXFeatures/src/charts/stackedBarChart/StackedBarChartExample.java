package charts.stackedBarChart;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.CategoryAxis;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.StackedBarChart;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;  

public class StackedBarChartExample extends Application{  
	
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	    //Configuring xaxis and yaxis   
	    CategoryAxis xaxis = new CategoryAxis();  
	    NumberAxis yaxis = new NumberAxis(1000,300000,1000);  
	    xaxis.setLabel("Months");  
	    yaxis.setLabel("Number of users");  
	      
	    //Configuring StackedBarChart   
	    StackedBarChart sb = new StackedBarChart(xaxis,yaxis);  
	    sb.setTitle("Popularity of Programming languages");  
	      
	    //Configuring series for java  
	    XYChart.Series java = new XYChart.Series<>();  
	    java.setName("java");  
	    java.getData().add(new XYChart.Data<>("Jan",10000));  
	    java.getData().add(new XYChart.Data<>("Jan",130000));  
	    java.getData().add(new XYChart.Data<>("Feb",50000));  
	    java.getData().add(new XYChart.Data<>("Mar",60300));  
	    java.getData().add(new XYChart.Data<>("Apr",105600));  
	    java.getData().add(new XYChart.Data<>("May",50600));  
	    java.getData().add(new XYChart.Data<>("Jun",103000));  
	    java.getData().add(new XYChart.Data<>("Jul",104500));  
	    java.getData().add(new XYChart.Data<>("Aug",203000));  
	    java.getData().add(new XYChart.Data<>("Sep",103400));  
	    java.getData().add(new XYChart.Data<>("Oct",105600));  
	    java.getData().add(new XYChart.Data<>("Nov",102400));  
	    java.getData().add(new XYChart.Data<>("Dec",200000));  
	      
	    //Adding series java to the stackedbarchart  
	    sb.getData().add(java);  
	      
	    //Configuring series python   
	    XYChart.Series python = new XYChart.Series<>();  
	    python.setName("python");  
	    python.getData().add(new XYChart.Data<>("Jan",50000));  
	    python.getData().add(new XYChart.Data<>("Jan",14300));  
	    python.getData().add(new XYChart.Data<>("Feb",50400));  
	    python.getData().add(new XYChart.Data<>("Mar",100500));  
	    python.getData().add(new XYChart.Data<>("Apr",104000));  
	    python.getData().add(new XYChart.Data<>("May",134000));  
	    python.getData().add(new XYChart.Data<>("Jun",60000));  
	    python.getData().add(new XYChart.Data<>("Jul",78000));  
	    python.getData().add(new XYChart.Data<>("Aug",89000));  
	    python.getData().add(new XYChart.Data<>("Sep",150000));  
	    python.getData().add(new XYChart.Data<>("Oct",120000));  
	    python.getData().add(new XYChart.Data<>("Nov",109450));  
	    python.getData().add(new XYChart.Data<>("Dec",50450));  
	      
	    //adding python series to the stackedbarchart   
	    sb.getData().add(python);  
	      
	    //Configuring group and Scene   
	    Group root = new Group();  
	    root.getChildren().add(sb);  
	    Scene scene = new Scene(root,600,400);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("StackedBarChart Example");  
	    primaryStage.show();          
	}  
	
	public static void main(String[] args) {  
	    launch(args);  
	}  
}  
