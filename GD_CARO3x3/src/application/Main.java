package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	private boolean isXTurn = true;           
	private boolean isGameOver = false;       
	private int[][] board = new int[3][3];    
	private Button[][] buttons = new Button[3][3]; 
	private Text txtStatus;                   

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			root.setPadding(new Insets(15));

			txtStatus = new Text("Lượt của: X");
			txtStatus.setFont(Font.font("Arial", FontWeight.BOLD, 22));
			BorderPane.setAlignment(txtStatus, Pos.CENTER);
			root.setTop(txtStatus); 

			GridPane grid = new GridPane();
			grid.setAlignment(Pos.CENTER);
			grid.setHgap(5); 
			grid.setVgap(5); 
			grid.setPadding(new Insets(20, 0, 20, 0));

			for (int i = 0; i < 3; i++) { 
				for (int j = 0; j < 3; j++) { 
					Button btn = new Button("");
					btn.setPrefSize(100, 100); 
					btn.setFont(Font.font("Arial", FontWeight.BOLD, 40)); 
					
					final int row = i;
					final int col = j;
					
					btn.setOnAction(e -> handleButtonClick(row, col));
					
					buttons[row][col] = btn; 
					grid.add(btn, col, row); 
				}
			}
			root.setCenter(grid); 

			Button btnReset = new Button("Chơi Lại");
			btnReset.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 10;");
			btnReset.setPrefSize(120, 40);
			btnReset.setOnAction(e -> resetGame()); 
			BorderPane.setAlignment(btnReset, Pos.CENTER);
			root.setBottom(btnReset);

			Scene scene = new Scene(root, 400, 500); 
			
			primaryStage.setTitle("Game Caro 3x3");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void handleButtonClick(int row, int col) {
		if (isGameOver || board[row][col] != 0) {
			return; 
		}

		if (isXTurn) {
			board[row][col] = 1; 
			buttons[row][col].setText("X"); 
			buttons[row][col].setTextFill(Color.RED);
			txtStatus.setText("Lượt của: O");
		} else {
			board[row][col] = 2;
			buttons[row][col].setText("O");
			buttons[row][col].setTextFill(Color.BLUE);
			txtStatus.setText("Lượt của: X");
		}

		checkWinner();
		
		if (!isGameOver) {
			isXTurn = !isXTurn;
		}
	}

	private void checkWinner() {
		int winner = 0; 

		for (int i = 0; i < 3; i++) {
			if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) winner = board[i][0];
			if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) winner = board[0][i];
		}

		if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) winner = board[0][0];
		if (board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) winner = board[0][2];

		if (winner != 0) {
			isGameOver = true;
			txtStatus.setText((winner == 1 ? "X" : "O") + " CHIẾN THẮNG!");
			txtStatus.setFill(Color.GREEN);
		} else {
			boolean isTie = true;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == 0) isTie = false; 
				}
			}
			if (isTie) {
				isGameOver = true;
				txtStatus.setText("TRẬN NÀY HÒA!");
				txtStatus.setFill(Color.ORANGE);
			}
		}
	}

	private void resetGame() {
		isXTurn = true;
		isGameOver = false;
		txtStatus.setText("Lượt của: X");
		txtStatus.setFill(Color.BLACK); 

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = 0;
				buttons[i][j].setText("");
			}
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}