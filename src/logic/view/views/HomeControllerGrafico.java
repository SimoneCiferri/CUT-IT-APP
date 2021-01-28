package logic.view.views;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import logic.view.MainView;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	private BorderPane bHPane;
	
	@FXML
	private ScrollPane sHPane;
	
	@FXML
	private ToolBar ndToolbar;
	
	@FXML
	private TextField searchField;
	
	@FXML
	private ChoiceBox<String> gChoice;
	
	@FXML
	private ChoiceBox<String> pChoice;
	
	@FXML
	private Button searchButton;
	
	public boolean initialize() throws IOException {
		
		gChoice.setValue("Chi ?");	
		gChoice.setItems(FXCollections.observableArrayList("Donna", "Uomo"));
		pChoice.setValue("Dove ?");	
		pChoice.setItems(FXCollections.observableArrayList("Milano", "Roma" , "La mia posizione"));
		
		return false;
		
	}
	
	@FXML
	public boolean serachShop() {
		System.out.println("Search Shop Button pressed");
		return true;
	}
}
