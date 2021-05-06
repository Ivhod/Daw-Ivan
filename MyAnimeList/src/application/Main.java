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
		addLoginStage.initModality(Modality.APPLICATION_MODAL);
		addLoginStage.initOwner(primaryStage);
		
		Scene scene = new Scene(Anime);
		addLoginStage.setScene(scene);
		addLoginStage.showAndWait();
		
	}
	public static void showOnePieceStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("OnePiecevista.fxml"));
		BorderPane OnePiece = loader.load();
		Stage addOnePieceStage = new Stage();
		addOnePieceStage.setTitle("One Piece");
		addOnePieceStage.initModality(Modality.APPLICATION_MODAL);
		addOnePieceStage.initOwner(primaryStage);
		
		Scene scene = new Scene(OnePiece);
		addOnePieceStage.setScene(scene);
		addOnePieceStage.showAndWait();
		
	}
	public static void showNarutoStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("NarutoVista.fxml"));
		BorderPane Naruto = loader.load();
		Stage addNarutoStage = new Stage();
		addNarutoStage.setTitle("Naruto");
		addNarutoStage.initModality(Modality.APPLICATION_MODAL);
		addNarutoStage.initOwner(primaryStage);
		
		Scene scene = new Scene(Naruto);
		addNarutoStage.setScene(scene);
		addNarutoStage.showAndWait();
		
	}
	public static void showDragonStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("DragonVista.fxml"));
		BorderPane DragonBall = loader.load();
		Stage addDragonStage = new Stage();
		addDragonStage.setTitle("Dragon Ball Z");
		addDragonStage.initModality(Modality.APPLICATION_MODAL);
		addDragonStage.initOwner(primaryStage);
		
		Scene scene = new Scene(DragonBall);
		addDragonStage.setScene(scene);
		addDragonStage.showAndWait();
		
	}
	public static void showTokyoStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("TokyoVista.fxml"));
		BorderPane TokyoGhoul = loader.load();
		Stage addTokyoStage = new Stage();
		addTokyoStage.setTitle("Tokyo Ghoul");
		addTokyoStage.initModality(Modality.APPLICATION_MODAL);
		addTokyoStage.initOwner(primaryStage);
		
		Scene scene = new Scene(TokyoGhoul);
		addTokyoStage.setScene(scene);
		addTokyoStage.showAndWait();
		
	}
	public static void showFairyStage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("FairyVista.fxml"));
		BorderPane FairyTail = loader.load();
		Stage addFairyStage = new Stage();
		addFairyStage.setTitle("Fairy Tail");
		addFairyStage.initModality(Modality.APPLICATION_MODAL);
		addFairyStage.initOwner(primaryStage);
		
		Scene scene = new Scene(FairyTail);
		addFairyStage.setScene(scene);
		addFairyStage.showAndWait();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
