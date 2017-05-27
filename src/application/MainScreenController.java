package application;

import HTTP_Handling.DTO.Appointment;
import HTTP_Handling.DTO.ClinicalCase;
import datastructures.binarytree.BinaryNode;
import datastructures.binarytree.BinaryTree;
import datastructures.linkedlist.LinkedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class MainScreenController {
    public static String IP;
    @FXML
    private TreeView<ClinicalCase> treeView;

    @FXML
    private Label bottom_label;

    @FXML
    private ListView<String> schedule_area;

    @FXML
    private VBox layout;

    @FXML
    private Button update_button;

    @FXML
    private ListView<?> chatField;

    @FXML
    private TextField chat_input;

    @FXML
    private Button sendButtton;

    @FXML
    private Button update_cc;

    @FXML
    void updateSchedule(ActionEvent event) {
        //LinkedList<Appointment> ListaCitasRecibida = ;
        schedule_area.getItems().addAll("Hola","Ja");
    }

    @FXML
    void updateCases(ActionEvent event){
        //BinaryTree casos = ;

        //for
        TreeItem<String> root;
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}