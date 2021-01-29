package logic.view.views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import logic.view.MainView;

public class ManagePromotionControllerGrafico {
	
	private BorderPane mainLayout = MainView.getPrLayout();
	
	@FXML
	private BorderPane bHPane;
	
	@FXML
	private ScrollPane sHPane;
	
	@FXML
	private GridPane gPPane;
	
	@FXML
	private Button bringFriendButton;
	
	public boolean initialize() throws IOException {
		
		return false;
		
	}
	
	@FXML
	public boolean bringF() {
		System.out.println("Bring a Friend Button pressed (from HD)");
		return true;
	}
}
