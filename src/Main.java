import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
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

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonClicked(listView));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(listView, button);

        primaryStage.setScene(new Scene(layout));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }

    private void buttonClicked(ListView<String> listView) {
        String message = "";
        ObservableList<String> movies;

        movies = listView.getSelectionModel().getSelectedItems();

        for (String m : movies) {
            message += m + "\n";
        }
        System.out.println(message);
    }

    private void printMovie(ComboBox<String> comboBox) {
        System.out.println(comboBox.getValue());
    }
}
