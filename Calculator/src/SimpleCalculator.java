import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SimpleCalculator extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane root = new GridPane();
		final String eingabe ="fskfsdngl djkgf sshdjlng sdlghsd";
		
		root.setPadding(new Insets(40));
		root.setVgap(10);
		root.setHgap(10);
		
//		Label label = new Label();
//		root.add(label, 0, 0, 4, 1);
//		label.setText("dfskfsdngl djkgf sshdjlng sdlghsd");
		
		TextField textField = new TextField();
		root.add(textField, 0, 0, 4, 1);
		textField.setText(eingabe);
		textField.setEditable(false);
		
		

	// Adding buttons
		Button button0 = new Button("0");
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		Button button7 = new Button("7");
		Button button8 = new Button("8");
		Button button9 = new Button("9");
		
		Button buttonPlus = new Button("+");
		Button buttonMinus = new Button("-");
		Button buttonTimes = new Button("x");		
		Button buttonDivide = new Button("÷");		
		Button buttonComma = new Button(".");
		Button buttonResult = new Button("=");
		Button buttonBreckLeft = new Button("(");
		Button buttonBreckRight = new Button(")");		
		Button buttonSave = new Button("Save"); //Symbol hinzufügen
		Button buttonDelete = new Button("Del");
		
	//Positioning buttons
		root.add(button0, 0, 5);
		root.add(button1, 0, 4);
		root.add(button2, 1, 4);
		root.add(button3, 2, 4);
		root.add(button4, 0, 3);
		root.add(button5, 1, 3);
		root.add(button6, 2, 3);
		root.add(button7, 0, 2);
		root.add(button8, 1, 2);
		root.add(button9, 2, 2);
		
		root.add(buttonPlus, 3, 5);
		root.add(buttonMinus, 3, 4);
		root.add(buttonTimes, 3, 3);
		root.add(buttonDivide, 3, 2);
		root.add(buttonComma, 1, 5);
		root.add(buttonResult, 2, 5);
		root.add(buttonBreckLeft, 0, 1);
		root.add(buttonBreckRight, 1, 1);		
		root.add(buttonSave, 2, 1);
		root.add(buttonDelete, 3, 1);

	// Set button width and height
		double bWidth = 120;
		double bHeight = 50;
		
		button0.setPrefSize(bWidth, bHeight);
		button1.setPrefSize(bWidth, bHeight);
		button2.setPrefSize(bWidth, bHeight);
		button3.setPrefSize(bWidth, bHeight);
		button4.setPrefSize(bWidth, bHeight);
		button5.setPrefSize(bWidth, bHeight);
		button6.setPrefSize(bWidth, bHeight);
		button7.setPrefSize(bWidth, bHeight);
		button8.setPrefSize(bWidth, bHeight);
		button9.setPrefSize(bWidth, bHeight);
		
		buttonPlus.setPrefSize(bWidth, bHeight);
		buttonMinus.setPrefSize(bWidth, bHeight);
		buttonTimes.setPrefSize(bWidth, bHeight);
		buttonDivide.setPrefSize(bWidth, bHeight);
		buttonComma.setPrefSize(bWidth, bHeight);
		buttonResult.setPrefSize(bWidth, bHeight);
		buttonBreckLeft.setPrefSize(bWidth, bHeight);
		buttonBreckRight.setPrefSize(bWidth, bHeight);
		buttonSave.setPrefSize(bWidth, bHeight);
		buttonDelete.setPrefSize(bWidth, bHeight);
		
	// Set button font and font size		
		button0.setFont(Font.font("Verdana", 20));
		button1.setFont(Font.font("Verdana", 20));
		button2.setFont(Font.font("Verdana", 20));
		button3.setFont(Font.font("Verdana", 20));
		button4.setFont(Font.font("Verdana", 20));
		button5.setFont(Font.font("Verdana", 20));
		button6.setFont(Font.font("Verdana", 20));
		button7.setFont(Font.font("Verdana", 20));
		button8.setFont(Font.font("Verdana", 20));
		button9.setFont(Font.font("Verdana", 20));
		
		buttonPlus.setFont(Font.font("Verdana", 20));
		buttonMinus.setFont(Font.font("Verdana", 20));
		buttonTimes.setFont(Font.font("Verdana", 20));
		buttonDivide.setFont(Font.font("Verdana", 20));
		buttonComma.setFont(Font.font("Verdana", 20));
		buttonResult.setFont(Font.font("Verdana", 20));
		buttonBreckLeft.setFont(Font.font("Verdana", 20));
		buttonBreckRight.setFont(Font.font("Verdana", 20));
		buttonSave.setFont(Font.font("Verdana", 20));
		buttonDelete.setFont(Font.font("Verdana", 20));
		
		
		
		
		
		Scene scene = new Scene(root,600,450);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}



}
