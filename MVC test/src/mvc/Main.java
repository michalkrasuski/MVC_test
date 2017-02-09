package mvc;

import java.io.IOException;
import java.util.Optional;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {

		ViewLoader<AnchorPane, Object> viewLoader = new ViewLoader<AnchorPane, Object>("Main.fxml");
		AnchorPane anchorPane = viewLoader.getLayout();
		Scene scene = new Scene(anchorPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pracownicy");
		//primaryStage.setOnHiding(e -> primaryStage_Hiding(e));
		//primaryStage.setOnCloseRequest(e -> primaryStage_CloseRequest(e));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	void primaryStage_Hiding(WindowEvent e) {

	}

	void primaryStage_CloseRequest(WindowEvent e) {

			e.consume();
	}

}
