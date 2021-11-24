package controller;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

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
    private GraphicsContext context;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create a new scene
        primaryStage.setTitle("Dungeon Project");
        BorderPane root = new BorderPane();
        Scene mainScene = new Scene(root, 800, 600);
        primaryStage.setScene(mainScene);

        // Create a canvas to draw on
        Canvas canvas = new Canvas(750, 550);
        context = canvas.getGraphicsContext2D();
        root.setCenter(canvas);

        context.setFill(Color.BLACK);
        context.fillRect(0, 0, 750, 550);

        primaryStage.show();
        ArrayList<String> inputs = new ArrayList<>();

        mainScene.setOnKeyPressed(
            (KeyEvent event) -> {
                String code = event.getCode().toString();
                if (!inputs.contains(code)) {
                    inputs.add(code);
                }
            }
        );
        mainScene.setOnKeyReleased(
            (KeyEvent event) -> {
                String code = event.getCode().toString();
                inputs.remove(code);
            }
        );

        Player player = new Player(this.context);
        Wall wall = new Wall(this.context);

        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {

                player.update(inputs, wall);

                context.setFill(Color.BLACK);
                context.fillRect(0, 0, 750, 550);
                player.render(context);
                wall.render(context);
            }
        };

        gameLoop.start();
    }
}
