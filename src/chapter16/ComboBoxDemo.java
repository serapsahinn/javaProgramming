package chapter16;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
public class ComboBoxDemo extends Application
{
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
    private String[] flagDescription = new String[9];

    // Açıklama paneli
    private DescriptionPane descriptionPane = new DescriptionPane();

    // ComboBox
    private ComboBox<String> cbo = new ComboBox<>();
    @Override
    public void start(Stage stage) throws Exception {

        flagDescription[0] = "TÜRKİYE ...";
        flagDescription[1] = "ALMANYA ... ";
        flagDescription[2] = "ABD... ";
        flagDescription[3] = "İTALYA ... ";
        flagDescription[4] = "AZERBEYCAN ... ";

        setDisplay(0);

        // Arayüzü oluştur
        BorderPane pane = new BorderPane();

        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        pane.setTop(paneForComboBox);

        cbo.setPrefWidth(400);
        cbo.setValue("Canada");

        ObservableList<String> items = FXCollections.observableArrayList(flagTitles);
        cbo.getItems().addAll(items);

        pane.setCenter(descriptionPane);

        // Seçim değiştiğinde görüntüyü güncelle
        cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
        // Sahneyi göster
        Scene scene = new Scene(pane, 450, 170);
        stage.setTitle("ComboBoxDemo");
        stage.setScene(scene);
       stage.show();
    }

    public void setDisplay(int index) {
        descriptionPane.setTitle(flagTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
