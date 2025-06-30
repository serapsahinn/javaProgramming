package chapter16;

import javafx.application.Application;
import javafx.scene.control.Cell;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;

public class TicTacToe extends Application {
    private char whoseTurn = 'X'; // İlk oyuncu 'X'
    private Cell[][] cell = new Cell[3][3]; // 3x3 hücre matrisi
    private Label lblStatus = new Label("X in oynama süresi"); // Durum etiketi
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                pane.add(cell[i][j] = new Cell(), j, i);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lblStatus);

        Scene scene = new Scene(borderPane, 450, 450);
        stage.setTitle("TicTacToe");
        stage.setScene(scene);
        stage.show();
    }

    // Tüm hücreler dolu mu kontrolü
    public boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (cell[i][j].getToken() == ' ')
                    return false;
        return true;
    }

    // Belirtilen oyuncunun kazanıp kazanmadığını kontrol et
    public boolean isWon(char token) {
        for (int i = 0; i < 3; i++)
            if (cell[i][0].getToken() == token &&
                    cell[i][1].getToken() == token &&
                    cell[i][2].getToken() == token)
                return true;
        for (int j = 0; j < 3; j++)
            if (cell[0][j].getToken() == token &&
                    cell[1][j].getToken() == token &&
                    cell[2][j].getToken() == token)
                return true;

        if (cell[0][0].getToken() == token &&
                cell[1][1].getToken() == token &&
                cell[2][2].getToken() == token)
            return true;

        if (cell[0][2].getToken() == token &&
                cell[1][1].getToken() == token &&
                cell[2][0].getToken() == token)
            return true;

        return false;
    }

    // Hücre sınıfı (iç sınıf)
    public class Cell extends Pane {
        private char token = ' ';

        public Cell() {
            setStyle("-fx-border-color: black");
            setPrefSize(2000, 2000);
            setOnMouseClicked(e -> handleMouseClick());
        }
        public char getToken() {
            return token;
        }
        public void setToken(char c) {
            token = c;

            if (token == 'X') {
                Line line1 = new Line(10, 10, getWidth() - 10, getHeight() - 10);
                line1.endXProperty().bind(widthProperty().subtract(10));
                line1.endYProperty().bind(heightProperty().subtract(10));

                Line line2 = new Line(10, getHeight() - 10, getWidth() - 10, 10);
                line2.startYProperty().bind(heightProperty().subtract(10));
                line2.endXProperty().bind(widthProperty().subtract(10));

                getChildren().addAll(line1, line2);
            } else if (token == 'O') {
                Ellipse ellipse = new Ellipse(getWidth() / 2, getHeight() / 2,
                        getWidth() / 2 - 10, getHeight() / 2 - 10);
                ellipse.centerXProperty().bind(widthProperty().divide(2));
                ellipse.centerYProperty().bind(heightProperty().divide(2));
                ellipse.radiusXProperty().bind(widthProperty().divide(2).subtract(10));
                ellipse.radiusYProperty().bind(heightProperty().divide(2).subtract(10));
                ellipse.setStroke(Color.BLACK);
                ellipse.setFill(Color.WHITE);

                getChildren().add(ellipse);
            }
        }

        private void handleMouseClick() {
            if (token == ' ' && whoseTurn != ' ') {
                setToken(whoseTurn);

                if (isWon(whoseTurn)) {
                    lblStatus.setText(whoseTurn + "kazandı! Oyun sona erdi.");
                    whoseTurn = ' ';
                } else if (isFull()) {
                    lblStatus.setText("Oyun sona erdi");
                    whoseTurn = ' ';
                } else {
                    whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                    lblStatus.setText(whoseTurn + "'s turn");
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}

