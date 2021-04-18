package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import Modelo.Ahorcado;
import Modelo.Dictionary;
import Modelo.HangMan;

public class SampleController implements Initializable{
	
	HangMan hm;//= new Ahorcado(new Dictionary().getRandomWord());//
	
	Dictionary dic;
	@FXML
    private TextField fallos;

    @FXML
    private Label guiones;
    @FXML
    private Label youwin;
    @FXML
    private Label youloose;

    @FXML
    private ImageView image1;

    @FXML
    void accionOn(ActionEvent event) {
    	Button b=(Button)(event.getSource());
    	char letter = b.getText().charAt(0);
    	if (hm.checkLetter(letter)) {
    		this.guiones.setText(hm.getMask());
    	}
    	else {
    		hm.upFails();
    		
    		this.fallos.setText(String.valueOf(hm.getFails()));
    	}
    	if(hm.getFails()==6) {
    		this.youloose.setOpacity(1);
    	}
    	else {
    		hm.youWin();
    		this.youwin.setOpacity(1);
    		
    	}
    	
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
