module ivanmojao {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens ivanmojao to javafx.graphics, javafx.fxml;
}