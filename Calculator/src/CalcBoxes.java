import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CalcBoxes extends Application{


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox root = new VBox();
		Group group = new Group();
		final String eingabe ="fskfsdngl djkgf sshdjlng sdlghsd";
		
		// Ergebnisfeld ergänzen
		TextField textField = new TextField();

		root.setPadding(new Insets(20));
		
		textField.setFont(Font.font("Verdana",FontWeight.BOLD,20));
		textField.setText(eingabe);
		textField.setEditable(false);
		
		// Spalten ergänzen
		HBox hBox = new HBox();	
		root.getChildren().addAll(textField,hBox);
		hBox.setSpacing(20);
			
		
		// Zeilen zu Spalten ergänzen
		VBox vBox1 = new VBox();
		VBox vBox2 = new VBox();
		VBox vBox3 = new VBox();
		VBox vBox4 = new VBox();
		VBox vBox5 = new VBox();
		
		vBox1.setSpacing(10);
		vBox2.setSpacing(10);
		vBox3.setSpacing(10);
		vBox4.setSpacing(10);
		vBox5.setSpacing(10);


		
		
		// Buttons ergänzen (je Spalte bzw VBox)
		Button buttonBreckLeft = new Button("(");
		Button button7 = new Button("7");
		Button button4 = new Button("4");
		Button button1 = new Button("1");
		Button button0 = new Button("0");
		vBox1.getChildren().addAll(buttonBreckLeft, button7, 
				button4, button1, button0);

		Button buttonBreckRight = new Button(")");
		Button button8 = new Button("8");
		Button button5 = new Button("5");
		Button button2 = new Button("2");
		Button buttonComma = new Button(".");
		vBox2.getChildren().addAll(buttonBreckRight, button8, 
				button5, button2, buttonComma);
		
		Button buttonSave = new Button(")");
		Button button9 = new Button("9");
		Button button6 = new Button("6");
		Button button3 = new Button("3");
		Button buttonResult = new Button("=");
		vBox3.getChildren().addAll(buttonSave, button9, 
				button6, button3, buttonResult);
		
		Button buttonDelete = new Button("Del");
		Button buttonDivide = new Button("÷");
		Button buttonTimes = new Button("x");
		Button buttonMinus = new Button("-");
		Button buttonPlus = new Button("+");
		vBox4.getChildren().addAll(buttonDelete, buttonDivide, 
				buttonTimes, buttonMinus, buttonPlus);
		
		
		hBox.getChildren().addAll(vBox1, vBox2,vBox3, vBox4);
		
		
		
		
		Scene scene = new Scene(root,600,450);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);

	}
}
