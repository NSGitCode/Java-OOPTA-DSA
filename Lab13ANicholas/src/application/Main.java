package application;
	
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * OOPDA Lab13A: "LambdaGUI" String Manipulation using Lambdas
 *     **This is starting code for the lab **
 * 
 * In this exercise, you will add Lambda expressions to facilitate 
 * the needed operations to transform a String value:
 *    a) make lower case
 *    b) make upper case
 *    c) reverse the characters
 * You will also add code to invoke the Lambda expressions to
 * actually transform the two GUI controls containing text.  
 * 
 * Note on use of "static" 
 *    The static qualifiers aren't required anywhere in
 *    this code to allow functionality.  However, they
 *    have been used to signify that if we apply the
 *    "Single Responsibility Principle", the Lambda 
 *    expressions could be moved to a separate
 *    class such as "OOPDA_StringTransformations" and 
 *    invoked in the same way we use Math.sqrt()  
 * 
 *
 */

/*     
 * Lab13_ANicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor, with some help
 * from my classmates, while the rest were all of my own.
 * 
 * Purpose: Editing an existing project using lambdas to change strings.
 * 
 * @author (Nicholas Sin)
 * @version (04/18/2023)
 */


@SuppressWarnings("unused")
public class Main extends Application {
	// The input and output components
	private  TextField txtStatement = new TextField("          ");
	private  TextField txtResponse = new TextField("Your response will appear here");

	// These buttons each invoke Function<String, String>
	private Button btnLower;  
	private Button btnUpper;   
	private Button btnBackwards; 

	private BorderPane root;  

	//--------------------------------------------
	//ADD the 3 static Lambda Expressions HERE
	 
	Function<String,String> makeLow = x -> x.toLowerCase();
	Function<String,String> makeUpper = x -> x.toUpperCase();
	Function<String,String> makeRev = x -> {
		// get text and reverse it.
		 String result = "";
	       for(int i = x.length() - 1; i >= 0; i--) {
	           result += x.charAt(i);
	       }
	       return result;
	};
	
	
	
	//--------------------------------------------

	@Override
	public void start(Stage primaryStage) {

		root = new BorderPane();
		setup();

		Scene scene = new Scene(root,300,150);
		primaryStage.setScene(scene);
		primaryStage.show();

	} //end start()

	private void setup() {

		Label lblInstructions = new Label("Enter a statement to evaluate: ");

		VBox pnlData = new VBox(10, lblInstructions, txtStatement, txtResponse);
		btnLower = new Button("Lower Case");
		btnUpper = new Button("Upper Case");
		btnBackwards = new Button("Backwards");
		
		//--------------------------------------------
        //add setOnAction(..) method calls 
		//  to the three buttons HERE:
		 
		btnLower.setOnAction(p-> txtResponse.setText(makeLow.apply(txtStatement.getText())));
			     
		btnUpper.setOnAction(e -> txtResponse.setText(makeUpper.apply(txtStatement.getText())));
		
		btnBackwards.setOnAction(f -> txtResponse.setText(makeRev.apply(txtStatement.getText())));
		
		//--------------------------------------------
		
		HBox pnlButtons = new HBox(10, btnLower, btnUpper, btnBackwards);
		pnlButtons.setAlignment(Pos.CENTER);

		root.setBottom(pnlButtons);
		root.setCenter(pnlData);
	}


	public static void main(String[] args) {
		launch(args);
	}

} //end Application

