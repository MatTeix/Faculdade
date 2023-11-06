package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
	
	public static Stage stage;
	
	private static Scene Login;
	private static Scene User;
	private static Scene Admin;
		
    @Override
    public void start(Stage primaryStage) throws Exception{
    	  	
    	stage = primaryStage;
        	
        Parent fxmlLogin = FXMLLoader.load(getClass().getResource("/views/viewLogin.fxml"));
        Login = new Scene(fxmlLogin, 500, 220);
        
        Parent fxmlUser = FXMLLoader.load(getClass().getResource("/views/viewUser.fxml"));
        User = new Scene(fxmlUser, 1000, 350);
        
        Parent fxmlAdmin = FXMLLoader.load(getClass().getResource("/views/viewAdmin.fxml"));
        Admin = new Scene(fxmlAdmin, 1000, 350);
        
        primaryStage.setResizable(false);
        primaryStage.setScene(Login);
        Image iconLogin = new Image("/img/icon-login.png");
        primaryStage.getIcons().add(iconLogin);
        primaryStage.show();
             
    }
        
    
    public static void changeScreen(String screen) {
    	switch (screen) {
	    	case "VIEWLOGIN": 
				stage.setScene(Login);
				Image iconLogin = new Image("/img/icon-login.png");
				stage.getIcons().add(iconLogin);
				stage.setTitle("Login");
				break;
				
			case "CLIENT": 
				stage.setScene(User);
				Image iconUser = new Image("/img/icon-client.png");
				stage.getIcons().add(iconUser);
				stage.setTitle("Cliente");
				break;
				
			case "ADMIN":
				stage.setScene(Admin);
				Image iconAdmin = new Image("/img/icon-admin.png");
				stage.getIcons().add(iconAdmin);
				stage.setTitle("Admin");
				break;
		}
	}
		

    public static void main(String[] args) {
        launch(args);
    }
  
}






