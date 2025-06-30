package chapter16;

import javafx.application.Application;
 import javafx.stage.Stage;
 import javafx.scene.Scene;
 import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application
{

    @Override
    public void start(Stage stage) throws Exception {
        DescriptionPane descriptionPane = new DescriptionPane();

        descriptionPane.setTitle("TÜRKİYE");
        String description = "BAYRAĞIMIZ";
        descriptionPane.setImageView(new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/640px-Flag_of_Turkey.svg.png"));
        descriptionPane.setDescription(description);


        Scene scene = new Scene(descriptionPane, 600, 300);
        stage.setTitle("TextAreaDemo");
       stage.setScene(scene);
       stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
