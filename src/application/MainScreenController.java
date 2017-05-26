package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;

public class MainScreenController {

    @FXML
    private TreeView<?> treeView;

    @FXML
    private Label bottom_label;

    @FXML
    private ListView<?> chatField;

    @FXML
    private TextField chat_input;

    @FXML
    private Button sendButtton;

}