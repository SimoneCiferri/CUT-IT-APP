package logic.view.views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import logic.view.MainView;

public class StartWithNavBarHairdresserControllerGrafico {
	
	private BorderPane mainLayout = MainView.getPrLayout();
	private static ToolBar tb;
	private String transparentStyle = "-fx-background-color: transparent; ";
	private String pageFlagStyle = "-fx-background-color: #707070; -fx-text-fill: #FFFFFF; ";
	
	@FXML
	private BorderPane bPaneHairdr;
	
	@FXML
	private AnchorPane aPaneHairdr;
	
	@FXML
	private ToolBar tBarHairdr;
	
	@FXML
	private Button shopButton;
	
	@FXML
	private Button appointmentHairdresserButton;
	
	@FXML
	private Button promotionHairdresserButton;
	
	@FXML
	private Button logoutH;
	
	@FXML
	private MenuButton userMenuButtonHairdr;
	
	public boolean initialize() throws IOException {
		
		return false;
		
	}
	
	@FXML
	public boolean goShop() {
		shopButton.setStyle(pageFlagStyle);
		appointmentHairdresserButton.setStyle(transparentStyle);
		promotionHairdresserButton.setStyle(transparentStyle);
		System.out.println("Shop Button pressed");
		return true;
	}
	
	@FXML
	public boolean goAppHairdr() {
		shopButton.setStyle(transparentStyle);
		appointmentHairdresserButton.setStyle(pageFlagStyle);
		promotionHairdresserButton.setStyle(transparentStyle);
		System.out.println("Hairdresser Appointment Button pressed");
		return true;
	}
	
	@FXML
	public boolean goPromHairdr() {
		shopButton.setStyle(transparentStyle);
		appointmentHairdresserButton.setStyle(transparentStyle);
		promotionHairdresserButton.setStyle(pageFlagStyle);
		System.out.println("Hairdresser Promotion Button pressed");
		return true;
	}
	
	@FXML
	public boolean logout() {
		System.out.println("Hairdresser logout Button pressed");
		return true;
	}
}
