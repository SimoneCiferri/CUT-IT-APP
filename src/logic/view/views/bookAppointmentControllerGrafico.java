package logic.view.views;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import logic.view.MainView;

public class bookAppointmentControllerGrafico {
	
	private BorderPane mainLayout = MainView.getPrLayout();
	
	@FXML
	private BorderPane bHPane;
	
	@FXML
	private ScrollPane sHPane;
	
	
	public boolean initialize() throws IOException {
		return false;
		
	}
}
