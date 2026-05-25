package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		 Text txtTitle = new Text("App BMI ");
		 txtTitle.setStyle("-fx-font: normal bold 24px 'serif'; -fx-fill: darkslateblue;");
		 Text txtWeight = new Text("Can nang: ");
		 TextField tfWeight = new TextField();
		 tfWeight.setPromptText("Vd:65");
		 
		 Text txtHeight = new Text("Chieu cao: ");
		 TextField tfHeight = new TextField();
		 tfHeight.setPromptText("Vd:1.75");
		 
		 Button btnCal = new Button("Tinh toan");
		 Button btnClear = new Button("Xoa ");
		 
		 Text txtKetQua = new Text("Ket qua: ");
		 txtKetQua.setStyle("-fx-font: normal bold 16px 'serif'; -fx-fill: dimgray;");
		 
		 GridPane gp = new GridPane();
		 gp.setMinSize(400,250);
		 gp.setPadding(new Insets(20));
		 gp.setVgap(10);
		 gp.setHgap(15);
		 gp.setAlignment(Pos.CENTER);
		 
		 gp.add(txtTitle, 0, 0, 2,1);
		 gp.add(txtWeight, 0, 1);
		 gp.add(tfWeight, 1, 1);
		 gp.add(txtHeight, 0, 2);
		 gp.add(tfHeight, 1, 2);
		 gp.add(btnCal, 0, 3);
		 gp.add(btnClear, 1, 3);
		 gp.add(txtKetQua, 0, 4,2,1);
		 
		 btnCal.setOnAction(e->
		 {	try {
			 double w = Double.parseDouble(tfWeight.getText());
			 double h = Double.parseDouble(tfHeight.getText());
			 if(h > 3 ) {
				 h = h /100 ;
			 }
			 double bmi = w /(h *h );
			 String status = "";
			 if(bmi < 18.5) {
				 status =" Gay`";
				 txtKetQua.setFill(Color.BLUE);
			 }else if( bmi >= 18.5 && bmi <= 24.9) {
				 status="Can doi' ";
				 txtKetQua.setFill(Color.GREEN);
			 }else {
				 status = "Beo'";
				 txtKetQua.setFill(Color.RED);
			 }
			 txtKetQua.setText(String.format("BMI: %.1f\nDanh Gia: %s",bmi,status));
		 } catch(NumberFormatException ex) {
					txtKetQua.setFill(Color.RED);
		            txtKetQua.setText("Lỗi: Vui lòng chỉ nhập số!");
		 }
		 }
		 );
		btnClear.setOnAction(e->{
			tfWeight.clear();
			tfHeight.clear();
			txtKetQua.setText("Ket qua o day ");
			txtKetQua.setFill(Color.DIMGRAY);
		});
		Scene sce = new Scene(gp);
		primaryStage.setTitle("TINH BMI ");
		primaryStage.setScene(sce);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
