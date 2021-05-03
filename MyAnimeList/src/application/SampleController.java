package application;

import java.util.ResourceBundle;

import Modelo.DataBase;
import Modelo.User;
import Modelo.anime;
import Modelo.animelist;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController implements Initializable {
	User user;
	anime ani;
	animelist aList;
	DataBase data;
	@FXML
    private TextField name;

    @FXML
    private PasswordField pass;
	@FXML
    void login(ActionEvent event) throws Exception {
		Button l = (Button)(event.getSource());
		aList.getUser(name, pass);
    }

    @FXML
    void register(ActionEvent event) throws Exception {
    	Button r = (Button)(event.getSource());
    	aList.newUser(name, pass);

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
