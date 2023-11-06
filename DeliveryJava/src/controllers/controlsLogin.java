package controllers;
import java.util.ArrayList;

import application.App;
import entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class controlsLogin {
	
    @FXML private Button buttonLogin;
    @FXML private Button buttonRegister;
    @FXML private TextField textUser;
    @FXML private PasswordField textPassword;
	
	private ArrayList<User> users;
	
	public controlsLogin() {
		this.users = new ArrayList<User>();
		users.add(new User("client", "client"));
		users.add(new User("admin", "admin", "ADMIN"));
	}
	
	public void registerUser(String username, String password) {
		
			if(existingUser(username) == false) {
				users.add(new User(username, password));
				alerts.showAlert("Cadastro", null, "Usuário Cadastrado:\nlogin: " + username + "\nsenha: " + password, AlertType.CONFIRMATION);
			}else {
				alerts.showAlert("Cadastro", null, "Usuário já cadastrado!\nTente novamente.", AlertType.CONFIRMATION);
			}
	}
	
	public Boolean loginUser(String username, String password) {
		for(int i = 0; i < users.size(); i++) {
			if(username.equals(users.get(i).getUsuario()) && password.equals(users.get(i).getSenha())){
				return true;
			}
		}
		return false;
	}
	
	public Integer indexUser(String username) {
		for (int i = 0; i < users.size(); i++) {
		    if (username.equals(users.get(i).getUsuario())) {
		        return i;
		    }
		}
		return null;
	}
	
	public Boolean existingUser(String username) {
		for (int i = 0; i < users.size(); i++) {
			if (username.equals(users.get(i).getUsuario()) || username == "") {
				return true;
			}
		}
			return false;
	}
		
	
    @FXML protected void actionButtonLogin(ActionEvent e) {
    	try {
    		String user = textUser.getText();
        	String password = textPassword.getText();
        	String screen = users.get(indexUser(user)).getPermisao();
        	
        	if(loginUser(user, password) == true) {
        		App.changeScreen(screen);
        	}else {
        		alerts.showAlert("Login", null, "Usuário ou senha incorretos.", AlertType.CONFIRMATION);
        	}
    	}catch (Exception e2) {
			alerts.showAlert("Login", null, "Usuário ou senha incorretos.", AlertType.CONFIRMATION);	
		}  	
    }
   
    
	@FXML protected void actionButtonRegister(ActionEvent e) {
		String user = textUser.getText();
    	String password = textPassword.getText();
		registerUser(user, password);  	
		
	}  

}

