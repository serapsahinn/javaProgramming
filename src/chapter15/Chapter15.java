package chapter15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Rectangle;


public class Chapter15 extends Application {

    /*
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Butonları oluştur ve HBox içine koy
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);

        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");

        hBox.getChildren().addAll(btEnlarge, btShrink);

        // Butonlara event handler'ları ata
        btEnlarge.setOnAction(new EnlargeHandler());
        btShrink.setOnAction(new ShrinkHandler());

        // BorderPane ile düzeni oluştur
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        // Sahneyi oluştur ve göster
        Scene scene = new Scene(borderPane, 300, 200);
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Daireyi büyüten handler
    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            circlePane.enlarge();
        }
    }

    // Daireyi küçülten handler
    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            circlePane.shrink();
        }
    }

    // Daireyi tutan özel StackPane sınıfı
    class CirclePane extends StackPane {
        private Circle circle = new Circle(50);

        public CirclePane() {
            getChildren().add(circle);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);
        }

        // Daireyi büyüt
        public void enlarge() {
            circle.setRadius(circle.getRadius() + 5);
        }

        // Daireyi küçült, minimum yarıçap 5 olsun
        public void shrink() {
            double radius = circle.getRadius();
            if (radius > 5) {
                circle.setRadius(radius - 5);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

     */
/*
    @Override
    public void start(Stage stage) throws Exception {
        // HBox oluştur ve butonlar ekle
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");

        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

        // Butonlara anonim event handler ata
        btNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Process New");
            }
        });

        btOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Process Open");
            }
        });

        btSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Process Save");
            }
        });

        btPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Process Print");
            }
        });

        // Scene oluştur, pencereye yerleştir ve göster
        Scene scene = new Scene(hBox, 300, 50);
        stage.setTitle("AnonymousHandlerDemo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
 */

/*
    @Override
    public void start(Stage stage) throws Exception {
        // Dikdörtgen oluştur
        Rectangle rectangle = new Rectangle(100, 60);
        rectangle.setFill(Color.LIGHTBLUE);
        rectangle.setStroke(Color.BLACK);

        // Dikdörtgeni ortalamak için StackPane
        StackPane centerPane = new StackPane(rectangle);

        // Rotate butonu
        Button btRotate = new Button("Rotate"); // Her tıklamada 15 derece artır
        btRotate.setOnAction(e -> {
            rectangle.setRotate(rectangle.getRotate() + 15);
        });

        // BorderPane düzeni
        BorderPane pane = new BorderPane();
        pane.setCenter(centerPane);
        pane.setBottom(btRotate);
        BorderPane.setAlignment(btRotate, javafx.geometry.Pos.CENTER);

        // Sahne ve stage ayarları
        Scene scene = new Scene(pane, 300, 250);
        stage.setTitle("Rotate Rectangle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
 */
@Override
public void start(Stage stage) throws Exception {
    // Daire oluştur
    Circle circle = new Circle(60);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);

    // Daireyi ortalamak için StackPane
    StackPane pane = new StackPane(circle);

    // Mouse basıldığında rengi siyah yap
    circle.setOnMousePressed((MouseEvent e) -> {
        circle.setFill(Color.BLACK);
    });
// Mouse bırakıldığında rengi beyaz yap
    circle.setOnMouseReleased((MouseEvent e) -> {
        circle.setFill(Color.WHITE);
    });

    // Sahne ve pencere ayarları
    Scene scene = new Scene(pane, 300, 250);
   stage.setTitle("Circle Color Change");
    stage.setScene(scene);
    stage.show();
}

    public static void main(String[] args) {
        launch(args);
    }

}










