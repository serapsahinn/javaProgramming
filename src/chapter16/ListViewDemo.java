package chapter16;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
public class ListViewDemo extends Application {
    private String[] flagTitles = {
            "Türkiye", "Almanya", "ABD", "italya", "Azerbaycan",

    };
    private ImageView[] flagImage = {
            new ImageView("https://www.flagcolorcodes.com/data/flag-of-turkey.png"),
            new ImageView("https://flagcolorcodes.com/data/flag-of-germany.png"),
            new ImageView("https://www.flagcolorcodes.com/data/flag-of-turkey.png"),
            new ImageView("https://flagcolorcodes.com/data/flag-of-italy.png"),
            new ImageView("https://www.flagcolorcodes.com/data/flag-of-turkey.png"),
    };

    @Override
    public void start(Stage stage) throws Exception {
        ListView<String> lv = new ListView<>(
                FXCollections.observableArrayList(flagTitles)
        );
        lv.setPrefSize(400, 400);
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        FlowPane imagePane = new FlowPane(10, 10);
        BorderPane pane = new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(imagePane);

        lv.getSelectionModel().selectedItemProperty().addListener(
                ov -> {
                    imagePane.getChildren().clear();
                    for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
                        imagePane.getChildren().add(flagImage[i]);
                    }
                }
        );

        Scene scene = new Scene(pane, 450, 170);
        stage.setTitle("ListViewDemo");
        stage.setScene(scene);
       stage.show();

    }
}
