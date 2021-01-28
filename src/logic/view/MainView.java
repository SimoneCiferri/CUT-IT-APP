package logic.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView extends Application {
	
	
	private static Stage prStage;
	private static BorderPane prLayout;
	private boolean Running=false;
	
	@Override
	public void start(Stage stage) throws Exception {
		setMainLayout(stage);
		prStage.setTitle("CUT-IT");
		
		startPrLayout();
		
		Scene scene = new Scene(prLayout);
		prStage.setScene(scene);
		prStage.show();
		prStage.setResizable(false);
		
	}
	
	public static boolean startPrLayout() throws IOException {
		prLayout = FXMLLoader.load(MainView.class.getResource("views/startWithNavBar.fxml"));
		return true;
	}
	
	public static void setPrLayout(BorderPane prL) {
		prLayout=prL;
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
