import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        Menu fileMenu = new Menu("File");

        MenuItem newProject = new MenuItem("New Project...");
        newProject.setOnAction(e -> System.out.println("new project"));

        fileMenu.getItems().add(newProject);
        fileMenu.getItems().add(new MenuItem("Open"));
        fileMenu.getItems().add(new MenuItem("Import Project..."));

        fileMenu.getItems().add(new SeparatorMenuItem());

        fileMenu.getItems().add(new MenuItem("Settings..."));

        fileMenu.getItems().add(new SeparatorMenuItem());

        fileMenu.getItems().add(new MenuItem("Exit..."));

        Menu editMenu = new Menu("_Edit");
        editMenu.getItems().add(new MenuItem("Cut"));
        editMenu.getItems().add(new MenuItem("Copy"));

        MenuItem pasteMenuItem = new MenuItem("Paste");
        pasteMenuItem.setOnAction(e -> System.out.println("pasting stuff"));
        pasteMenuItem.setDisable(true);
        editMenu.getItems().add(pasteMenuItem);

        Menu helpMenu = new Menu("Help");
        CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
        showLines.setOnAction(e -> {
            if (showLines.isSelected()) {
                System.out.println("showing line numbers");
            }
        });
        CheckMenuItem autoSave = new CheckMenuItem("Enable autosave");
        autoSave.setSelected(true);
        helpMenu.getItems().addAll(showLines, autoSave);

        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggle = new ToggleGroup();

        RadioMenuItem easy = new RadioMenuItem("Easy");
        RadioMenuItem medium = new RadioMenuItem("Medium");
        RadioMenuItem hard = new RadioMenuItem("Hard");

        easy.setToggleGroup(difficultyToggle);
        medium.setToggleGroup(difficultyToggle);
        hard.setToggleGroup(difficultyToggle);

        difficultyMenu.getItems().addAll(easy, medium, hard);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.getChildren().addAll();

        primaryStage.setScene(new Scene(layout));
        primaryStage.setTitle("title goes here");

        primaryStage.show();
    }
}
