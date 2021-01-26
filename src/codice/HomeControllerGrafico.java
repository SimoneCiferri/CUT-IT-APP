package codice;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;


public class HomeControllerGrafico {
	
	private BorderPane mainLayout = null;
	private static ToolBar tb;
	
	@FXML
	private BorderPane bPane;
	
	@FXML
	private ToolBar TBar;
	
	@FXML
	private Button homeButton;
	
	@FXML
	private Button favButton;
	
	@FXML
	private Button appointmentButton;
	
	@FXML
	private MenuButton userMenuButton;
	
	@FXML
	private Button promotionButton;
	
	@FXML
	private AnchorPane aPane;
	
	
	
	public boolean initialize() {
		Image image = new Image("codice/immagini/mainBackground.png", 1100, 800, true, false);
		BackgroundImage sfondo = new BackgroundImage(image, null, null, null, null);
		bPane.setBackground(new Background(sfondo));
		
		setToolbar(TBar);
		
		return false;
	}
	
	@FXML
	public boolean goHome() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("homeView.fxml"));
		mainLayout.setCenter(homeLayout);
		System.out.println("Home Button pressed");
		return true;
	}
	
	
	
	public static void setToolbar(ToolBar toolbar) {
		tb = toolbar;
	}
	
	public static ToolBar getToolbar() {
		return tb;
	}
	
	
	
}
