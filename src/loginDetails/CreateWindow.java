package loginDetails;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateWindow {

	VBox quizHomePage,resultsHomePage;
	Stage quizStage,resultsStage;
	Button loginButton, registrationOfPersonButton, createQuizButton, quizPageHomeMenuButton;
	TextField UserName, password, emailAddress, phoneNumber;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Stage createQuizWindow(){
		quizHomePage = new VBox(10);
		quizHomePage.setAlignment(Pos.CENTER);
		Stage quizStage = new Stage();
		quizStage.setScene(new Scene(quizHomePage, 500, 500));
		createQuizButton = new Button("Create Quiz");
		quizHomePage.getChildren().add(createQuizButton);
		return quizStage;
	}
	
	public Stage createStaffAdminWindow(){
		quizHomePage = new VBox(10);
		quizHomePage.setAlignment(Pos.CENTER);
		Stage quizStage = new Stage();
		quizStage.setScene(new Scene(quizHomePage, 500, 500));
		quizStage.setTitle("Staff Administration");
		createQuizButton = new Button("Create Quiz");
		quizPageHomeMenuButton = new Button ("Home Menu");
		quizHomePage.getChildren().addAll(createQuizButton, quizPageHomeMenuButton);
		return quizStage;
	}
	
	public Stage createResultsWindow(){
		resultsHomePage = new VBox(10);
		resultsHomePage.setAlignment(Pos.CENTER);
		Stage resultsStage = new Stage();
		resultsStage.setTitle("Registration");
		resultsStage.setScene(new Scene(resultsHomePage, 500, 500));
		new Button("Register");
		UserName = new TextField();
		password = new TextField();
		UserName.setMaxWidth(200);
		password.setMaxWidth(200);
		registrationButton = new Button("Registration");
		resultsHomePage.getChildren().addAll(UserName, password, registrationButton);
		return resultsStage;
	}
	
}
