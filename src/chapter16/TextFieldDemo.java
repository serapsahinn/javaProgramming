package chapter16;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class TextFieldDemo extends RadioButtonDemo{
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5, 5, 5, 5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Yeni bir mesaj girin: "));

        TextField tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);
        pane.setTop(paneForTextField);

        tf.setOnAction(e -> text.setText(tf.getText()));

        return pane;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(getPane(), 450, 200);
        stage.setTitle("TextField Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        TextFieldDemo demo = new TextFieldDemo();
        demo.launch(args);
    }
}
