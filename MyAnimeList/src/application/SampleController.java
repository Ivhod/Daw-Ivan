package application;

import java.util.ResourceBundle;
import Modelo.User;
import Modelo.anime;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	User user;
	anime ani;
	@FXML
    private TextField name;

    @FXML
    private PasswordField pass;
	@FXML
    void login(ActionEvent event) {

    }

    @FXML
    void register(ActionEvent event) {

    }
    public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		user = new User(int, String, null);
		ani = new anime(null, null);

	}
	
}
