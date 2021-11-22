package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class App extends Application {
    /*

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception if something goes wrong
     */
    Button playingButton;
    Button scoreButton;
    Button exitButton;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create a new scene
        primaryStage.setTitle("Dungeon Project");
        BorderPane root = new BorderPane();
        Scene mainScene = new Scene(root, 800, 600);
        primaryStage.setScene(mainScene);

        // Create a canvas to draw on
        Canvas canvas = new Canvas(750, 550);
        GraphicsContext context = canvas.getGraphicsContext2D();
        root.setCenter(canvas);

        context.setFill(Color.BLACK);
        context.fillRect(0, 0, 750, 550);

        Play room = new Play(context);

        primaryStage.show();
    }
}
