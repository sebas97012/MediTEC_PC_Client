package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	static Stage window;
	@Override
	public void start(Stage primaryStage) {
		try {
			window=primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
			Scene scene = new Scene(root,650,400);
			window.setTitle("DrApp");
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
