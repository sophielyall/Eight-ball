package application;

import java.util.Random;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class eightBallController extends Application{

	@FXML private TextField questionText;
	@FXML private Label answerLabel;
	String answer;
	int num;
	public eightBallController() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
    @Override
    public void start(Stage stage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
    
        Scene scene = new Scene(root);
    
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
	}
    
    public void askQuestion() {
    	
    	//getting a random number betweeen 0 and 7.
    	Random rand = new Random();
    	num = rand.nextInt(8);
    	
    	//deciding which answer will be shown.
    	switch(num){
    	  case 0 :
    	 answer = "It is certain";
    	  break;
    	  case 1: 
    		  answer ="It is decidedly so";
    	  break;
    	  case 2: 
    		  answer = "Reply hazy try again";
    	  break;
    	  case 3:
    		  answer ="Cannot predict now";
    	  case 4:
    		  answer = "Do not count on it";
    	  break;
    	  case 5:
    		  answer ="My sources say no";
    	  break;
    	  case 6:
    		  answer ="Outlook not so good";
    	  break;
    	  case 7:
    		  answer ="Signs point to yes";
    	  break;
    	  default :
    		  answer = "try again";
    	}
    	
    	//display result in label.
    	answerLabel.setText(answer);
    }

}
