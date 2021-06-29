package charts.areaChart;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.chart.AreaChart;  
import javafx.scene.chart.NumberAxis;  
import javafx.scene.chart.XYChart;  
import javafx.stage.Stage;

public class AreaChartExample extends Application {  
	
	@Override  
	public void start(Stage primaryStage) throws Exception {  
	    // TODO Auto-generated method stub  
	    //Configuring X axis and Y axis  
	    NumberAxis xaxis = new NumberAxis(1,12,1);  
	    NumberAxis yaxis = new NumberAxis(10,510,50);  
	    xaxis.setLabel("Month of the year");  
	    yaxis.setLabel("Sales value (lacs)");  
	      
	    //Creating Areachart  
	    AreaChart<Number,Number> area = new AreaChart(xaxis,yaxis);  
	      
	    //Setting title for areachart   
	    area.setTitle("RegionWise Sales");  
	      
	    //Configuring series for North sales   
	    XYChart.Series seriesNorth = new XYChart.Series();  
	    seriesNorth.setName("North");  
	    seriesNorth.getData().add(new XYChart.Data(1,120));  
	    seriesNorth.getData().add(new XYChart.Data(2,140));  
	    seriesNorth.getData().add(new XYChart.Data(3,50));  
	    seriesNorth.getData().add(new XYChart.Data(4,80));  
	    seriesNorth.getData().add(new XYChart.Data(5,150));  
	    seriesNorth.getData().add(new XYChart.Data(6,130));  
	    seriesNorth.getData().add(new XYChart.Data(7,110));  
	    seriesNorth.getData().add(new XYChart.Data(8,90));  
	    seriesNorth.getData().add(new XYChart.Data(9,200));  
	    seriesNorth.getData().add(new XYChart.Data(10,120));  
	    seriesNorth.getData().add(new XYChart.Data(11,100));  
	    seriesNorth.getData().add(new XYChart.Data(12,120));  
	      
	    //Configuring series for East sales   
	    XYChart.Series seriesEast = new XYChart.Series();  
	    seriesEast.setName("East");  
	    seriesEast.getData().add(new XYChart.Data(1,500));  
	    seriesEast.getData().add(new XYChart.Data(2,200));  
	    seriesEast.getData().add(new XYChart.Data(3,300));  
	    seriesEast.getData().add(new XYChart.Data(4,290));  
	    seriesEast.getData().add(new XYChart.Data(5,150));  
	    seriesEast.getData().add(new XYChart.Data(6,120));  
	    seriesEast.getData().add(new XYChart.Data(7,190));  
	    seriesEast.getData().add(new XYChart.Data(8,80));  
	    seriesEast.getData().add(new XYChart.Data(9,100));  
	    seriesEast.getData().add(new XYChart.Data(10,220));  
	    seriesEast.getData().add(new XYChart.Data(11,300));  
	    seriesEast.getData().add(new XYChart.Data(12,220));  
	      
	    //Configuring series for west sales   
	    XYChart.Series seriesWest = new XYChart.Series();  
	    seriesWest.setName("West");  
	    seriesWest.getData().add(new XYChart.Data(1,320));  
	    seriesWest.getData().add(new XYChart.Data(2,40));  
	    seriesWest.getData().add(new XYChart.Data(3,250));  
	    seriesWest.getData().add(new XYChart.Data(4,10));  
	    seriesWest.getData().add(new XYChart.Data(5,190));  
	    seriesWest.getData().add(new XYChart.Data(6,140));  
	    seriesWest.getData().add(new XYChart.Data(7,200));  
	    seriesWest.getData().add(new XYChart.Data(8,190));  
	    seriesWest.getData().add(new XYChart.Data(9,300));  
	    seriesWest.getData().add(new XYChart.Data(10,130));  
	    seriesWest.getData().add(new XYChart.Data(11,400));  
	    seriesWest.getData().add(new XYChart.Data(12,220));  
	      
	    //Configuring series for south sales  
	    XYChart.Series seriesSouth = new XYChart.Series();  
	    seriesSouth.setName("South");  
	    seriesSouth.getData().add(new XYChart.Data(1,220));  
	    seriesSouth.getData().add(new XYChart.Data(2,40));  
	    seriesSouth.getData().add(new XYChart.Data(3,250));  
	    seriesSouth.getData().add(new XYChart.Data(4,180));  
	    seriesSouth.getData().add(new XYChart.Data(5,450));  
	    seriesSouth.getData().add(new XYChart.Data(6,230));  
	    seriesSouth.getData().add(new XYChart.Data(7,110));  
	    seriesSouth.getData().add(new XYChart.Data(8,100));  
	    seriesSouth.getData().add(new XYChart.Data(9,123));  
	    seriesSouth.getData().add(new XYChart.Data(10,125));  
	    seriesSouth.getData().add(new XYChart.Data(11,225));  
	    seriesSouth.getData().add(new XYChart.Data(12,127));  
	      
	    //adding series to the Area chart   
	    area.getData().addAll(seriesNorth,seriesWest,seriesEast,seriesSouth);  
	      
	    //setting Group and Scene   
	    Group root = new Group(area);  
	    Scene scene = new Scene(root,600,400);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("AreaChart Example");  
	    primaryStage.show();  
	}  
	
	public static void main(String[] args) {  
	launch(args);     
	}  
}  
