package charts.stackedAreaChart;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.CategoryAxis;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.StackedAreaChart;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;  

public class StackedAreaChartExample extends Application{  
	
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	    // Configuring Xaxis and Yaxis   
	    CategoryAxis xaxis = new CategoryAxis();  
	    NumberAxis yaxis = new NumberAxis(100,700,50);  
	    xaxis.setLabel("Month");  
	    yaxis.setLabel("Sales Value (lacs)");  
	      
	    //Creating StackedAreaChart   
	    StackedAreaChart stack = new StackedAreaChart(xaxis,yaxis);  
	    stack.setTitle("Sales Comparison between the year 2016 and 2017");  
	      
	    //Configuring Series 1   
	    XYChart.Series year1 = new XYChart.Series<>();  
	    year1.getData().add(new XYChart.Data("Jan",140));  
	    year1.getData().add(new XYChart.Data("Feb",110));  
	    year1.getData().add(new XYChart.Data("Mar",125));  
	    year1.getData().add(new XYChart.Data("Apr",130));  
	    year1.getData().add(new XYChart.Data("May",180));  
	    year1.getData().add(new XYChart.Data("Jun",120));  
	    year1.getData().add(new XYChart.Data("Jul",133));  
	    year1.getData().add(new XYChart.Data("Aug",200));  
	    year1.getData().add(new XYChart.Data("Sep",230));  
	    year1.getData().add(new XYChart.Data("Oct",250));  
	    year1.getData().add(new XYChart.Data("Nov",255));  
	    year1.getData().add(new XYChart.Data("Dec",390));  
	      
	    //adding series1 to the stackedareachart   
	    stack.getData().add(year1);  
	    year1.setName("2017");  
	      
	    //Configuring Series 2   
	    XYChart.Series year2 = new XYChart.Series<>();  
	    year2.getData().add(new XYChart.Data("Jan",200));  
	    year2.getData().add(new XYChart.Data("Feb",210));  
	    year2.getData().add(new XYChart.Data("Mar",225));  
	    year2.getData().add(new XYChart.Data("Apr",430));  
	    year2.getData().add(new XYChart.Data("May",180));  
	    year2.getData().add(new XYChart.Data("Jun",334));  
	    year2.getData().add(new XYChart.Data("Jul",143));  
	    year2.getData().add(new XYChart.Data("Aug",400));  
	    year2.getData().add(new XYChart.Data("Sep",431));  
	    year2.getData().add(new XYChart.Data("Oct",359));  
	    year2.getData().add(new XYChart.Data("Nov",155));  
	    year2.getData().add(new XYChart.Data("Dec",190));  
	      
	    //Adding Series2 to the StackedAreaChart  
	    stack.getData().add(year2);  
	    year2.setName("2016");  
	      
	      
	    //Configuring group and Scene   
	    Group root = new Group();  
	    root.getChildren().add(stack);  
	    Scene scene = new Scene(root,600,400);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("StackedAreaChart Example");  
	    primaryStage.show();          
	      
	}  
	
	public static void main(String[] args) {  
	    launch(args);  
	}
}  
