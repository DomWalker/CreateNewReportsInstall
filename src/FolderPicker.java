/**
 * Created by DWalker on 2014-12-31.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import java.io.File;


public class FolderPicker extends Application {
    String selectedPath;
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Label labelSelectedDirectory = new Label();

        Button openDirectoryButton = new Button("Open Directory Chooser");
        Button cancelButton = new Button("Cancel");
        openDirectoryButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                DirectoryChooser directoryChooser = new DirectoryChooser();
                File selectedDirectory = directoryChooser.showDialog(primaryStage);
                if (selectedDirectory == null) {
                    labelSelectedDirectory.setText("No Directory Selected");
                } else {
                    labelSelectedDirectory.setText(selectedDirectory.getAbsolutePath());
                    String selectedPath = selectedDirectory.getAbsolutePath();
                }
            }
        });


        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(labelSelectedDirectory, openDirectoryButton, cancelButton);
        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        ;

        Scene scene = new Scene(root, 150 ,150);

        primaryStage.setTitle("New Reports Installer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);

    }
}
