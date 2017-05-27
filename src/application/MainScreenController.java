package application;

import HTTP_Handling.DTO.Appointment;
import HTTP_Handling.DTO.ClinicalCase;
import datastructures.binarytree.BinaryNode;
import datastructures.binarytree.BinaryTree;
import datastructures.linkedlist.LinkedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;
import sun.reflect.generics.tree.Tree;

import static javafx.scene.input.KeyCode.T;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {

    public static String IP;
    public static String label_;

    @FXML
    private TreeView<String> treeView;

    @FXML
    private Label bottom_label = new Label();

    @FXML
    private ListView<String> schedule_area;

    @FXML
    private VBox layout;

    @FXML
    private Button update_button;

    @FXML
    private ListView<String> chatField;

    @FXML
    private TextField chat_input;

    @FXML
    private Button sendButtton;

    @FXML
    private Button update_cc;

    private LinkedList<String> listaChat;

    @FXML
    void updateSchedule(ActionEvent event) {
        //LinkedList<Appointment> ListaCitasRecibida = ;
        schedule_area.getItems().clear();
        schedule_area.getItems().addAll("Hola","Ja");
    }

    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run(){
            //get del chat
        }
        });

    @FXML
    void updateChat(ActionEvent event){
        String textoChat = chat_input.getText();
        chatField.getItems().clear();
        chatField.getItems().addAll("a");
        chatField.getItems().addAll(textoChat);


        //listaChat = new LinkedList<>();
        listaChat.insertAtFirst(textoChat);
    }

    @FXML
    void updateCases(ActionEvent event) {
        //BinaryTree casos = ;

        //BinaryNode[] casos = []
        //for (){
        TreeItem<String> root,a,b;

        root = new TreeItem<>();
        root.setExpanded(true);

        a = makeBranch("aaaaa",root);
        makeBranch("aaaab",a);
        makeBranch("aaabb",a);
        makeBranch("aabbb",a);

        b = makeBranch("bbbbb",root);
        makeBranch("baaaa",b);
        makeBranch("bbaaa",b);

        treeView.setShowRoot(false);
        treeView.setRoot(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bottom_label.setText(label_);
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}