package mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControllerClass {

	// Label
	@FXML
	private Label employeeIdLabel;
	@FXML
	private Label firstNameLabel;
	@FXML
	private TextField arg1;
	@FXML
	private TextField arg2;	
	@FXML
	private TextField wynik;	
	
	
	@FXML private void initialize() {
		arg1.setText("0");
		arg2.setText("0");
		wynik.setText("0");
		
	}
	
	@FXML private void wylicz(){
		wynik.setText(""+(Integer.parseInt(arg1.getText()) + Integer.parseInt(arg2.getText())));
	}
}
