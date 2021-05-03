package application;

import java.util.ResourceBundle;

import Modelo.DataBase;
import Modelo.User;
import Modelo.anime;
import Modelo.animelist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	anime ani;
	DataBase data;
	@FXML
    private TextField name;

    @FXML
    private PasswordField pass;
	@FXML
    void login(ActionEvent event) throws Exception {
		animelist aList = new animelist();
		User u;
		String nombre = this.name.getText();
		String password = this.pass.getText();
		u= aList.getUser(nombre, password);
	}

    

    @FXML
    void register(ActionEvent event) throws Exception {
    	animelist aList = new animelist();
    	
    	String name = this.name.getText();
		String pass = this.pass.getText();
    	aList.newUser(name, pass);
    }

    
    public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
    	try {
			data = new DataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }
}
