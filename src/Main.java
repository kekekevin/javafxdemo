import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Bacon", "Ham", "Meatballs");

        choiceBox.setValue("Apples");
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(choiceBox, button);

        primaryStage.setScene(new Scene(layout));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }

    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();

        System.out.println(food);
    }
}
