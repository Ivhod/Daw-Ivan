package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import Modelo.HangMan;
import Modelo.Dictionary;
import Modelo.HangMan;

public class SampleController implements Initializable {

	HangMan hm;
	Dictionary dic;
	@FXML
	private Label fallos;

	@FXML
	private GridPane teclado;

	@FXML
	private Label guiones;
	@FXML
	private Label youwin;
	@FXML
	private Label youloose;

	@FXML
	private ImageView image1;
	
	@FXML
    private ImageView image2;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private ImageView image5;

    @FXML
    private ImageView image6;

	@FXML
	void accionOn(ActionEvent event) {
		Button b = (Button) (event.getSource());
		char letter = b.getText().charAt(0);
		if (hm.checkLetter(letter)) {
			this.guiones.setText(hm.getMask());
			if (hm.youWin()) {
				this.youwin.setOpacity(1);
				this.teclado.setDisable(true);
			}
		} else {
			hm.upFails();
			this.fallos.setText(String.valueOf(hm.getFails()));
//			if (hm.getFails() == 6) {
//				this.youloose.setOpacity(1);
//				
//			}
			switch(hm.getFails()) {
			case 1:
				this.image1.setVisible(true);
				break;
			case 2:
				this.image2.setVisible(true);
				this.image1.setVisible(false);
				break;
			case 3:
				this.image3.setVisible(true);
				this.image2.setVisible(false);
				break;
			case 4:
				this.image4.setVisible(true);
				this.image3.setVisible(false);
				break;
			case 5:
				this.image5.setVisible(true);
				this.image4.setVisible(false);
				break;
			case 6:
				this.image6.setVisible(true);
				this.image5.setVisible(false);
				this.youloose.setOpacity(1);
				this.teclado.setDisable(true);
			}
		}
		b.setDisable(true);

	}

	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		dic = new Dictionary();
		hm = new HangMan(dic.getRandomWord());
		this.guiones.setText(hm.getMask());
		this.fallos.setText(String.valueOf(hm.getFails()));

	}

}
