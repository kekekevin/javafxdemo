import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Scene scene1;
    Scene scene2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Yo dawg");
        button1.setOnAction(e -> AlertBox.display("title of alert box", "alert box is amazing"));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("title goes here");
        primaryStage.show();
    }
}
