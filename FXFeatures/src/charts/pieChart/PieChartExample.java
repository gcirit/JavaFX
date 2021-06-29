package charts.pieChart;

import javafx.application.Application;  
import javafx.collections.FXCollections;  
import javafx.collections.ObservableList;  
import javafx.scene.Scene;  
import javafx.scene.chart.PieChart;  
import javafx.scene.chart.PieChart.Data;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;  

public class PieChartExample extends Application{  
	public static void main(String[] args) {  
	    launch(args);  
	}  
	  
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	    //Instantiating the pie-chart class   
	    PieChart piechart = new PieChart();  
	  
	//setting the data of the pie chart.  
	    piechart.setData(getChartData());  
	      
	    //Creating Layout   
	    StackPane root = new StackPane();  
	  
	    //Adding pie-chart to the layout   
	    root.getChildren().add(piechart);  
	  
	    //configuring scene   
	    Scene scene = new Scene(root,400,400);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("PieChart Example");  
	    primaryStage.show();  
	      
	}  
	//creating getChartData method to set the chart data   
	private ObservableList<Data> getChartData() {  
	    ObservableList<Data> list = FXCollections.observableArrayList();  
	    list.addAll(new PieChart.Data("Javatpoint", 90),  
	            new PieChart.Data("Others", 10));  
	    return list;  
	}  
}  
