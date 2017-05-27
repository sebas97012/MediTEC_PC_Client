package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class logIn_controller {

    @FXML
    private TextField username_input;

    @FXML
    private PasswordField password_input;

    @FXML
    private TextField ip_input;

    @FXML
    private Button logIn_button;
    @FXML
    void SignIn(ActionEvent event) {
        MainScreenController.IP = ip_input.getText();
        System.out.print(MainScreenController.IP);

    }

    @FXML
    void logIn(ActionEvent event) {
    	MainScreenController.IP = ip_input.getText();
    	System.out.print(MainScreenController.IP);
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
			Scene scene1 = new Scene(root,1000,720);
			Main.window.setScene(scene1);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }

}
 