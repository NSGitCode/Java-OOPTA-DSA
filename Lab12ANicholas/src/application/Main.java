/*     
 * Lab12_ANicholas 
 * 
 * Student: Nicholas Sin 
 * Attribution: Some of the code were provided by the professor,
 * while the rest were all of my own.
 * 
 * Purpose: Creating a button with JavaFX
 * 
 * @author (Nicholas Sin)
 * @version (04/10/2023)
 */
package application;  
import javafx.application.Application; 
import javafx.geometry.Pos; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.layout.HBox; 

public class Main extends Application {
	private Label label;     
	private Button pressMe; 
	@Override
	public void start(Stage primaryStage) {
		try {
			label = new Label("Press the Button");                
			pressMe = new Button("Press Me");                           
			HBox root = new HBox(20, label, pressMe);                 
			pressMe.setOnAction(e -> {                          
				if (label.getText().equals("Press the Button")) {                 
					label.setText("Thanks for clicking");                
					label.setStyle("-fx-background-color: orange;");             
				} else {                                  
					label.setText("Press the Button");                 
					label.setStyle("-fx-background-color: transparent;");             
				}         
			});                          
			root.setAlignment(Pos.CENTER);                           
			Scene scene = new Scene(root, 300, 200);         
			primaryStage.setScene(scene);         
			primaryStage.setTitle("OOPDA Lab 13A");         
			primaryStage.show();     
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}