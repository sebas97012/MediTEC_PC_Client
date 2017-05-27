package application;

/**
 * Created by sebas97012 on 5/27/17.
 */

import HTTP_Handling.ApacheHttpClient;
import HTTP_Handling.DTO.DoctorDTO;
import HTTP_Handling.JsonManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignInController {

    @FXML
    private TextField username_input;

    @FXML
    private PasswordField id_input;

    @FXML
    private PasswordField password_input;

    @FXML
    private Button Register_button;

    @FXML
    void register(ActionEvent event) {
        JsonManager manager = new JsonManager();
        DoctorDTO doctor = new DoctorDTO(Integer.parseInt(id_input.getText()));
        doctor.setPassword(password_input.getText());
        doctor.setName(username_input.getText());
        String json = manager.objectToJson(doctor);
        MainScreenController.label_= "Your personal ID is:"+doctor.getId();
        ApacheHttpClient.httpPost("http://"+MainScreenController.IP+"/MediTEC/doctors",json);
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
            Scene scene1 = new Scene(root,1000,720);
            Main.window.setScene(scene1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}