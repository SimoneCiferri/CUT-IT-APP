package logic.view.views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import logic.view.MainView;

public class StartWithNavBarControllerGrafico {
	
	private BorderPane mainLayout = null;
	private static ToolBar tb;
	private String transparentStyle = "-fx-background-color: transparent; ";
	private String pageFlagStyle = "-fx-background-color: #707070; -fx-text-fill: #FFFFFF; ";
	
	@FXML
	private BorderPane bPane;
	
	@FXML
	private ToolBar tBar;
	
	@FXML
	private Button homeButton;
	
	@FXML
	private Button promotionButton;
	
	@FXML
	private Button loginSignupButton;
	
	@FXML
	private AnchorPane aPane;
	
	@FXML
	private Button startButton;
	
	public boolean initialize() throws IOException {
		Image image = new Image("logic/Files/mainBackground.png", 1100, 800, true, false);
		BackgroundImage sfondo = new BackgroundImage(image, null, null, null, null);
		bPane.setBackground(new Background(sfondo));
		
		setToolbar(tBar);
		
		return false;
	}
	
	@FXML
	public boolean goHome() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("views/homeView.fxml"));
		mainLayout.setCenter(homeLayout);
		homeButton.setStyle(pageFlagStyle);
		promotionButton.setStyle(transparentStyle);
		
		System.out.println("Home Button pressed");
		return true;
	}
	
	
	
	@FXML
	public boolean goProm() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("views/promotionInfo.fxml"));
		mainLayout.setCenter(homeLayout);
		homeButton.setStyle(transparentStyle);
		promotionButton.setStyle(pageFlagStyle);
		System.out.println("PromotionInfo Button pressed");
		return true;
	}
	
	@FXML
	public boolean goLogin() throws IOException {
		BorderPane homeLayout = null;
		mainLayout= MainView.getPrLayout();
		homeLayout = FXMLLoader.load(MainView.class.getResource("views/login.fxml"));
		mainLayout.setCenter(homeLayout);
		homeButton.setStyle(transparentStyle);
		promotionButton.setStyle(transparentStyle);
		System.out.println("Login or SignUp Button pressed");
		return true;
	}
	
	public static void setToolbar(ToolBar toolbar) {
		tb = toolbar;
	}
	
	public static ToolBar getToolbar() {
		return tb;
	}
	
	
}
