package ivanmojao;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Circle;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane BP = new BorderPane();
			Circle circle = new Circle();
			circle.setCenterX(100);
			circle.setCenterY(100);
			circle.setRadius(50);
			BP.getChildren().add(circle);
			Scene scene = new Scene(BP,200,200);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

