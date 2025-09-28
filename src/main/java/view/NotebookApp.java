package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NotebookApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the GUI from the FXML file in resources
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/notes_view.fxml"));
        Parent root = loader.load();

        // Set up the window (Stage)
        primaryStage.setTitle("Simple Note-Taking App");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }

    // Main method to launch the app
    public static void main(String[] args) {
        launch(args);
    }
}
