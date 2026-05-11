package application;
	
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage Stage) {
		Text tex1 = new Text("Email");
		Text tex2 = new Text("Password");
		TextField tf1 = new TextField();
		PasswordField tf2 = new PasswordField();
		Button bt1 = new Button("Submit ");
		Button bt2 = new Button("Clear");
		GridPane gp = new GridPane();
		gp.setMinSize(400,200);
		gp.setPadding(new Insets(10,10,10,10));
		gp.setVgap(5);
		gp.setHgap(5);
		gp.setAlignment(Pos.CENTER);
		gp.add(tex1,0,0);
		gp.add(tf1, 1, 0);
		gp.add(tex2, 0, 1);
		gp.add(tf2,1,1);
		gp.add(bt1,0,2);
		gp.add(bt2, 1, 2);
		
		bt1.setStyle("-fx-background-color: darkslateblue; -fx-background-radius: 15; -fx-text-fill: white;");
		bt2.setStyle("-fx-background-color: darkslateblue; -fx-background-radius: 15; -fx-text-fill: white;");
		tex1.setStyle("-fx-font: normal bold 20px 'serif'; -fx-fill:red ");
		tex2.setStyle("-fx-font: normal bold 20px 'serif' ");
		Scene se = new Scene(gp);
		Stage.setTitle("CSS Example");
		Stage.setScene(se);
		Stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
