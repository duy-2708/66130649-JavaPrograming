package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Ứng dụng phép tính-");
			
			TextField txtN1 = new TextField();
			TextField txtN2 = new TextField();
			TextField txtKetQua = new TextField();
			txtKetQua.setEditable(false);
			txtKetQua.setStyle("-fn-text-fill:red; -fn-font-weight: bold;");
//			GridPane
			GridPane gr = new GridPane();
			gr.setAlignment(Pos.CENTER);
			gr.setHgap(10);
			gr.setVgap(15);
			gr.add(new Label("Số thứ nhất: "),0,0);
			gr.add(txtN1, 1, 0);
			gr.add(new Label("Số thứ hai: "), 0, 1);
			gr.add(txtN2,1,1);
			gr.add(new Label("Kết quả: "), 0,2);
			gr.add(txtKetQua, 1, 2);
//			Button
			Button btnSum = new Button("+ Cộng");
			Button btnSub = new Button("- Trừ");
			Button btnMul = new Button("x Nhân");
			Button btnDiv = new Button("/ Chia");
			HBox btnBox = new HBox(10);
			btnBox.setAlignment(Pos.CENTER);
			btnBox.getChildren().addAll(btnSum, btnSub, btnMul,btnDiv);

			btnSum.setOnAction(e-> calculate(txtN1,txtN2,txtKetQua,"+"));
			btnSub.setOnAction(e-> calculate(txtN1,txtN2,txtKetQua,"-"));
			btnMul.setOnAction(e-> calculate(txtN1,txtN2,txtKetQua,"x"));
			btnDiv.setOnAction(e-> calculate(txtN1,txtN2,txtKetQua,"/"));
			
			VBox root = new VBox(20);
			root.setPadding(new Insets(20));
			root.getChildren().addAll(gr,btnBox);
			
			Scene sce = new Scene(root, 400 ,250);
			
			primaryStage.setScene(sce);
			primaryStage.setResizable(false);
			primaryStage.show();
			
		}catch(Exception e) {
            e.printStackTrace();
        }
		
		}
	
	private void calculate(TextField txtN1, TextField txtN2, TextField txtKetQua, String Sovle) {
		// TODO Auto-generated method stub
		try {
			double n1 = Double.parseDouble(txtN1.getText().trim());
			double n2 = Double.parseDouble(txtN2.getText().trim());
			double KetQua= 0 ;
			switch (Sovle) {
			case "+": KetQua = n1 + n2 ;
			break;
			case "-": KetQua = n1 - n2 ;
			break;
			case "x": KetQua = n1 * n2 ;
			break;
			case "/": 
				if(n2 == 0 ) {
					showAlert(Alert.AlertType.WARNING,"Cảnh báo","Không thể chia 0 ");
					txtKetQua.setText("");
					return ;
				}
				KetQua = n1 / n2 ;
				break;
			}
			String normal = String.format("%.4f", KetQua)
                    .replaceAll("0*$", "")
                    .replaceAll("\\.$", "");
            txtKetQua.setText(normal);
			
		}catch(NumberFormatException ex) {
			showAlert(Alert.AlertType.ERROR, "Lỗi dữ liệu", "Vui lòng chỉ nhập số hợp lệ, không để trống hoặc nhập chữ!");
            txtKetQua.setText("");
		}
	}

	private void showAlert(Alert.AlertType alertType, String title ,String message ) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
