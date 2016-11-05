import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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

        TreeItem<String> root, bucky, megan;

        root = new TreeItem<>();
        root.setExpanded(true);

        bucky = makeBranch("Bucky", root);
        makeBranch("thenewboston", bucky);
        makeBranch("YouTube", bucky);
        makeBranch("Chicken", bucky);

        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);

        TreeView<String> tree = new TreeView<>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue);
            }

        });

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(button);
        layout.getChildren().add(tree);

        primaryStage.setScene(new Scene(layout));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }

    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> treeItem = new TreeItem<>(title);
        treeItem.setExpanded(true);
        parent.getChildren().add(treeItem);

        return treeItem;
    }
}
