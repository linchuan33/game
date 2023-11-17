import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private char currentPlayer = 'X';
    private Button[][] buttons = new Button[5][5];

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                Button button = new Button();
                button.setMinSize(50, 50);
                button.setOnAction(e -> handleButtonClick(row, col));
                buttons[row][col] = button;
                grid.add(button, col, row);
            }
        }

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Tic Tac Toe 5x5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(int row, int col) {
        Button button = buttons[row][col];

        if (button.getText().isEmpty()) {
            button.setText(String.valueOf(currentPlayer));
            if (checkForWinner(row, col)) {
                displayWinner();
                // Add logic to restart the game
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    private boolean checkForWinner(int row, int col) {
        // Implement winning condition check here
        // Check horizontal, vertical, and diagonal lines for five consecutive marks
        return false;
    }

    private void displayWinner() {
        // Implement logic to display the winner
    }
}
