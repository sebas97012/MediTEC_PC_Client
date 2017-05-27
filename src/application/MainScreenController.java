package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainScreenController {
    public static String IP;
    @FXML
    private TreeView<?> treeView;

    @FXML
    private Label bottom_label;

    @FXML
    private ListView<?> schedule_area;

    @FXML
    private Button update_button;

    @FXML
    private ListView<?> chatField;

    @FXML
    private TextField chat_input;

    @FXML
    private Button sendButtton;
    @FXML
    void updateSchedule(ActionEvent event) {

    }


    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}