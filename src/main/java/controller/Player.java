package controller;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player {
    private GraphicsContext context;
    private double xPos;
    private double yPos;
    private Hitbox hitbox;


    public Player(GraphicsContext context, int i) {
        this.context = context;
        this.xPos = i;
        this.yPos = i;

        DrawPlayer();
    }

    private void DrawPlayer() {
        context.setFill(Color.BLUE);
        this.context.fillRect(xPos, yPos, 10, 10);
    }
}
