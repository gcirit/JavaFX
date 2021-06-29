module FXFeatures {
	requires javafx.controls;
	
	opens hello to javafx.graphics, javafx.fxml;
}
