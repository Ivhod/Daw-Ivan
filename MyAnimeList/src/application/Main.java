package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,700,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void showLoginStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Anime.fxml"));
		BorderPane Anime = loader.load();
		
		Stage addLoginStage = new Stage();
		addLoginStage.setTitle("MyAnimeList");
		addLoginStage.initModality(Modality.WINDOW_MODAL);
		addLoginStage.initOwner(primaryStage);
		
		Scene scene = new Scene(Anime);
		addLoginStage.setScene(scene);
		addLoginStage.showAndWait();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
