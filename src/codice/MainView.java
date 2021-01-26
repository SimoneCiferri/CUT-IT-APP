package codice;

import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView extends Application {
	
	private boolean Running=false;
	private static Stage prStage;
	private static BorderPane prLayout;
	private BorderPane homeLayout = null;
	private BorderPane signupLayout = null;
	private BorderPane statusBar = null;
	
	@Override
	public void start(Stage stage) throws Exception {
		setMainLayout(stage);
		prStage.setTitle("CUT-IT");
		startPrLayout();
		
		
		startPrLayout();
		
		Scene scene = new Scene(prLayout);
		prStage.setScene(scene);
		prStage.show();
		prStage.setResizable(false);
		
	}
	
	public static boolean startPrLayout() throws IOException {
		prLayout = FXMLLoader.load(MainView.class.getResource("navBar.fxml"));
		return true;
	}
	
	public static void setMainLayout(Stage stage1) {
		prStage=stage1;
	}
	
	public static BorderPane getPrLayout() {
		return prLayout;
	}
	
	public static Stage getPrWindow() {
		return prStage;
	}
	
	public boolean isRunning() {
		return Running;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
