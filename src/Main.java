import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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

        HBox topMenu = new HBox();
        Button buttonA = new Button(("File"));
        Button buttonB = new Button(("Edit"));
        Button buttonC = new Button(("View"));
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button(("D"));
        Button buttonE = new Button(("E"));
        Button buttonF = new Button(("F"));
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }
}
