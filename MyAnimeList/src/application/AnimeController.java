package application;

import java.io.IOException;

import Modelo.DataBase;
import Modelo.anime;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class AnimeController {
	anime ani;
	DataBase data;
	
	@FXML
    private ImageView onepiece;

    @FXML
    private ImageView naruto;

    @FXML
    private ImageView dragonball;

    @FXML
    private ImageView tokyo;

    @FXML
    private ImageView fairy;
    
    @FXML
    void clickDragon(MouseEvent event) throws IOException {
    	Main.showDragonStage();
    }

    @FXML
    void clickFairy(MouseEvent event) throws IOException {
    	Main.showFairyStage();
    }

    @FXML
    void clickNaruto(MouseEvent event) throws IOException {
    	Main.showNarutoStage();
    }

    @FXML
    void clickOnepiece(MouseEvent event) throws IOException {
    	Main.showOnePieceStage();

    }

    @FXML
    void clickTokyo(MouseEvent event) throws IOException {
    	Main.showTokyoStage();
    }
	
	

}
