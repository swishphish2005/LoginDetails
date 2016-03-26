package loginDetails;



import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application implements EventHandler<ActionEvent>{

	StackPane login1;
	Stage loginStage;
	Scene loginScene;
	Button loginButton, registrationButton;
	TextField userNameInput, passwordInput;
	private static	CreateWindow createWindow = new CreateWindow();
	private static	ArrayStorage myArrayStorage = new ArrayStorage();
	
	
	private static	ArrayList<String> studentUserNames = myArrayStorage.getArrayUserNameValues();
	private static 	ArrayList<String> studentPasswords = myArrayStorage.getArrayPasswordValues();
	private static ArrayList <String> staffUserNames = myArrayStorage.getArrayStaffUserNames();
	private static ArrayList <String> staffPasswords = myArrayStorage.getArrayStaffPasswords();
	
	
	public static void main(String[] args) {
		myArrayStorage.setArrayStudentPasswordValues();
		myArrayStorage.setArrayStudentUserNameValues();
		myArrayStorage.setArrayStaffUserNames();
		myArrayStorage.setArrayStaffPasswords();
		launch(args);
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//createWindow.createMainWindow(primaryStage).show();
		
		HBox mainMenu = new HBox(10);
		mainMenu.setSpacing(20.00);
		
		mainMenu.setAlignment(Pos.CENTER);
		loginButton = new Button("Login");
		registrationButton = new Button ("Registration");
		userNameInput = new TextField();
		passwordInput = new TextField();
		mainMenu.setPadding(new Insets(0, 20, 10, 20));
		primaryStage.setScene(new Scene(mainMenu, 600, 500));
		primaryStage.setTitle("Login");
		mainMenu.getChildren().addAll(loginButton, registrationButton, userNameInput,passwordInput);
		primaryStage.show();
		
		loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) { 
              if(studentUserNames.contains(userNameInput.getText()) && studentPasswords.contains(passwordInput.getText())){
            	  createWindow.createQuizWindow().show();
            	  primaryStage.close(); 
            } else if (staffUserNames.contains(userNameInput.getText()) && staffPasswords.contains(passwordInput.getText())){
            	createWindow.createStaffAdminWindow().show();
            	primaryStage.close();
            } else {
            	Label incorrect = new Label("Sorry Incorrect User Name/Password");
            	mainMenu.getChildren().add(incorrect);
            }
        }});
		
		
		//createWindow.createStaffAdminWindow().addEventHandler(eventType, eventHandler);
		//createWindow.createStaffAdminWindow().
		//createWindow.createQuizWindow().onCloseRequestProperty(){
			
		//}

		createWindow.registrationOfPersonButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				createWindow.createResultsWindow().show();
			}
		});
		
		
		registrationButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
               
               createWindow.createResultsWindow().show();
            }
        });
		
		
		
		
	}

}
