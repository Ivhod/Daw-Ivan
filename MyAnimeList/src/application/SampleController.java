package application;

import java.util.ResourceBundle;

import Modelo.DataBase;
import Modelo.User;
import Modelo.anime;
import Modelo.animelist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class SampleController implements Initializable {
	anime ani;
	DataBase data;
	@FXML
    private TextField name;
	@FXML
    private Label error;
	@FXML
    private Label login;
	@FXML
    private Label register;

    @FXML
    private PasswordField pass;
	@FXML
    void login(ActionEvent event) throws Exception {
		animelist aList = new animelist();
		User u;
		String name = this.name.getText();
		String pass = this.pass.getText();
		u= aList.getUser(name, pass);
		
		if (u != null) {
			insideSystem(aList, u);
			Main.showLoginStage();
			
		} else
			error.setOpacity(1);
			login.setOpacity(0);
    }
	
	@FXML
    void register(ActionEvent event) throws Exception {
    	animelist aList = new animelist();
    	String name = this.name.getText();
		String pass = this.pass.getText();
//    	aList.newUser(name, pass);
		if(!aList.checkUser(name)){
			aList.newUser(name, pass);
			login.setOpacity(1);
    		error.setOpacity(0);
    	}else
			register.setOpacity(1);
			login.setOpacity(0);
			error.setOpacity(0);
	
    }

	private void insideSystem(animelist aList, User u) {
		// TODO Auto-generated method stub
		
	}
    public void initialize(java.net.URL arg0, ResourceBundle arg1){
		// TODO Auto-generated method stub
    	try {
			data = new DataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
