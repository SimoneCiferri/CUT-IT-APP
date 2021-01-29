package logic.view.views;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import logic.view.MainView;

public class ManageShopPageControllerGrafico {
	
	private BorderPane mainLayout = MainView.getPrLayout();
	
	@FXML
	private BorderPane bHPane;
	
	@FXML
	private ScrollPane sHPane;
	
	public boolean initialize() {
		return true;
	}
	
	
}
