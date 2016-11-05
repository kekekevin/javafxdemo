import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Button button = new Button("pick me!");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Good Will Hunting", "St. Vincent", "Blackhat");
        comboBox.setPromptText("What is your favorite movie?");
        button.setOnAction(e -> printMovie(comboBox));
        comboBox.setOnAction(e -> System.out.println("user selected: " + comboBox.getValue()));
        comboBox.setEditable(true);

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(comboBox, button);

        primaryStage.setScene(new Scene(layout));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }

    private void printMovie(ComboBox<String> comboBox) {
        System.out.println(comboBox.getValue());
    }
}
