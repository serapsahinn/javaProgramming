package chapter14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;


public class Chapterr14 extends Application
{
   /* @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("OK");
        Scene scene = new Scene(btn, 200, 100);

        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();
    }

    */
   /* @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        Scene scene = new Scene(pane, 200, 50);
        stage.setTitle("Button");
        stage.setScene(scene);
        stage.show();
    }

    */
 /* @Override
  public void start(Stage stage) throws Exception
   {//iç içe ikitane
            Scene scene = new Scene(new Button("OK"), 200, 250);
            stage.setTitle("MyJavaFX");
            stage.setScene(scene);
            stage.show();

            Stage stages = new Stage();
            stages.setTitle("ikinci Stage");
            stages.setScene(new Scene(new Button("New Stage"), 100, 100));
            stages.show();
   }

  */
/*
   @Override
   public void start(Stage stage) throws Exception {

       Pane pane=new Pane();
       Circle circle= new Circle();
       circle.centerXProperty().bind(pane.widthProperty().divide(2));
       circle.centerYProperty().bind(pane.widthProperty().divide(2));
       circle.setRadius(50);
       circle.setStroke(javafx.scene.paint.Color.rgb(1,25,80));
       circle.setFill(Color.rgb(25,54,85));
       pane.getChildren().add(circle);

       Scene scene= new Scene(pane, 200,200);
       stage.setTitle("dairee");
       stage.setScene(scene);
       stage.show();
   }

 */
    /*
   @Override
   public void start(Stage stage) throws Exception {
       StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;");
        pane.getChildren().add(btOK);
        pane.setRotate(45);
       pane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("NodeStyleRotateDemo"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
       stage.show();
   }

     */

/*
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new StackPane();

         // Create a circle and set its properties
         Circle circle = new Circle();
         circle.setRadius(50);
         circle.setStroke(Color.BLACK);
         circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
         pane.getChildren().add(circle);

        Label label= new Label("JAVAFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
         pane.getChildren().add(label);

         // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
         stage.setTitle("FontDemo"); // Set the stage title
         stage.setScene(scene);
         stage.show();
    }

 */

/*
    @Override

    public void start(Stage stage) throws Exception {
        Pane pane = new HBox(10);
         pane.setPadding(new Insets(5, 5, 5, 5));
         Image image = new Image("");
         pane.getChildren().add(new ImageView(image));

         ImageView imageView2 = new ImageView(image);
         imageView2.setFitHeight(100);
         imageView2.setFitWidth(100);
         pane.getChildren().add(imageView2);

         ImageView imageView3 = new ImageView(image);
         imageView3.setRotate(90);
         pane.getChildren().add(imageView3);

         Scene scene = new Scene(pane);
          stage.setTitle("ShowImage");
         stage.setScene(scene);
         stage.show();

    }

 */

    public static void main(String[] args)
    {
        Application.launch(args);
    }


/*
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().addAll(
                new Label("AD:"),
                new TextField()
        );
        pane.getChildren().addAll(
                new Label("SOYAD:"),
                new TextField()
        );

        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("ShowFlowPane");
        stage.setScene(scene);
        stage.show();

    }

 */
    /*
@Override
public void start(Stage stage) throws Exception {
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5);

    pane.add(new Label("First Name:"), 0, 0);
    pane.add(new TextField(), 1, 0);
    pane.add(new Label("Last Name:"), 0, 2);
    pane.add(new TextField(), 1, 2);

    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);

    Scene scene = new Scene(pane);
    stage.setTitle("ShowGridPane");
    stage.setScene(scene);
    stage.show();
}

     */

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));

        Scene scene = new Scene(pane);
        stage.setTitle("ShowBorderPane");
        stage.setScene(scene);
        stage.show();
    }
    class CustomPane extends StackPane {
        public CustomPane(String title) {
            getChildren().add(new Label(title));
            setStyle("-fx-border-color: blue");
            setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        }
    }
}
