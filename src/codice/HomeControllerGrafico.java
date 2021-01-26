package codice;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

public class HomeControllerGrafico {
	
	private BorderPane mainLayout = MainView.getPrLayout();
	private String style = "-fx-text-fill: #000000";
	private String backgroundStyle = "-fx-background-radius: 10";
	
	@FXML
	private BorderPane bPane;
	
	public boolean initialize() {
		Image image = new Image("codice/immagini/mainBackground.png", 1100, 800, true, false);
		BackgroundImage sfondo = new BackgroundImage(image, null, null, null, null);
		
		
		bPane.setBackground(new Background(sfondo));
		
		return false;
	}
	
}
