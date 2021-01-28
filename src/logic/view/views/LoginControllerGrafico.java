package logic.view.views;


import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Button;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import logic.view.MainView;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

public class LoginControllerGrafico {
	
	private BorderPane mainLayout = MainView.getPrLayout();
	private  ToolBar tb=StartWithNavBarControllerGrafico.getToolbar();
	private String style = "-fx-text-fill: #000000";
	private String backgroundStyle = "-fx-background-radius: 10";
	
	@FXML
	private TextField usernameTextField;

	@FXML
	private PasswordField password;

	@FXML
	private Button loginBtn;
	
	@FXML 
	private Button signupBtn;
	
	@FXML
	private Label username;
	
	@FXML
	private Label passwordLabel;
	
	@FXML
	private BorderPane pane;
	
	@FXML
	private Label title;
	
	@FXML
	private Button backHome;
	
	@FXML
	public boolean initialize() {
		tb.setVisible(false);
		title.setText("CUT-IT");
		title.setTranslateX(-130);
		title.setTranslateY(10);
		title.setFont(new Font("Arial", 70));
		title.setStyle(style);
		
		username.setStyle(style);
		passwordLabel.setStyle(style);
		usernameTextField.setStyle(backgroundStyle);
		password.setStyle(backgroundStyle);
		loginBtn.isUnderline();
		loginBtn.setStyle(backgroundStyle);
		signupBtn.setStyle(backgroundStyle);
		signupBtn.setStyle("-fx-background-color:  #b51c1c");
		
		
		loginBtn.setOnAction((new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ev) {
				System.out.println("Login Button pressed");
			}
		}));
		
		signupBtn.setOnAction((new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ev) {
				System.out.println("SignUp Button pressed");
			}
		}));
		
		return false;
	}
	
}
