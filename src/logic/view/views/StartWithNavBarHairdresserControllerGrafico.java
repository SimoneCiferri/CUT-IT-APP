package logic.view.views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import logic.view.MainView;

public class StartWithNavBarHairdresserControllerGrafico {
	
	private BorderPane mainLayout = null;
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
	private Button goAppointment;
	
	@FXML
	private Button logoutH;
	
	@FXML
	private MenuButton userMenuButtonHairdr;
	
	public boolean initialize() throws IOException {
		Image image = new Image("logic/Files/mainBackground.png", 1100, 800, true, false);
		BackgroundImage sfondo = new BackgroundImage(image, null, null, null, null);
		bPaneHairdr.setBackground(new Background(sfondo));
		
		setToolbar(tBarHairdr);
		return false;
		
	}
	
	@FXML
	public boolean goShop() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("views/ShopHairdresser.fxml"));
		mainLayout.setCenter(homeLayout);
		shopButton.setStyle(pageFlagStyle);
		appointmentHairdresserButton.setStyle(transparentStyle);
		promotionHairdresserButton.setStyle(transparentStyle);
		System.out.println("Shop Button pressed");
		return true;
	}
	
	@FXML
	public boolean goAppHairdr() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("views/AppointmentHairDresser.fxml"));
		mainLayout.setCenter(homeLayout);
		shopButton.setStyle(transparentStyle);
		appointmentHairdresserButton.setStyle(pageFlagStyle);
		promotionHairdresserButton.setStyle(transparentStyle);
		System.out.println("Hairdresser Appointment Button pressed");
		return true;
	}
	
	@FXML
	public boolean goPromHairdr() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("views/PromotionHairdresser.fxml"));
		mainLayout.setCenter(homeLayout);
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
	
	public static void setToolbar(ToolBar toolbar) {
		tb = toolbar;
	}
	
	public static ToolBar getToolbar() {
		return tb;
	}
}
