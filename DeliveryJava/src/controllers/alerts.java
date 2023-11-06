package controllers;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class alerts {
	
	public static void showAlert(String title, String header, String content, AlertType type) {
		 Alert alert = new Alert(type);		
		 alert.setTitle(title);
		 alert.setHeaderText(header);
		 alert.setContentText(content);
		 alert.show();
		 } 
}
