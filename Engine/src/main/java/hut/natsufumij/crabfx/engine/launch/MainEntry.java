package hut.natsufumij.crabfx.engine.launch;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Start Engine
public class MainEntry extends Application {

    // Launch Entry
    public static void main(String[] args) {
        launch(args);
    }

    // Start Engine
    @Override
    public void start(Stage stage){
        stage.setWidth(800.0);
        stage.setHeight(600.0);
        Scene scene=new Scene(new Group());
        stage.setScene(scene);
        stage.show();
    }
}
