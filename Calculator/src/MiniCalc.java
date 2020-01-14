import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MiniCalc extends Application{

	String eingabe ="";
	int var1;
	int var2;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		root.setPadding(new Insets(20));
		root.setSpacing(20);
		
		
		
	// Ergebnisfeld ergänzen
		Label label = new Label();
		label.setFont(Font.font("Verdana",FontWeight.BOLD,25));
		label.setText(eingabe);
		
		
	// Spalten ergänzen
		HBox hBox1 = new HBox();	
		HBox hBox2 = new HBox();
			
		root.getChildren().addAll(label,hBox1, hBox2);
		hBox1.setSpacing(20);
		hBox2.setSpacing(20);
	
	// Buttons ergänzen (je Spalte bzw VBox)
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button buttonPlus = new Button("+");
		Button buttonTimes = new Button("x");
		Button buttonResult = new Button("=");
		Button buttonClear = new Button("Clear");
		
		hBox1.getChildren().addAll(buttonPlus, buttonTimes, buttonClear);
		hBox2.getChildren().addAll(button1, button2, buttonResult);
		
	// Set button width and height
		double bWidth = 120;
		double bHeight = 50;
		
		button1.setPrefSize(bWidth, bHeight);
		button2.setPrefSize(bWidth, bHeight);
		buttonPlus.setPrefSize(bWidth, bHeight);
		buttonTimes.setPrefSize(bWidth, bHeight);
		buttonResult.setPrefSize(bWidth, bHeight);
		buttonClear.setPrefSize(bWidth, bHeight);

	// Set button font and font size
		button1.setFont(Font.font("Verdana", 20));
		button2.setFont(Font.font("Verdana", 20));
		buttonPlus.setFont(Font.font("Verdana", 20));
		buttonTimes.setFont(Font.font("Verdana", 20));
		buttonResult.setFont(Font.font("Verdana", 20));
		buttonClear.setFont(Font.font("Verdana", 20));
		
	
		
		
		
	// Eventhandling
		button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				return1();	//gibt int-Wert 1 zurück
				final String but1 = "1";
				eingabe = eingabe + but1;
				label.setText(eingabe);
				
			}			
		});
		
		button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				return2();
				final String but2 = "2";
				eingabe = eingabe + but2;
				label.setText(eingabe);
			}			
		});
		
		buttonResult.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {

				//final String butRes = "=";
				eingabe = eingabe ;
				label.setText(eingabe);
				System.out.println(eingabe);
			}			
		});
		
		buttonPlus.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final String butPlu = "+";
				eingabe = eingabe + butPlu;
				label.setText(eingabe);
			}			
		});
		
		buttonTimes.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				final String butTim = "*";
				eingabe = eingabe + butTim;
				label.setText(eingabe);
			}			
		});
		
		buttonClear.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				eingabe="";
				label.setText(eingabe);

			}			
		});
		
		Scene scene = new Scene(root,400,220);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	int return1() {
		return 1;
	}
	
	int return2() {
		return 2;
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}

}
