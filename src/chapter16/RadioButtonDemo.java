package chapter16;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class RadioButtonDemo extends CheckBoxDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        // Farklı font stilleri
        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
        Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
        Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);

        text.setFont(fontNormal);

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-color: green");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        RadioButton rbOrange = new RadioButton("Orange");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbOrange.setToggleGroup(group);

        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue, rbOrange);
        // pane.setRight(paneForRadioButtons);
        pane.setLeft(paneForRadioButtons); 

        EventHandler<ActionEvent> handler = e -> {
            if (rbRed.isSelected()) {
                text.setFill(javafx.scene.paint.Color.RED);
            } else if (rbGreen.isSelected()) {
                text.setFill(javafx.scene.paint.Color.GREEN);
            } else if (rbBlue.isSelected()) {
                text.setFill(javafx.scene.paint.Color.BLUE);
            } else if (rbOrange.isSelected()) {
                text.setFill(javafx.scene.paint.Color.ORANGE);
            }
        };

        rbRed.setOnAction(handler);
        rbGreen.setOnAction(handler);
        rbBlue.setOnAction(handler);
        rbOrange.setOnAction(handler);

        return pane;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(getPane(), 450, 200);
        stage.setTitle("RadioButton Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        RadioButtonDemo demo = new RadioButtonDemo();
        demo.launch(args);
    }
}
