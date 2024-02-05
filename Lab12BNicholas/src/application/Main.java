/*     
 * Lab12_BNicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor,
 * while the rest were all of my own.
 * 
 * Purpose: Mathdrill
 * 
 * @author (Nicholas Sin)
 * @version (04/15/2023) 
 * Revised (4/20/2023)
 */
package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.util.Random;

public class Main extends Application {
	
	Random random = new Random();
	int num1 = random.nextInt(10) + 1;
	int num2 = random.nextInt(10) + 1;
    int answer = num1 + num2;
    
	@Override
	public void start(Stage primaryStage) {
		
		Label solveThis = new Label("Solve This: ");
		Label add = new Label("+");
		Label dashes = new Label("-----------");
		Label number1 = new Label("" + num1);
		Label number2 = new Label("" + num2);
		Label result = new Label(""); 
	
		Button checkButton = new Button("check");
		checkButton.setMinSize(75, 75);
		Button newButton = new Button("new"); 
		newButton.setMinSize(75, 75);
		
		GridPane gp = new GridPane();
		
		TextField answerBox = new TextField();
		VBox LeftVBox = new VBox(checkButton, newButton);
		VBox MiddleVBox = new VBox(20, solveThis, add);
		VBox BottomVBox = new VBox(20, number1, number2, dashes, answerBox, result);
		gp.add(LeftVBox, 0, 1);
	
		BorderPane borderPane = new BorderPane();
		
		borderPane.setLeft(LeftVBox);
		borderPane.setCenter(MiddleVBox);
		borderPane.setRight(BottomVBox);
		
		
		
		  checkButton.setOnAction(p -> {
			int trueAnswer = Integer.parseInt(answerBox.getText());
			int trueNum1 = Integer.parseInt(number1.getText());
			int trueNum2 = Integer.parseInt(number2.getText());
			
			if(trueAnswer == trueNum1 + trueNum2)
			{
				result.setText("Correct");
			}
			else
			{
				result.setText("Wrong");
			}
		  });
		  
		  newButton.setOnAction(p -> {
			  number1.setText(Integer.toString(random.nextInt(10) + 1));
			  number2.setText(Integer.toString(random.nextInt(10) + 1));
			  answerBox.clear();
		  });
		// Set the alignment for the top and bottom
		Scene scene = new Scene(borderPane);    
		
		primaryStage.setScene(scene);                
		primaryStage.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}