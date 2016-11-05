import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        TextField nameInput = new TextField();

        Button button = new Button("Click me");
        button.setOnAction(e -> isInt(nameInput, nameInput.getText()));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameInput, button);

        primaryStage.setScene(new Scene(layout));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }

    private boolean isInt(TextField input, String message) {
        try {
            int value = Integer.parseInt(input.getText());
            System.out.println("user is " + value);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
        return false;
    }
}
